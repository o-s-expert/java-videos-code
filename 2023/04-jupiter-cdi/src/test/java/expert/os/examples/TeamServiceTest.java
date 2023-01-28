package expert.os.examples;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@EnableAutoWeld
class TeamServiceTest {

    @Inject
    private TeamService service;
    @Test
    public void shouldNotBeNull() {
        Assertions.assertNotNull(service);
    }
}