package codingWorkout;

public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			String s=null;
			System.out.println(s.length());
			System.out.println(10/0);
		}catch(NullPointerException | ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
