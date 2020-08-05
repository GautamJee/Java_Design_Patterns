package abstractFactory;

public class Icici implements Bank{
	private final String bName;
	Icici()
	{
		bName="ICICI Bank";
	}
	@Override
	public String getBankName()
	{
		return bName;
	}
}
