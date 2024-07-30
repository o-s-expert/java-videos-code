package expert.os.examples;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditCardService {

    private static final Logger LOGGER = Logger.getLogger(CreditCardService.class.getName());

    public void pay(CreditCard creditCard, Product product) {
        try {
            LOGGER.info("Paying with credit card: " + creditCard.getId());
            LOGGER.fine("Paying for product: " + product);
        } catch (Exception e) {
            String errorMessage = String.format("Payment failed: card id: %s and product id: %s. Error message: %s", creditCard.getId(),
                    product.getId(), e.getMessage());
            LOGGER.log(Level.SEVERE, errorMessage, e);
        }
    }

    public void pay(UUID creditCardId, Product product) {
        LOGGER.info("Paying with credit card: " + creditCardId);
        LOGGER.fine("Paying for product: " + product);

        findById(creditCardId).orElseThrow(() -> new CreditCardNotFoundException("Credit card not found with the id: " + creditCardId));
    }

    public Optional<CreditCard> findById(UUID id) {
        LOGGER.info("Finding credit card by id: " + id);
        return Optional.of(new CreditCard());
    }


    @Deprecated
    public void deprecated(CreditCard creditCard, Product product) {
        LOGGER.warning("Deprecated method is called, use pay() instead. It will be removed in the next release. The id: " + creditCard.getId());
        //you can use the request or user id
    }
}
