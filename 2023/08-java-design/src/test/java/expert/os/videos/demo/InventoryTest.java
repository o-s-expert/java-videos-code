package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {


    @Test
    public void shouldNotReturnNullCollection() {
        Inventory inventory = new Inventory();
        Assertions.assertThat(inventory.getItems())
                .isNotNull();
    }



}