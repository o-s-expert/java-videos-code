package expert.os.examples.mapping;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

final class MapperInvocationHandler implements InvocationHandler {

    private Mapper mapper = new ReflectionMapper();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();

        switch (name) {
            case "entity":
                Map<String, Object> maps = (Map<String, Object>) args[0];
                Objects.requireNonNull(maps, "maps is required");
                return mapper.toEntity(maps);
            case "map":
                Object entity = args[0];
                Objects.requireNonNull(entity, "entity is required");
                return mapper.toMap(entity);
        }
      throw new RuntimeException("");
    }
}
