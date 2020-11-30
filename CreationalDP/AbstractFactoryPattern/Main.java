public class Main {

    public static void main(String[] args) {
        // Factory for HomeLoan
        AbstractFactory homeLoanFactory = AbstractFactory.getLoanFactory(LoanFactoryType.HOME_LOAN);
        Loan negotiableLoan = homeLoanFactory.getLoan("NegotiableLoan");
        System.out.println(negotiableLoan);

        // Factory for BusinessLoan
        AbstractFactory businessLoanFactory = AbstractFactory.getLoanFactory(LoanFactoryType.BUSINESS_LOAN);
        Loan longTermLoan = businessLoanFactory.getLoan("LongTermLoan");
        System.out.println(longTermLoan);

        Loan shortTermLoan = businessLoanFactory.getLoan("ShortTermLoan");
        System.out.println(shortTermLoan);
    }
}
