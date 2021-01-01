package people;

public abstract class Person {

	protected String FirstName;
	protected String LastName;
	
	public Person (String FirstName, String LastName)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public String GetFirstName()
	{
		return FirstName;
	}

	public void SetFirstName(String FirstName)
	{
		this.FirstName = FirstName;
	}
	
	public String GetLastName()
	{
		return LastName;
	}
	
	public void SetLastName(String LastName)
	{
		this.LastName = LastName;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	

	
}
