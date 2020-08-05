package abstractFactory;

public class Sbi implements Bank{
	private final String bName;
	Sbi()
	{
		bName="SBI Bank";
	}
	@Override
	public String getBankName()
	{
		return bName;
	}
}
