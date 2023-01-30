package expert.os.examples.mapping;

@Entity
@Append(key = "type", value = "Fruit")
@Append(key = "category", value = "Natural")
public class Fruit {

    @Column
    private String name;
}
