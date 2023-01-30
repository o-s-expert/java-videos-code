package expert.os.examples.mapping;


@Entity
@Append(key = "type", value = "item")
@Append(key = "price", value = "USD")
public class Fruit {

    @Column
    private String name;

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
