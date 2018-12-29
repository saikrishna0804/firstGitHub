package first;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String p=null;
		String s=Integer.toString(n);
		StringBuffer sb=new StringBuffer();
		int b=s.length()-1;
		for(int i=b;i<s.length();i--)
		{
			if(i<0)
			{
				break;
			}
			
			 p=sb.append(s.charAt(i)).toString();
			System.out.println(p);
			
		}
		if(p.equals(s))
		{
			System.out.println("this number is palindrome");
		}
		else
		{
			System.out.println("this number is not palindrome");
		}
		

	}

}
