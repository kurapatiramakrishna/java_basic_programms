import java.util.Scanner;
class Perfect_number_or_not
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	     System.out.println("To print the perfect number or not:");
	         System.out.println("Enter the perfect numebr:.");
			 int n=scan.nextInt();
			 int sum=0;
		    for (int a=1;a<n ;a++ )                                 //(a<=n/2,a<=n)
		    {
		        if (n%a==0)
		    {
            sum=sum+a;
	      	}
			}
			if (sum==n)
			{
				 	System.out.println(n+"It is a perfect number");
			}
			else 
		{
				System.out.println(n+" It is not perfect number");
		}
	}
	}
