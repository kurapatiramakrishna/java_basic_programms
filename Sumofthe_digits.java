import java.util.Scanner;
class Sumofthe_digits
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print and Count the number of digits ");
	    System.out.println("Enetr the number: ");
		int num=scan.nextInt();
		int count=0;
		int sum=0;
		int lastdigit=0;
		int temp=num;
        while (num!=0)
        {
			count++;
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
        }
		System.out.println("the number of digits in the "+temp+ " is"+sum);
	}
}
