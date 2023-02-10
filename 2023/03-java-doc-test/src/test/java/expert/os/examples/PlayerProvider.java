package expert.os.examples;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PlayerProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        List<Player> players = new ArrayList<>();
        players.add(Player.of("Poliana", "Salvador", 20));
        players.add(Player.of("Otavio", "Salvador", 0));
        return Stream.of(Arguments.of(players));
    }
}
