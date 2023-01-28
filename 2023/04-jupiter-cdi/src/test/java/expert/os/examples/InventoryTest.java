package expert.os.examples;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddPackages;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.jboss.weld.junit5.auto.ExcludeBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@EnableAutoWeld
@AddPackages(Inventory.class)
class InventoryTest {

    @Inject
    private Inventory inventory;

    @Produces
    @ExcludeBean
    private Payment payment = new PaymentMock();

    @Test
    public void shouldBy() {
        Product product = new Product("Banana");
        inventory.buy(product);
    }
}