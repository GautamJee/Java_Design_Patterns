/*
 * Factory - Creational Design Pattern 
 * 
 * (sometimes called as virtual constructor)
 * 
 * creates an instance of several derived class
 */

package DesignPatterns;

public class GetPlanFactory {

	public static ElectricBillPlan getBillPlan(String planType)	//Factory method
	{
		switch(planType)
		{
			case "Commercial": return new CommercialPlan(); 
				
			case "Domestic": return new DomesticPlan();
				
			case "Industrial": return new IndustrialPlan();
				
			default: return null; 
		}
	}
}
