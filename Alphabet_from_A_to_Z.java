import java.util.Scanner;
class Natural_number_range
{
	public static void main(String[] args) 
{
      Scanner scan=new Scanner(System.in);
	  System.out.println("To print Natural number from given :.. ");
	  System.out.println("Enter the starting range:");
	  int n1=scan.nextInt();
	  System.out.println("Enter the Ending range:");
	  int n2=scan.nextInt();
	   for (int a=n1;a<=n2;a++ )
		{
			System.out.println(a);
		}
	}
}
