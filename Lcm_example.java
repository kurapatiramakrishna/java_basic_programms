import java.util.Scanner;
class Lcm_example 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the LCM common factors");
        System.out.println("Enter the first number");
		int n1=scan.nextInt();
		System.out.println("Enter the first number");
		int n2=scan.nextInt();
		int lcm=0;
		for (int a=n1;a<=n1*n2 ;a++ )
		{
			if (a%n1==0&&a%n2==0)
			{
				lcm=a;
				break;
			}
		}
        System.out.println(lcm);
	}
}
