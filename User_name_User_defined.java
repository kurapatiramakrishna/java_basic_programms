import java.util.Scanner;
class User_name_User_defined
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("To print the user name serial wise:..");
	System.out.println("Enter the user Name...:");
	String name=scan.next();
	System.out.println("Enter how many types...:");
	int n=scan.nextInt();
		for (int a=1;a<=n;a++)
		{
			System.out.println(name);
		}
	}
}
