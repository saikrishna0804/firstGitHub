package first;

public class Dwaraka {
	int num=454;
	int r;
	int sum=0;
	{
	while(num<0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(num==sum)
	{
		System.out.println("the num is palindrome");
	}
	else
		System.out.println("this is not palidrome");
	
}
}




