class palidrome_product 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int prod=1;
			int rev=0;
			int ld=0;
			for (int a=i;a!=0 ;a=a/10 )
			{
				rev=rev*10+i%10;
				ld=i/10;
				prod=prod*ld;
			}
			if (rev==i && prod<99)
			{
					System.out.println(i);
             }
		}
		
	}
}
