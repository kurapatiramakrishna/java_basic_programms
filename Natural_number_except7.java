import java.util.Scanner;
class Natural_number_except7
{
	public static void main(String[] args)
		{
   Scanner scan=new Scanner(System.in);
   System.out.println("To print the natural numbers :..");
    System.out.println("The natural number  from "+1+" to "+10+" is:");
	 	for (int a=1;a<=10 ;a++)

		{
			if(a==7) 
		       continue;
			System.out.println(a);
		}
		}
}
