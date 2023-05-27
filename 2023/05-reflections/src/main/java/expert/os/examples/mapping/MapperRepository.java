package expert.os.examples.mapping;

import java.lang.reflect.Proxy;
import java.util.Map;

public interface MapperRepository {

    <T> T entity(Map<String, Object> map);

    <T> Map<String, Object> map(T entity);

    default <T> T wraper(Map<String, Object> map) {
        map.put("version", 1);
        return this.entity(map);
    }

    static MapperRepository repository() {
        return (MapperRepository) Proxy.newProxyInstance(MapperRepository.class.getClassLoader(),
                new Class[]{MapperRepository.class}, new MapperInvocationHandler());
    }
}
