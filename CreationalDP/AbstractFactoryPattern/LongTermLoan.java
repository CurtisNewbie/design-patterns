public class LongTermLoan extends Loan implements BusinessLoan {

    public LongTermLoan() {
        super(1.5);
    }

    @Override
    public String toString() {
        return String.format("LongTermLoan { rate : %s }", rate);
    }

}
