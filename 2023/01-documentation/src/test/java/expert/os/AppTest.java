package expert.os;


import expert.os.function.Operation;
import expert.os.strategy.Cook;
import expert.os.strategy.Cooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Operation operation = Operation.MINUS;
        double operate = operation.operate(10, 4);
        Assertions.assertEquals(6D, operate);
    }

    @Test
    public void shouldReturnADish() {
        Cook cook = Cooks.ITALIAN;
        Assertions.assertNotNull(cook.prepare());
    }
}
