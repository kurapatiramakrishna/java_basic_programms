class  sum_digit_even_odd
{
	public static void main(String[] args) 
	{
		int n=35;
		int sum=0;
		int ld=0;
		while(n!=0)
		{
			ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		if (sum%2==0)
		{
			System.out.println("it is even digit number ");
		}
		else 
		{
			System.out.println("it is odd digit number");
		}
	}
}
