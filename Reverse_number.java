class Reverse_number
{
	public static void main(String[] args) 
	{
		int n=123;
		int rev=0;
		for (int a=n;a!=0 ;a=a/10 )
		{
			rev=rev*10+(a%10);
		}
		System.out.println(rev);
	}
}
