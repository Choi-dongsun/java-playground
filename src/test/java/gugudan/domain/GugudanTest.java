package gugudan.domain;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class GugudanTest {

    @Test
    public void calculateTest() {

        int[] result1 = Gugudan.calculate(8,7);
        int[] result2 = Gugudan.calculate(8,8);

        assertThat(result1[0]).isEqualTo(8);
        assertThat(result1.length).isEqualTo(7);
        assertThat(result1[result1.length - 1]).isEqualTo(56);

        assertThat(result2[0]).isEqualTo(8);
        assertThat(result2.length).isEqualTo(8);
        assertThat(result2[result2.length - 1]).isEqualTo(64);
    }
}
