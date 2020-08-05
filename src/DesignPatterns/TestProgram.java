//test program

package DesignPatterns;

import java.util.Scanner;

public class TestProgram {
	 static void SumAndMean(int arr[],int N){
		  //Enter your code here
		 int sum=0;
		 for(int i=0;i<N;i++)
			 sum+=arr[i];
		 System.out.print("Sum: "+sum+"\n Mean: "+(int)((sum/N)));
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int arr[]= new int[N];
		for(int i=0;i<N;i++)
			arr[i]=scanner.nextInt();
		scanner.close();
		SumAndMean(arr,N);
	}

}
