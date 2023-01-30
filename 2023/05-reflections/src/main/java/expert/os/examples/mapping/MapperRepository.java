package expert.os.examples.mapping;

import java.lang.reflect.Proxy;
import java.util.Map;

public interface MapperRepository {

    <T> T entity(Map<String, Object> map);
    <T> Map<String, Object>  map(T entity);

    static MapperRepository repository() {
        return (MapperRepository) Proxy.newProxyInstance(
                MapperRepository.class.getClassLoader(),
                new Class[] { Map.class },
                new MapperInvocationHandler());
    }
}
