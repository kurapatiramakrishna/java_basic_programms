class Sumof_digit_factorial 
{
		public static void main(String[] args) 
	{
		System.out.println("To print the sum of the factorial value of the given digit:");
		int  num=345;
	    int   sum=0;
        int last=0;
		int product=1;
	    for(int a=1;a<=num;a++)
		{
			last=num%10;
		product=product*a;
		sum=sum+num; 
	    num=num/10;
		}
        System.out.println(sum);
	}
}
