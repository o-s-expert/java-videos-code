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
        mapper = new ModelMapper();
        Converter<String, UUID> converter = new AbstractConverter<>() {
            @Override
            protected UUID convert(String s) {
                return UUID.fromString(s);
            }
        };

        Converter<String, LocalDate> converterDate = new AbstractConverter<>() {
            @Override
            protected LocalDate convert(String s) {
                return LocalDate.parse(s);
            }
        };
        this.mapper.addConverter(converter);
        this.mapper.addConverter(converterDate);
        TypeMap<DeliveryDTO, Delivery> typeMap = this.mapper.createTypeMap(DeliveryDTO.class, Delivery.class);
        typeMap.addMappings(mapper -> mapper.using(converter).map(DeliveryDTO::getId, Delivery::setTrackId));
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

    }

    @Test
    public void shouldConvertToDTO(){
        Delivery delivery = new Delivery(UUID.randomUUID(),
                LocalDate.now(), "Salvador", "Brazil");

        DeliveryDTO dto = this.mapper.map(delivery, DeliveryDTO.class);

        SoftAssertions.assertSoftly(soft -> {
            soft.assertThat(dto).isNotNull();
            soft.assertThat(dto.getCity()).isEqualTo(delivery.getCity());
            soft.assertThat(dto.getCountry()).isEqualTo(delivery.getCountry());
            soft.assertThat(dto.getId()).isEqualTo(delivery.getTrackId().toString());
            soft.assertThat(dto.getWhen()).isEqualTo(delivery.getWhen().toString());
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
            soft.assertThat(entity.getCity()).isEqualTo(dto.getCity());
            soft.assertThat(entity.getCountry()).isEqualTo(dto.getCountry());
        });
    }

}