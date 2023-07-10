package expert.os.examples;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.config.Configuration;

import java.time.LocalDate;
import java.util.UUID;

class DeliveryMapperTest {

    private ModelMapper mapper;

    @BeforeEach
    public void set() {
        this.mapper = new ModelMapper();

        this.mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

        Converter<String, UUID> uuidConverter = new AbstractConverter<>() {
            @Override
            protected UUID convert(String source) {
                return UUID.fromString(source);
            }
        };

        Converter<String, LocalDate> localDateConverter = new AbstractConverter<>() {
            @Override
            protected LocalDate convert(String source) {
                return LocalDate.parse(source);
            }
        };

        this.mapper.addConverter(uuidConverter);
        this.mapper.addConverter(localDateConverter);

        TypeMap<DeliveryDTO, Delivery> typeMap = this.mapper.createTypeMap(DeliveryDTO.class, Delivery.class);
        typeMap.addMappings(mapping -> mapping.using(uuidConverter).map(DeliveryDTO::id, Delivery::setTrackId));


    }

    @Test
    public void shouldConvertToDTO(){
        Delivery delivery = new Delivery(UUID.randomUUID(),
                LocalDate.now(), "Salvador", "Brazil");

        DeliveryDTO dto = this.mapper.map(delivery, DeliveryDTO.class);

        SoftAssertions.assertSoftly(soft -> {
            soft.assertThat(dto).isNotNull();
            soft.assertThat(dto.city()).isEqualTo(delivery.getCity());
            soft.assertThat(dto.country()).isEqualTo(delivery.getCountry());
            soft.assertThat(dto.id()).isEqualTo(delivery.getTrackId().toString());
            soft.assertThat(dto.when()).isEqualTo(delivery.getWhen().toString());
        });
    }

    @Test
    public void shouldConvertToEntity(){
        var uuid = UUID.randomUUID();
        var now = LocalDate.now();
        DeliveryDTO dto = new DeliveryDTO(uuid.toString(), now.toString(), "Salvador", "Brazil");
        Delivery entity = this.mapper.map(dto, Delivery.class);
        SoftAssertions.assertSoftly(soft ->{
            soft.assertThat(entity.getTrackId()).isEqualTo(uuid);
            soft.assertThat(entity.getWhen()).isEqualTo(now);
            soft.assertThat(entity.getCity()).isEqualTo(dto.city());
            soft.assertThat(entity.getCountry()).isEqualTo(dto.country());
        });
    }

}