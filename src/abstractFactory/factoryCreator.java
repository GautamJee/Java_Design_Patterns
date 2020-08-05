package abstractFactory;

public class factoryCreator {
	public static abstractFactory getFactory(String choice)
	{
		switch(choice)
		{
			case "bank": return new bankFactory();
			case "loan": return new loanFactory();
			default: return null;
		}
	}
}
