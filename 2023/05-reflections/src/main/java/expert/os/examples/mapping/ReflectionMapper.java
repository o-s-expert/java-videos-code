package expert.os.examples.mapping;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class ReflectionMapper implements Mapper {
    @Override
    public <T> Map<String, Object> toMap(T entity) {
        Objects.requireNonNull(entity, "entity is required");
        Map<String, Object> map = new HashMap<>();
        map.put("_entity", entity.getClass().getName());
        for (Field field : entity.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value = getValue(entity, field);
            Optional<Column> column = Optional.ofNullable(field.getAnnotation(Column.class));
            if(value != null && column.isPresent()) {
                String key = column.map(Column::value).filter(Predicate.not(String::isBlank))
                        .orElse(field.getName());
                map.put(key, value);
            }
        }
        return map;
    }

    @Override
    public <T> T toEntity(Map<String, Object> map) {
        Objects.requireNonNull(map, "map is required");
        return null;
    }

    private <T> Object getValue(T entity, Field field) {
        Object value;
        try {
            value = field.get(entity);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

}
