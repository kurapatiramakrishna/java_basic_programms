import java.util.Scanner;
class Sum_of_digits 
{
	public static void main(String[] args) 
	{
        Scanner scan=new Scanner(System.in);
		System.out.println(" To print the sum of digts:");
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int sum=0;
		int last=0;
		while (num!=0)
		{
			last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);
	}
}
	


	