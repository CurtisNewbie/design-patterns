public class AbstarctLoan implements Loan {

    protected double rate;

    protected AbstarctLoan(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}
