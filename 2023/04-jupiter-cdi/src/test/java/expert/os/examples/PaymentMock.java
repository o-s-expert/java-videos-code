package expert.os.examples;

public class PaymentMock implements Payment{
    @Override
    public void buy(Product product) {
        System.out.println("Using the test env " + product);
    }
}
