import java.util.Scanner;
class  Next_prime_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the next prime number:");
		System.out.println("Enter the number:");
		int x=scan.nextInt();
		while (true)
		{
			x++;
			int count=0;
			for (int a=1;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
				break;
			}
		}
	}
}
