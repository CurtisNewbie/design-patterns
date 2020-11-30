public class BusinessLoanFactory extends AbstractFactory {

    @Override
    AbstarctLoan getLoan(String loanType) {
        if (loanType.equalsIgnoreCase("ShortTermLoan"))
            return new ShortTermLoan();
        else if (loanType.equalsIgnoreCase("LongTermLoan"))
            return new LongTermLoan();
        else
            throw new UnsupportedOperationException(String.format("Loan type not supported: %s", loanType));
    }

}
