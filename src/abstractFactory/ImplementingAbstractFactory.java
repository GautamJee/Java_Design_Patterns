package abstractFactory;

import java.util.Scanner;

public class ImplementingAbstractFactory{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Bank Name:");
		String bank=sc.next();
		
		System.out.println("Enter Loan Type:");
		String loan=sc.next();
		
		System.out.println("Enter Rate of Interest:");
		double rate=sc.nextDouble();
		
		System.out.println("Enter Loan Amount:");
		double amount=sc.nextDouble();
		
		System.out.println("Enter Duration in years:");
		int year=sc.nextInt();
		
		sc.close();
		try{
			abstractFactory objAbstractFactory=factoryCreator.getFactory("loan");
			Loan loanObj = objAbstractFactory.getLoan(loan);
			loanObj.getInterestRate(rate);
			loanObj.calculateLoan(amount, year);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
