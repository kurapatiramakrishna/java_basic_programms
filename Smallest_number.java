import java.util.Scanner;
class Smallest_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the smallest  of a given five number:");
		System.out.println("Enter the five number:");
		int n1=scan.nextInt();
		int small=n1;
		for (int a=1;a<=4 ;a++ )
		{
			int  n=scan.nextInt();
			if (n<small)
			{
				small=n;
			}
		}
		System.out.println(small+" is a smallest number:");
	}
}
