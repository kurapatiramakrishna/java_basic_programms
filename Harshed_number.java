import java.util.Scanner;
class  Harshed_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the harshed number or not :");
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int last=0;
		int temp=n;
		int sum=0;
		while (n!=0)
		{
			last=n%10;
			sum=sum+last;
			n=n/10;
		}
		if (temp%sum==0)
		{
			System.out.println("It is a harshed number:");
		}
		else
		{
			System.out.println("It is not  a harshed number:");
		}
	}
}
