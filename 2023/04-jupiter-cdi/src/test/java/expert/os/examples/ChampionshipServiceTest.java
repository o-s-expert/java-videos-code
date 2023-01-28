package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ChampionshipServiceTest {

    @Mock
    private ChampionRepository repository;

    @InjectMocks
    private ChampionshipService service;

    @Test
    public void shouldRegister() {
        Mockito.when(repository.existByName("Bahia")).thenReturn(false);
        Team bahia = Team.of("Bahia");
        service.register(bahia);

        Mockito.verify(repository).existByName("Bahia");
    }
    @Test
    @DisplayName("should return an exception when there is a team with a name")
    public void shouldThrownAnExceptionWhenTeamNameExists() {
        Mockito.when(repository.existByName("Bahia")).thenReturn(true);
        Team bahia = Team.of("Bahia");
        Assertions.assertThrows(IllegalArgumentException.class,  () ->
                service.register(bahia));

        Mockito.verify(repository).existByName("Bahia");
    }
}