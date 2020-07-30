package DesignPatterns;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of your Electricity plan (Industrial/Commercial/Domestic): ");
		String plans = sc.next();
		System.out.println("Enter units consumed: ");
		int unit = sc.nextInt();
		sc.close();
		try {
			ElectricBillPlan bill = GetPlanFactory.getBillPlan(plans);
			bill.getBillRate();
			bill.calculate(unit);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
