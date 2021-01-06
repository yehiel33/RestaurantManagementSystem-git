package etc;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 */
public class Time {
	
	//Defining objects
	private int hour;
	private int minute;
	private int second;
	/**
	 * 
	 * @param hour represents the hour in Time class
	 * @param minute represents the minute in Time class
	 * @param second represents the second in Time class
	 */
	public Time (int h, int m, int s) //constructor
	{
		hour = h; //Inserts the value into the object
		
		if ( (hour < 0) || (hour > 23) ) //Check whether the number that given exceeds the limits
			hour = 0; //If so, initializes it
			
		minute = m; //Inserts the value into the object
		
		if ( (minute < 0) || (minute > 59) ) //Check whether the number that given exceeds the limits
			minute = 0; //If so, initializes it
			
		second = s; //Inserts the value into the object
		
		if ( (s < 0) || (s > 59) ) //Check whether the number that given exceeds the limits
			second = 0; //If so, initializes it
	}
	
	public Time(Time other) // copy constructor
	{
		this.hour = other.hour;
		this.minute = other.minute;
		this.second = other.second;
	}
	
	public int getHour() //A method that returns the value of the object hour
	{
		return hour;
	}
	
	public int getMinute() //A method that returns the value of the object minute
	{
		return minute;
	}
	
	public int getSecond() //A method that returns the value of the object second
	{
		return second;
	}
	
	public void setHour (int num) //A method that changes the value of the object hour
	{
		if (num >= 0 && num < 24)//Check whether the number that given is within the limits
			hour = num; //Changes the value
	}
	
	public void setMinute (int num) //A method that changes the value of the object minute
	{
		if (num >= 0 && num < 60)//Check whether the number that given is within the limits
			minute = num; //Changes the value
	}
	
	public void setSecond (int num) //A method that changes the value of the object second
	{
		if (num >= 0 && num < 60)//Check whether the number that given is within the limits
			second = num; //Changes the value
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
	public String toString() //A method that returns the time
	{
		String timeStr = "";

		timeStr = myIntToString (hour) + ":" + myIntToString (minute) + ":" + myIntToString (second);

		return timeStr;
	}

}
