import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorEvenOddTest {

    @Test
    void checkOdd() {
        CalculatorEvenOdd c = new CalculatorEvenOdd();
        assertThat(c.evenOddNumber(1)).isEqualTo(false);
        assertThat(c.evenOddNumber(1348237497)).isEqualTo(false);
    }

    @Test
    void checkEven() {
        CalculatorEvenOdd c = new CalculatorEvenOdd();
        assertThat(c.evenOddNumber(2)).isEqualTo(true);
        assertThat(c.evenOddNumber(342342342)).isEqualTo(true);
    }

    @Test
    void checkZero() {
        CalculatorEvenOdd c = new CalculatorEvenOdd();
        assertThat(c.evenOddNumber(0)).isEqualTo(true);
    }

    @Test
    void checkOddNegative() {
        CalculatorEvenOdd c = new CalculatorEvenOdd();
        assertThat(c.evenOddNumber(-1)).isEqualTo(false);
        assertThat(c.evenOddNumber(-1348237497)).isEqualTo(false);
    }

    @Test
    void checkEvenNegative() {
        CalculatorEvenOdd c = new CalculatorEvenOdd();
        assertThat(c.evenOddNumber(-2)).isEqualTo(true);
        assertThat(c.evenOddNumber(-342342342)).isEqualTo(true);
    }

}
