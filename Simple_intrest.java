import java.util.Scanner;
class 
{
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
	 System.out.println("To calculate the Simple intrest:");
	 System.out.println("Enter the principle:");
	 Double p=scan.nextDouble();
	 System.out.println("Enter the rate of intrest:");
	 Double r=scan.nextDouble();
	 System.out.println("Enter the time:");
	 Double t=scan.nextDouble();
	 Double i=(p*r*t/100);
	 System.out.println("The Voluem of intrest is "+p+" and "+r+" and "+t+" are:"+i);
	}
}
