package expert.os.examples.mapping;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class ReflectionMapper implements Mapper{
    @Override
    public <T> Map<String, Object> toMap(T entity) {
        Objects.requireNonNull(entity, "entity is required");

        Map<String, Object> map = new HashMap<>();

        Class<?> type = entity.getClass();
        map.put("_entity", type.getName());

        for (Field field : type.getDeclaredFields()) {
            field.setAccessible(true);

            Optional<Column> column = Optional.ofNullable(field.getAnnotation(Column.class));
            if(column.isPresent()) {
                String key = column.map(Column::value)
                        .filter(Predicate.not(String::isBlank))
                        .orElse(field.getName());
                Object value = getValue(entity, field);
                map.put(key, value);
            }

        }
        return map;
    }

    private static <T> Object getValue(T entity, Field field)  {
        try {
            return field.get(entity);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T toEntity(Map<String, Object> map) {
        return null;
    }
}
