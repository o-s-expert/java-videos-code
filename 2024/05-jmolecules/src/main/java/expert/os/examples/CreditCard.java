package expert.os.examples;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import java.math.BigInteger;
import java.time.YearMonth;

@Entity
public class CreditCard {

    @Identity
    private BigInteger id;

    private String number;

    private String name;

    private YearMonth expiry;
}
