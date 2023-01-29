package expert.os.examples.mapping;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class ReflectionMapper implements Mapper {

    public static final String ENTITY_KEY = "_entity";

    @Override
    public <T> Map<String, Object> toMap(T entity) {
        Objects.requireNonNull(entity, "entity is required");
        Map<String, Object> map = new HashMap<>();
        map.put(ENTITY_KEY, entity.getClass().getName());
        for (Field field : entity.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value = getValue(entity, field);
            Optional<Column> column = Optional.ofNullable(field.getAnnotation(Column.class));
            if (value != null && column.isPresent()) {
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
        T entity = getEntity(map.get(ENTITY_KEY).toString());

        for (Field field : entity.getClass().getDeclaredFields()) {
            Optional<Column> column = Optional.ofNullable(field.getAnnotation(Column.class));
            String key = column.map(Column::value).filter(Predicate.not(String::isBlank))
                    .orElse(field.getName());
            Optional<Object> value = Optional.ofNullable(map.get(key));
            value.ifPresent(v -> setValue(entity, field, v));

        }
        return entity;
    }

    private static <T> void setValue(T entity, Field field, Object value) {
        field.setAccessible(true);
        try {
            field.set(entity, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private <T> T getEntity(String entity) {
        try {
            Class<?> type = Class.forName(entity);
            for (Constructor<?> constructor : type.getConstructors()) {
                if (constructor.getParameterCount() == 0) {
                    return (T) constructor.newInstance();
                }
            }
        } catch (ClassNotFoundException | InvocationTargetException
                 | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        throw new RuntimeException("I should create a better exception");
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
