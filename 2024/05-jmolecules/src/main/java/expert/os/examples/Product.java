package expert.os.examples;

import java.util.UUID;

public class Product {

    private UUID id;

    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
