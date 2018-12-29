package codingWorkout;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		int count=0;
		StringTokenizer st=new StringTokenizer("level non I liril yelley");
		while(st.hasMoreTokens())
		{
			String p=st.nextToken();
			a.add(p);
		}
		//System.out.println(a.get();
		for(int i=0;i<=a.size()-1;i++)
		{
			StringBuffer sb=new StringBuffer(a.get(i));
			String h=sb.reverse().toString();
			//System.out.println(h);
			System.out.println(sb);
			if(h.equals(sb.toString()))
			{
				count++;
			}
		}
		System.out.println("count="+count);
		System.out.println("a.size="+a.size());
		if(count==a.size())
		{
			System.out.println("the sentence is palindrome");
		}
		else
		{
			System.out.println("the sentence is not palindrom");
		}
	}
	
	

}
