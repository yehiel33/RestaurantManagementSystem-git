package etc;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 */
public class Date {
	
	//Defining objects
	private int day;
	private int month;
	private int year;
	/**
	 * @param day represents the day in Date class
	 * @param month represents the month in Date class
	 * @param year represents the year in Date class
	 */
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
	
	public int getDay() //A method that returns the value of the object day
	{
		return day;
	}
	
	public int getMonth() //A method that returns the value of the object month
	{
		return month;
	}
	
	public int getYear() //A method that returns the value of the object year
	{
		return year;
	}
	
	public void setDay(int num) //A method that changes the value of the object day
	{
		day = num; //Changes the value
	}
	
	public void setMonth(int num) //A method that changes the value of the object month
	{
		month = num; //Changes the value
	}
	
	public void setYear(int num) //A method that changes the value of the object year
	{
		year = num; //Changes the value
	}
	
	public boolean isEquals(Date other) 
	{
		/**
		 * method that return true if two dates are equals
		 */
		return ((day==other.day) && (month==other.month) && (year==other.year));
	}
	
    private String myIntToString(int num) //A method that converts the number to text
    {
        String numStr = "";
        
        if ( (num >= 0) && (num < 10) ) //If there is one digit
        {
            numStr = "0"; //Adds 0
        }
        
        numStr = numStr + String.valueOf(num); //Otherwise, the original number will appear
        
        return numStr;
    }
	
	@Override
	public String toString() //A method that returns the date
	{
		String str = "";
		str = myIntToString(day) + "/" + myIntToString(month) + "/" + year;
		return str;
	}
}
