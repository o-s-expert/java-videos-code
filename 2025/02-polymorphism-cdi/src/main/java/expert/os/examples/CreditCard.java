package expert.os.examples;

import java.util.UUID;

public class CreditCard {

    private UUID id;
    //only the last four digits of the credit card number are stored
    private String number;

    private String password;

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", password= *****" +
                '}';
    }
}
