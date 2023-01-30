package expert.os.examples.mapping;


@Entity
@Append(key = "type", value = "item")
@Append(key = "price", value = "USD")
public class Item {

    @Column
    private String name;

    public Item(String name) {
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
