class Non_fibanocci_series 
{
	public static void main(String[] args) 
	{
        int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=100 ;i++ )
		{
			int oldsum=sum;
			a=b;
			b=sum;
			sum=a+b;
			for (int x=oldsum+1;x<sum ;x++ )
			{
				System.out.println(x);
		if (x>=100)
		{
			break;
		}
			}
		}
	}
}
