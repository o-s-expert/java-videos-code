package expert.os.examples.entity;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {

    private Long id;

    private String name;

    private String email;

}
