class Nth_magic 
{
	public static void main(String[] args) 
	{
		int n=9;
		int x=1;
		int count=0;
		while (count<=n)
		{
			int  num=x;
			int sum=0;
			while (sum!=0||sum>9)
			{
				if (num==0)
				{
					num=sum;
					sum=0;
				}
				sum=sum+(num%10);
				num=num/10;
			}
			if (sum==1)
			{
				if (count==n)
				{
		System.out.println(x);
				}
				count++;
			}
			x++;
		}
	}
}

