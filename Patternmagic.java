import java.util.Scanner;
class  Patternmagic
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\t\t\tCODING IS FUN !\t\t\t");
		System.out.println("Here we have print magic patterns..");
		System.out.println("�����������������������������������������������������");
		System.out.println(" ");
	    System.out.println("Enter the I magic");
        System.out.println("�����������������������������������������������������");
	   	int a=scan.nextInt();
		System.out.println();
		System.out.println("Enter the U magic");
        System.out.println("�����������������������������������������������������");
		int n=scan.nextInt();
		System.out.println();
		System.out.println(" ");
		System.out.println("YOU CHOOSE "+a);
		System.out.println(" YOU CHOOSE  "+n);
		System.out.println("�����������������������������������������������������");
		//enter the i magic1
		for (int x=1;x<=a ;x++ )
		{
       for (int y=1;y<=a ;y++ )
      {
		   if (x==1||y==a/2+1|| x==a)
			 System.out.print(" "+(char)3);
	              else
				 System.out.print(" ");
			 }
		
			 System.out.println("\n");
		}
		System.out.println();
//enter the love

		for (int l=0;l<=5 ;l++ )
		{
			for (int m=0;m<=6;m++ )
			{
              if (m%3!=0 &&  l==0||m%3==0 &&l==1||l-m==2||l+m==8)
				{
				  System.out.print("  "+(char)3);
				}
              else
				System.out.print("  ");
			}
		
				System.out.println("\n");
		}

	//enter the u 
		for (int i=0; i<=n ;i++ )
			{  
			for (int j=0;j<=n;j++ )
			{
				if (j==1||j==1||i==n||j==n)
			System.out.print(" "+(char)3);
			else
					System.out.print("  ");
			}
			System.out.println();
			}
	System.out.println("\n\n\t\t\t..DON'T JUDGE BY BOOK  IT''S COVER  BRO.. \n\n\\n");
			
	 
	  }

}

