class  Product_factor_from100_multipli
{
	public static void main(String[] args) 
	{
		int product=1;
	   int x=100;
		for (int a=1;a<=x;a++ )
		{
	if (x%a==0)
	{
		product=product*a;
	}
	}
        System.out.println("The product factors of "+x+" is = "+product);
}
}

