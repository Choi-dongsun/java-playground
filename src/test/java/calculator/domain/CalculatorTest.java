package calculator.domain;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void calculateTest() {
        assertThat(Calculator.calculate(10, "+", 2)).isEqualTo(12);
        assertThat(Calculator.calculate(10, "-", 2)).isEqualTo(8);
        assertThat(Calculator.calculate(10, "*", 2)).isEqualTo(20);
        assertThat(Calculator.calculate(10, "/", 2)).isEqualTo(5);
    }
}