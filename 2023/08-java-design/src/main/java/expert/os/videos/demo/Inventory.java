package expert.os.videos.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Inventory {

    private List<String> items = new ArrayList<>();

    public void add(String item) {
        //validation
        Objects.requireNonNull(item, "item is required");
        this.items.add(item);
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items);
    }
}
