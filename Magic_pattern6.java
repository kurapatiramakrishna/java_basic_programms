class  Magic_pattern6
{
	public static void main(String[] args) 
	{
		System.out.println("To print the magic pattern in 5x5 but @ and ? is print in the middle of star:");
     for (int i=1;i<=5 ;i++ )
     {
		 for (int j=1;j<=5;j++ )
		 {
           if (i==1&&j==5)
           {
			   System.out.print(" # ");
           }
		   else if (i==3&&j==2)
		   {
			   System.out.print(" ? ");
			 }
			 else
			 {
			 System.out.print(" * ");	
		 }
		 }
		 System.out.println("");
		 
	 }
	}
}
