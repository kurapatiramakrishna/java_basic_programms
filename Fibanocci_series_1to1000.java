class Fibanocci_series_1to1000 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=10;i++ )
		{
		a=b;
		b=sum;
		sum=a+b;
		System.out.println(sum);
		}
	}
}
