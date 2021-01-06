package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents abstract object in type of Person
 */
public abstract class Person {


	protected String firstName;
	protected String lastName;
	/**
	 * @param firstName represents the first name of person
	 * @param lastName represents the last name of person
	 * this two parameters are protected because there are some classes that inherit from this class
	 */
	public Person (String firstName, String lastName) //regular constructor
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() // Getters and Setters
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Override // toString method
	public String toString() {
		return firstName + " " + lastName;
	}
	

	
}
