import java.util.Scanner;
class Factors_of_nValues
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("to print the n value factor:..");
		System.out.println("Enter the n value.");
		int n=scan.nextInt();
		for (int a=1;a<=n ;a++ )
		{
			if(n%a==0)
			{
		System.out.println(a);
	}
		}
	}

}
