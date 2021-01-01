package people;

import enums.Role;

public class Employee extends Person {

	private String ID;
	private int Age;
	private Role Role;
	private String Address;
	private double HourRate;
	
	public Employee (String FirstName, String LastName, String ID, int Age, Role Role, String Address, double HourRate)
	{
		super(FirstName, LastName);
		this.ID = ID;
		this.Age = Age;
		this.Role = Role;
		this.Address = Address;
		this.HourRate = HourRate;
	}

	public String GetID() {
		return ID;
	}

	public void SetID(String ID) {
		this.ID = ID;
	}

	public int GetAge() {
		return Age;
	}

	public void SetAge(int Age) {
		this.Age = Age;
	}

	public Role GetRole() {
		return Role;
	}

	public void SetRole(Role Role) {
		this.Role = Role;
	}

	public String GetAddress() {
		return Address;
	}

	public void SetAddress(String Address) {
		this.Address = Address;
	}

	public double GetHourRate() {
		return HourRate;
	}

	public void SetHourRate(double HourRate) {
		this.HourRate = HourRate;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Age=" + Age + ", Role=" + Role + ", Address=" + Address
				+ ", HourRate=" + HourRate + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}
