public abstract class AbstractFactory {

    abstract Loan getLoan(String loanType);

    public static AbstractFactory getLoanFactory(LoanFactoryType factoryType) {
        if (factoryType.equals(LoanFactoryType.HOME_LOAN))
            return new HomeLoanFactory();
        else if (factoryType.equals(LoanFactoryType.BUSINESS_LOAN))
            return new BusinessLoanFactory();
        else
            throw new UnsupportedOperationException("Loan type not supported");
    }

}
