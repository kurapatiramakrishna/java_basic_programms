import java.util.Scanner;
class multipilication_of3_and_7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("to print the multiplication factor:..");
      for (int a=3;a<=7 ;a++ )
      {
		    System.out.println("the "+a+" table is..");
		  for (int i=1;i<=10 ;i++ )
		  {
			  System.out.println(+a+" x"+i+"="+i*a);
		  }
	  }
	  
	  }

}
