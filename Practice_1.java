import java.util.Scanner;
class Practice_1 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nth spy number;");
		int n=scan.nextInt();
		int y=1;
		int x=1;
		while(y!=0)
		{
		int sum=0;
		int product=1;
		int temp=x;
		while (x!=0)
		{
			sum=sum+(x%10);
			product=product*(x%10);
			x=x/10;
		}
		x=temp;
		if (sum==product)
		{
			if (y==n)
			{
			System.out.println(y+")"+x);
			}
			y++;
		}
x++;
	}
	}
	
}