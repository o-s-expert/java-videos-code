package expert.os.examples;

public class CreditCardPaymentService implements PaymentService {


    @Override
    public String pay(User user, Money amount){
        // payment logic
        return "The credit Card Payment Successful";
    }
}
