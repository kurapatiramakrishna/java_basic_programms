class reverse_even_digits 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=20 ;i++ )
		{
			int n=i;
	       int rev=0;
		   int ld=0;
		   if (n%2==0)
		   {
		   while (n!=0)
		   {
			   ld=n%10;
			   rev=rev*10+ld;
			   n=n/10;
		   }
			   System.out.println(rev);
		   }

		}
	}
}
