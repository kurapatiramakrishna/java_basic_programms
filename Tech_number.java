import java.util.Scanner;
class Tech_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner(System.in);
		System.out.println("To print the tech number or not:");
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int count=0;
		int temp=n;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int y=1;
		for (int i=1;i<=count ;i++ )
		{
			y=y*10;
		}
			int a=n%y;
			int b=n/y;
			int c=a+b;
			if (n==c*c)
			{
				System.out.println(n+" The given number is tech number:");
			}
			else
			{
			System.out.println(n+" The given number is not a tech number:");
		}
	}
}
