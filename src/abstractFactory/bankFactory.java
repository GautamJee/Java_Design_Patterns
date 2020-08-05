package abstractFactory;

public class bankFactory extends abstractFactory{
	@Override
	public Bank getBank(String Bank)
	{
		switch(Bank)
		{
			case "hdfc": return new Hdfc();
			case "sbi": return new Sbi();
			case "icici": return new Icici();
			default: return null;
		}
		
	}
	@Override
	public Loan getLoan(String Loan) {
		return null;
	}
	
}
