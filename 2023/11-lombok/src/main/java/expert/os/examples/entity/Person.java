package expert.os.examples.entity;


import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Builder
@Data
public class Person {

    private Long id;

    private String name;

    private String email;

    public Person(Long id, String name, String email) {
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.email = email;
    }
}
