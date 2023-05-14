package expert.os.videos.demo;

import expert.os.videos.demo.sample.Inventory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InventoryTest {


    @Test
    public void shouldNotReturnNullCollection() {
        Inventory inventory = new Inventory();
        Assertions.assertThat(inventory.getItems())
                .isNotNull();
    }



}