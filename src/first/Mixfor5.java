package first;

public class Mixfor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=30;
		for(int a=0;a<3;a++)
		{
			for(int b=4;b>1;b--)
			{
				x=x+6;
				y=y-2;
				if(x==6)
				{
					break;  
				}
				x=x+3;
			}
			y=y-2;
			System.out.println(x+"  "+y);
		}
		System.out.println(x+ " "+y);

	}

}
