package first;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the number:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("the number is not prime");
		}

	}

}
