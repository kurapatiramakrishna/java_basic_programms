class Leap_year_or_not
{
	public static void main(String[] args) 
	{
		int year=2024;
		if (year%400==0)
		{
			System.out.println(year+" leap year!");
		}
		else if (year%4==0 && year%100!=0)
		{
			System.out.println(year+" leap year");
		}
		else
		{
			System.out.println(year+" not leap year");
		}
		
	}
}
