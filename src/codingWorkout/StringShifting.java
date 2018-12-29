package codingWorkout;

import java.util.ArrayList;

public class StringShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dwaraka";
		String h=null;
		ArrayList<String> a= new ArrayList<String>();
		a.add(s);
		for(int i=0;i<s.length()-1;i++)
		{
			h=s.substring(1,s.length())+s.charAt(0);
			if(h.length()==s.length()) {
				s=h;
				a.add(h);
			}
			
		}
	
		System.out.println(a);
	}

}
