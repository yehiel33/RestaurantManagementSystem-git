package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Employee. this object inherit from Person object
 */
public class Customer extends Person {

	private String PhoneNumber;
	/**
	 * 
	 * @param FirstName represents the first name of Customer
 	 * @param LastName represents the last name of Customer
	 * @param PhoneNumber represents the phone number of Customer
	 */
	public Customer (String FirstName, String LastName, String PhoneNumber) //regular constructor
	{
		super(FirstName, LastName);
		this.PhoneNumber = PhoneNumber;
	}

	public Customer (Customer other) //copy constructor
	{
		super(other.FirstName, other.LastName);
		this.PhoneNumber = other.PhoneNumber;
	}
	
	public String GetPhoneNumber() { // Getters and Setters
		return PhoneNumber;
	}
	public void SetPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	@Override // toString method
	public String toString() {
		return "Customer [PhoneNumber=" + PhoneNumber + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ "]";
	}
	
}
