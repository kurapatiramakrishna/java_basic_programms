import java.util.Scanner;
class Chatr_of_two_numers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("The sum of two numbers are:");
		System.out.println("Enter the 1st number:");
		int a=scan.nextInt();
        System.out.println("Enter the 2st number:");
		int b=scan.nextInt();
		System.out.println("The sum of "+a+" and " +b+ " is:"+(a+b));
	}
}
