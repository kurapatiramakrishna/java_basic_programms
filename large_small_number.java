import java.util.Scanner;
class large_small_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int large=0;
		int small=0;
		for (int i=1;i<=5 ;i++ )
		{
		int n=scan.nextInt();
		if (n>large)
		{
			large=n;
		   }
		   if (n<small)
		{
			small=n;
		}
		}
		System.out.println("large number is "+large);
		System.out.println("small number is "+small);
	
	}
}
