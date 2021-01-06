package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Customer. this object inherit from Person object
 */
public class Customer extends Person {

	private String phoneNumber;
	/**
	 * @param firstName represents the first name of Customer
 	 * @param lastName represents the last name of Customer
	 * @param phoneNumber represents the phone number of Customer
	 */
	public Customer (String firstName, String lastName, String phoneNumber) //regular constructor
	{
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
	}

	public Customer (Customer other) //copy constructor
	{
		super(other.firstName, other.lastName);
		this.phoneNumber = other.phoneNumber;
	}
	
	public String getPhoneNumber() { // Getters and Setters
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override // toString method
	public String toString() {
		return "Customer: " + firstName +" " + lastName+", "+ phoneNumber +"\n";
				
	}
	
}
