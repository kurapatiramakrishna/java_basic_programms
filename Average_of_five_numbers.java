
import java.util.Scanner;
class Average_of_five_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("The average of five numbers are:");
		System.out.println("Enter the first number is:");
		int a=scan.nextInt();
		System.out.println("Enter the secound number is:");
		int b=scan.nextInt();
        System.out.println("Enter the third  number is:");
		int c=scan.nextInt();
		System.out.println("Enter the fourth  number is:");
		int d=scan.nextInt();
		System.out.println("Enter the fiveth  number is:");
		int e=scan.nextInt();
		System.out.println("The average of "+a+ " and "+b+" and "+c+" and "+d+" and "+e+ " are :"+(a+b+c+d+e)/5);
	}
}
