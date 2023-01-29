package expert.os.examples.mapping;

import java.util.Map;

public interface Mapper {

    <T> Map<String, Object> toMap(T entity);

    <T> T toEntity(Map<String, Object> map);
}
