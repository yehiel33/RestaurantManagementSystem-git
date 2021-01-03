package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Employee. this object inherit from Person object
 */
import enums.Role;

public class Employee extends Person {

	private String ID;
	private int Age;
	private Role Role;
	private String Address;
	private double HourRate;
/**
 * 	
 * @param FirstName represents the first name of Employee
 * @param LastName represents the last name of Employee
 * @param ID represents the ID number of Employee
 * @param Age represents the age of Employee
 * @param Role represents the role of Employee
 * @param Address represents the address of Employee
 * @param HourRate represents the salary per hour of Employee
 */
	public Employee (String FirstName, String LastName, String ID, int Age, Role Role, String Address, double HourRate) //regular constructor
	{
		super(FirstName, LastName);
		this.ID = ID;
		this.Age = Age;
		this.Role = Role;
		this.Address = Address;
		this.HourRate = HourRate;
	}

	public String GetID() { // Getters and Setters
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

	@Override // toString method
	public String toString() {
		return "Employee [ID=" + ID + ", Age=" + Age + ", Role=" + Role + ", Address=" + Address
				+ ", HourRate=" + HourRate + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
}
