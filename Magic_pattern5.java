class  Magic_pattern5
{
	public static void main(String[] args) 
	{
		System.out.println("To print the magic pattern in 5x5 but @ also print in the middle of star:");
     for (int i=1;i<=5 ;i++ )
     {
		 for (int j=1;j<=5;j++ )
		 {
           if (i==2&&j==3)
           {
			   System.out.print(" @ ");
           }
		   else 
			 {
			   System.out.print(" * ");
			 }
		 }
		 System.out.println();
	 }
	}
}
