package first;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		
		double sum=1;
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		System.out.println("the factorial of the number is:"+sum);
	}

}
