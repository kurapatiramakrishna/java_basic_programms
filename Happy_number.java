import java.util.Scanner;
class  Happy_number 
{
	public static void main(String[] args) 
	{
		Scanner scan =new  Scanner(System.in);
		System.out.println("To print the happy number:");
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int sum=0;
		int last=0;
			while (num!=0||sum>9)
			{
				while (num!=0)
				{
				last=num%10;
				sum=sum+(last*last);
				num=num/10;
				}
				num=sum;
				sum=0;
			    if (num==1)
			    {
				System.out.println("The given number is happy number:");
			    }
		    	else
		    	{
				System.out.println("The given number is not a happy number:");
				}
		    }
	}
}
