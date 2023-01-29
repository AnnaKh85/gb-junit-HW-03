import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorIntervalTest {

    @Test
    void checkIn() {
        CalculatorInterval c = new CalculatorInterval(25, 100);
        assertThat(c.numberInInterval(50)).isEqualTo(true);
    }

    @Test
    void checkOut() {
        CalculatorInterval c = new CalculatorInterval(25, 100);
        assertThat(c.numberInInterval(1)).isEqualTo(false);
    }

    @Test
    void checkBorderIn() {
        CalculatorInterval c = new CalculatorInterval(25, 100);
        assertThat(c.numberInInterval(26)).isEqualTo(true);
        assertThat(c.numberInInterval(99)).isEqualTo(true);
    }

    @Test
    void checkBorderOut() {
        CalculatorInterval c = new CalculatorInterval(25, 100);
        assertThat(c.numberInInterval(25)).isEqualTo(false);
        assertThat(c.numberInInterval(100)).isEqualTo(false);
    }

}
