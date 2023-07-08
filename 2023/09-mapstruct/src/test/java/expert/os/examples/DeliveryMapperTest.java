package expert.os.examples;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.util.UUID;

class DeliveryMapperTest {

    private DeliveryMapper mapper;

    @BeforeEach
    public void set() {
        this.mapper = Mappers.getMapper(DeliveryMapper.class);
    }

    @Test
    public void shouldConvertToDTO(){
        Delivery delivery = new Delivery(UUID.randomUUID(),
                LocalDate.now(), "Salvador", "Brazil");

        DeliveryDTO dto = this.mapper.toDTO(delivery);

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
        Delivery entity = this.mapper.toEntity(dto);
        SoftAssertions.assertSoftly(soft ->{
            soft.assertThat(entity.getTrackId()).isEqualTo(uuid);
            soft.assertThat(entity.getWhen()).isEqualTo(now);
            soft.assertThat(entity.getCity()).isEqualTo(dto.city());
            soft.assertThat(entity.getCountry()).isEqualTo(dto.country());
        });
    }

}