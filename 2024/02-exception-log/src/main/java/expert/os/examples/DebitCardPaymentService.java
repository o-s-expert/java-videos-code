package expert.os.examples;

public class DebitCardPaymentService implements PaymentService {


    @Override
    public String pay(User user, Money amount){
        // payment logic
        return "The debit Card Payment Successful";
    }
}
