class Magicc1
{
	public static void main(String[] args) 
	{
	System.out.println("To print the magicc1 number");
        int n=25;
		int sum=0;
		while (n!=0||sum>9)
		{
			if (n==0)
			{
				n=sum;
                sum=0;
			}
			sum=sum+(n%10);
			n=n/10;
		}
		if (sum==1)
		{
		System.out.println("It is magic number:");
	}
	else 
		{
		System.out.println("It is not magic number:");
		}
	}
}
