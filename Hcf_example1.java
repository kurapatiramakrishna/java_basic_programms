import java.util.Scanner;
class Hcf_example1 
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
		while (n2>0)
		{
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println(n1);
	}
}
