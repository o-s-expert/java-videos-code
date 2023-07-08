package expert.os.examples;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface DeliveryMapper {
    DeliveryMapper INSTANCE = Mappers.getMapper(DeliveryMapper.class);

    @Mapping(target = "trackId", source = "id")
    Delivery toEntity(DeliveryDTO dto);

    @Mapping(target = "id", source = "trackId")
    DeliveryDTO toDTO(Delivery entity);
}
