import java.util.Scanner;
class Area_of_a_circle_triangle_square_rectangle 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to area of a calculater..:");
		System.out.println();
		System.out.println("Enter the 1 find area of the circle");
		System.out.println("Enter the 2 find area of the Triangle");
		System.out.println("Enter the 3 find area of the Square");
		System.out.println("Enter the 4 find area of the Rectangle");
		System.out.println();
		System.out.println("Enter your choice.");
		int choice=scan.nextInt();
		switch (choice)
		{
		case 1:
			{
			System.out.println("you have choosen circle to find  its area");
			System.out.println("Enter the radious of a circle");
			double r =scan.nextDouble();
			double area=3.14*r*r;
			System.out.println("Area of the circle is :"+area);
			}
		     break;
		case 2:
			{
			System.out.println("you have choosen circle to find  its area");
			System.out.println("Enter the width of triangle");
			double b =scan.nextDouble();
			System.out.println("Enter the height of thr traingle ");
			double h =scan.nextDouble();
			double area=(b*h)/2;
			System.out.println("Area of the Triangle is :"+area);
			}
			break;
		case 3:
			{
			System.out.println("you have choosen circle to find  its area");
			System.out.println("Enter the squers");
			int a =scan.nextInt();
			int area=a*a;
			System.out.println("Area of the Square is :"+area);
			}
	        break;
		case 4: 
			{
			System.out.println("you have choosen rectangle to find  its area");
			System.out.println("Enter the width of triangle");
			int w =scan.nextInt();
			System.out.println("Enter the lenth of the traingle ");
			int l=scan.nextInt();
			int area=l*w;;
			System.out.println("Area of the rectangle is is :"+area);
			}
			break;
	    default:System.out.println("Enter the valid data");

		}
	}
}
