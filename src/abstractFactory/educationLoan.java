package abstractFactory;

public class educationLoan extends Loan{
	@Override
	void getInterestRate(double rate)
	{
		this.rate=rate;
	}
}
