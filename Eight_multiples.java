import java.util.Scanner;
class Any_multiples
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter the table that i want print:..");
		 int n =scan.nextInt();
		System.out.println("Enter the first  value:");
		int x=scan.nextInt();
        System.out.println("Enter the last  value:");
		int y=scan.nextInt();
		for (int a=x;a<=y;a++)
		{
			System.out.println(+n+" x "+a+"="+a*8);
			
		}
		
	}
}
