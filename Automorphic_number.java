import java.util.Scanner;
class  Automorphic_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the automorphic number:");
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int temp=n;
		int count=0;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		int y=1;
		for (int a=1;a<=count ;a++ )
		{
			y=y*10;
		}
		n=temp;
		if (n==(n*n)%y)
		{
			System.out.println("It is automorphic number:");
		}
		else
		{
			System.out.println("It not a automorphic number:");
		}
	}
}
