import java.util.Scanner;
class Co_primenumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the co_prime numbers");
        System.out.println("Enter the first number");
		int n1=scan.nextInt();
		System.out.println("Enter the first number");
		int n2=scan.nextInt();
		int hcf=1;
		for (int a=1;a<=n1 ;a++ )
		{
			if (n1%a==0&&n2%a==0)
			{
				hcf=a;
			}
		}
		    if (hcf==1)
		    {
				System.out.println("It is a co prime number");
		    }
				else
			{
             System.out.println("It is not a co prime number");
			}
        
	}
}