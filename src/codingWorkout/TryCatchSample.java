package codingWorkout;

public class TryCatchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("the string is null");
		}
		finally{
			System.out.println("program terminated");
		}
	}

}
