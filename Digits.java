import java.util.Scanner;
class Digits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("To print the digits programming");
		System.out.println("Enetr the number");
		int num=scan.nextInt();
	    int count=0;
        while (num!=0)
        {
			count++;
			num=num/10;
        }
		System.out.println(count);
	}
}
