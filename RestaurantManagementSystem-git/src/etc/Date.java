package etc;

public class Date {
	
	//Defining objects
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) // parameter constructor
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date other) // copy constructor
	{
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}
	
	public int GetDay() //A method that returns the value of the object day
	{
		return day;
	}
	
	public int GetMonth() //A method that returns the value of the object month
	{
		return month;
	}
	
	public int GetYear() //A method that returns the value of the object year
	{
		return year;
	}
	
	public void SetDay(int num) //A method that changes the value of the object day
	{
		day = num; //Changes the value
	}
	
	public void SetMonth(int num) //A method that changes the value of the object month
	{
		month = num; //Changes the value
	}
	
	public void SetYear(int num) //A method that changes the value of the object year
	{
		year = num; //Changes the value
	}
	
	@Override
	public String toString() //A method that returns the date
	{
		String Str = "";
		Str = day + "/" + month + "/" + year;
		return Str;
	}
}
