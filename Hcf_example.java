import java.util.Scanner;
class  Hcf_example
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the HCF common factors");
        System.out.println("Enter the first number");
		int n1=scan.nextInt();
		System.out.println("Enter the first number");
		int n2=scan.nextInt();
		int hcf=0;
		for (int a=1;a<=n1 ;a++ )
		{
			if (n1%a==0&&n2%a==0)
			{
				hcf=a;
			}
		}
		System.out.println("The hcf of "+n1+" and "+n2+" is :"+hcf);
	}
}
