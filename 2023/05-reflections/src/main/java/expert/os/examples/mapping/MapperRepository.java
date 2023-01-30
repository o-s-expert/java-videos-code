package expert.os.examples.mapping;

import java.util.Map;

public interface MapperRepository {

    <T> T entity(Map<String, Object> map);

    <T> Map<String, Object> map(T entity);
}
