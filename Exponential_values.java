import java.util.Scanner;
class  Nth_prime_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the Nth prime number:.");
		System.out.println("Enetr the Nth number:..");
		int n=scan.nextInt();
		int x=2;
		int y=1;
		int primecount=2;                                                                                                             //for loop only ,for(;primecount;)//
		while (primecount<=n)                                                                                                //another way for(int primecount=1;primecount<=n;x++)//O
		{
			int count=0;
			for (int a=1;a<=n ;a++ )
     	{
				if (x%a==0)
				{
                count++;
				}
			}
				if (y==n)
				{
				System.out.println(n+"  prime number is."+x);
				primecount++;
			}
			y++;
			x++;
		
		}
	}
}
