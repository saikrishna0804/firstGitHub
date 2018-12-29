package codingWorkout;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;

		for(int z=0;z<5;z++)
		{
			if((++x>2)&&(++y>2))
				//System.out.println("x="+x+"    "+"y="+y+"    "+"z="+z);
			{
				x++;
			}
			System.out.println("x="+x+"    "+"y="+y+"    "+"z="+z);
		}
		System.out.println(x+"    "+y);
	}

}
