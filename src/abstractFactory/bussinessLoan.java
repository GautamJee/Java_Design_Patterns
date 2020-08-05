package abstractFactory;

public class bussinessLoan extends Loan{
	@Override
	void getInterestRate(double rate)
	{
		this.rate=rate;
	}
}
