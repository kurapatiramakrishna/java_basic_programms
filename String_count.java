import java.util.Scanner;
class String_count 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To count the number of given string:");
		System.out.println("Enter a string:");
		String name=scan.next();
		int count=0;
		for (int  i=0 ; i<name.length(); i++)
		{
			if (name.charAt(i)!=' ')
			{
			count++;
        }
		}
		System.out.println("The number of given string name  "+name+" is="+count);
	}
}
