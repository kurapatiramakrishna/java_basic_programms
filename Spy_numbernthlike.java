import java.util.Scanner;
class	Spy_numbernthlike
{
	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner(System.in);
		System.out.println("To print the  Nth spy number:..");
		System.out.println("Enter the Nth number:");
		int num=scan.nextInt();
		int x=1;
		int y=1;
        while (y<=num)
        {
		int temp=x;
		int sum=0;
		int product=1;
		while(x!=0)
			{
			sum=sum+(x%10);
			product=product*(x%10);
            x=x/10;
        }
		x=temp;
		if (sum==product)
		{
			if(y==num)
			{
			System.out.println(y+") "+x);
		}
        y++;
		}
		x++;
	   }
	}
}
