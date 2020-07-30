/*
 * Factory - Creational Design Pattern 
 * 
 * (sometimes called as virtual constructor)
 * 
 * creates an instance of several derived class
 */

package DesignPatterns;

public abstract class ElectricBillPlan {

	double bill_rate;
	abstract void getBillRate();
	
	public void calculate(int unit)
	{
		System.out.println("Total bill = "+unit*bill_rate);
	}
}

class DomesticPlan extends ElectricBillPlan{
	
	@Override
	void getBillRate()
	{
		bill_rate=5.0;
	}
}

class CommercialPlan extends ElectricBillPlan{
	
	@Override
	void getBillRate()
	{
		bill_rate=8.5;
	}
}

class IndustrialPlan extends ElectricBillPlan{
	
	@Override
	void getBillRate()
	{
		bill_rate=4.5;
	}
}