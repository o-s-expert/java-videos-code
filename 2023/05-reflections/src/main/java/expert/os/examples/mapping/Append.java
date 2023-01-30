package expert.os.examples.mapping;


import java.lang.annotation.Repeatable;

@Repeatable(Appends.class)
public @interface Append {

    String key();

    String value();
}
