public class ShortTermLoan extends Loan implements BusinessLoan {

    public ShortTermLoan() {
        super(0.5);
    }

    @Override
    public String toString() {
        return String.format("ShortTermLoan { rate : %s }", rate);
    }
}
