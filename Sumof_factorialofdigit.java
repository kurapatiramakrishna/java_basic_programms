import java.util.Scanner;
class Sumof_factorialofdigit
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("To print the sum of the factorial number:");
	System.out.println("Enter the number:");
    int n=scan.nextInt();
	int ld=0;
	int sum=0;
	while (n!=0)
	{
        ld=n%10;
		int fact=1;
		for (int a=1;a<=ld ;a++ )
		{
		fact=fact*a;
		}
		sum=sum+fact;
		n=n/10;
	}
	System.out.println("Sum of factorail of digit is "+sum);
	}
}
