import java.util.Scanner;
class Sum_of_digit_raised
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("TO print the sum of digit raised to power count of digit:");
		System.out.println("Enter number:");
		int n=scan.nextInt();
		int count=0;
		int temp=n;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
	    n=temp;
		int ld=0;
		int sum=0;
        while (n!=0)
        {
			ld=n%10;
			int exp=1;
			for (int a=1;a<=count ;a++ )
			{
			exp=exp*ld;
			}
			sum=sum+exp;
			n=n/10;
	    }
			System.out.println("sum of digit raised to power count of digit :"+sum);
	
    }
}

