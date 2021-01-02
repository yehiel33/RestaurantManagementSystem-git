package people;

public class Customer extends Person {

	private String PhoneNumber;
	
	public Customer (String FirstName, String LastName, String PhoneNumber)
	{
		super(FirstName, LastName);
		this.PhoneNumber = PhoneNumber;
	}

	public Customer (Customer other)
	{
		super(other.FirstName, other.LastName);
		this.PhoneNumber = other.PhoneNumber;
	}
	
	public String GetPhoneNumber() {
		return PhoneNumber;
	}

	public void SetPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [PhoneNumber=" + PhoneNumber + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ "]";
	}
	
}
