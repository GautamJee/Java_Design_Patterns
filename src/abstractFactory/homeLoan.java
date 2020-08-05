package abstractFactory;

public class homeLoan extends Loan{
	@Override
	void getInterestRate(double rate)
	{
		this.rate=rate;
	}
}
