package ladder.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class LadderGameTest {
    LadderGame ladderGame;

    @Before
    public void setUp() {
        ladderGame = LadderGame.of(5);
    }

    @Test
    public void generateLineTest() {
        assertThat(ladderGame.generateLine(5).size()).isEqualTo(5);
    }

    @Test
    public void runTest() {
        List<List<Boolean>> ladder = ladderGame.run(3).getLadder();
        assertThat(ladder.size()).isEqualTo(3);
    }
}
