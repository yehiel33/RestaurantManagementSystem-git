package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents abstract object in type of Person
 */
public abstract class Person {


	protected String FirstName;
	protected String LastName;
	/**
	 * @param FirstName represents the first name of person
	 * @param LastName represents the last name of person
	 * this two parameters are protected because there are some classes that inherit from this class
	 */
	public Person (String FirstName, String LastName) //regular constructor
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public String GetFirstName() // Getters and Setters
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
	
	@Override // toString method
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	

	
}
