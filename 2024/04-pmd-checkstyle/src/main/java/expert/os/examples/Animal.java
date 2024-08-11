package expert.os.examples;

import java.util.logging.Logger;

public class Animal {

    private static final Logger LOGGER = Logger.getLogger(Animal.class.getName());

    public void eat(String food) {
        if("meat".equals(food)){
            LOGGER.info("Animal is eating meat");
        }
    }
}
