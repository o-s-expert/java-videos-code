package expert.os.examples;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DeliveryMapper {

    @Mapping(target = "trackId", source = "id")
    Delivery toEntity(DeliveryDTO dto);

    @Mapping(target = "id", source = "trackId")
    DeliveryDTO toDTO(Delivery entity);
}
