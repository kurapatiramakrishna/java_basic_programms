import java.util.Scanner;
class Area_of_a_circle1
{
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
	 System.out.println("To calculate th area of a circle:");
	 System.out.println("Enter the area of a circle:");
	 Double r=scan.nextDouble();
	 Double area=(3.14*r*r);
	 System.out.println("The area of a circle is:"+area);
	}
}
