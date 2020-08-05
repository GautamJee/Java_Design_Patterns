package abstractFactory;

public class Hdfc implements Bank{
	private final String bName;
	Hdfc()
	{
		bName="HDFC Bank";
	}
	@Override
	public String getBankName()
	{
		return bName;
	}

}
