package abstractFactory;

public class loanFactory extends abstractFactory{
	
	@Override
	public Bank getBank(String bank) {
		return null;
	}
	@Override
	public Loan getLoan(String loan)
	{
		switch(loan)
		{
			case "bussiness": return new bussinessLoan();
			case "education": return new educationLoan();
			case "home": return new homeLoan();
			default: return null;
		}
	}
}
