class Swap_of_two_variables 
{
	public static void main(String[] args) 
	{
		System.out.println("Before swapping two numbers:");
		int x=1;
		int y=2;
		System.out.println("the value of  x  is:"+x);
		System.out.println("the value of  y is:"+y);
		System.out.println("After swapping two numbers:");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("the value of x  is:"+x);
		System.out.println("the value of y is:"+y);
	}
}
