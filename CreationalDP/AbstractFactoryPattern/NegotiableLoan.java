public class NegotiableLoan extends AbstarctLoan implements HomeLoan {

    public NegotiableLoan() {
        super(0.1);
    }

    @Override
    public String toString() {
        return String.format("NegotiableLoan { rate : %s }", rate);
    }
}
