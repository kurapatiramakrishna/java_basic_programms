import java.util.Scanner;
class  Sunny_number
{
	public static void main(String[]5 args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the Sunny number:");
		System.out.println("Enter the number:");
			int num=scan.nextInt();
		int temp=num+1;
		int sqr=0;
		for (int a=1;a<=temp ;a++ )
		{
			if (a*a==temp)
			{
				sqr=a;
				break;
			}
		}
		if (sqr==0)
		{
			System.out.println("It not a Sunny number:");
		}
			else
		{
				System.out.println("It is a sunny number:");
		}
	}
}
