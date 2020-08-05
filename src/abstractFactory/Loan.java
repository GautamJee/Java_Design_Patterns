package abstractFactory;

public abstract class Loan {
	double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoan(double loanAmount, int year) {
		System.out.println("Interest Amount = "+(loanAmount*year*rate)/100);
	}
}
