class Count_factors 
{
	public static void main(String[] args) 
	{
		int count=0;
		int x=10;
		for (int a=1;a<=x ;a++ )
	        	{
		         	if (x%a==0)
			    {
				count++;
		       	}
		      }
              System.out.println(" The count factors are:"+count);
      	}
}
	

