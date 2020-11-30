public class HomeLoanFactory extends AbstractFactory {

    @Override
    Loan getLoan(String loanType) {
        if (loanType.equalsIgnoreCase("NegotiableLoan"))
            return new NegotiableLoan();
        else
            throw new UnsupportedOperationException(String.format("Loan type not supported: %s", loanType));
    }

}
