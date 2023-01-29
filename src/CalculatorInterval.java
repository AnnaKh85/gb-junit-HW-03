public class CalculatorInterval {
    private final int intervalStart;
    private final int intervalEnd;

    public CalculatorInterval(int intervalStart, int intervalEnd) {
        this.intervalStart = intervalStart;
        this.intervalEnd = intervalEnd;
    }

    public boolean numberInInterval(int n) {
        if (n > intervalStart && n < intervalEnd) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] params) {

    }

}
