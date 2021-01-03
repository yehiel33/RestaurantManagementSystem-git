package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Employee. this object inherit from Person object
 */
import enums.Role;

public class Employee extends Person {

	private String ID;
	private int age;
	private Role role;
	private String address;
	private double hourRate;
/**
 * @param firstName represents the first name of Employee
 * @param lastName represents the last name of Employee
 * @param ID represents the ID number of Employee
 * @param age represents the age of Employee
 * @param role represents the role of Employee
 * @param address represents the address of Employee
 * @param hourRate represents the salary per hour of Employee
 */
	public Employee (String firstName, String lastName, String ID, int age, Role role, String address, double hourRate) //regular constructor
	{
		super(firstName, lastName);
		this.ID = ID;
		this.age = age;
		this.role = role;
		this.address = address;
		this.hourRate = hourRate;
	}

	public String GetID() { // Getters and Setters
		return ID;
	}
	public void SetID(String ID) {
		this.ID = ID;
	}
	public int GetAge() {
		return age;
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public Role GetRole() {
		return role;
	}
	public void SetRole(Role role) {
		this.role = role;
	}
	public String GetAddress() {
		return address;
	}
	public void SetAddress(String address) {
		this.address = address;
	}
	public double GetHourRate() {
		return hourRate;
	}
	public void SetHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	@Override // toString method
	public String toString() {
		return "Employee [ID=" + ID + ", Age=" + age + ", Role=" + role + ", Address=" + address
				+ ", HourRate=" + hourRate + ", FirstName=" + firstName + ", LastName=" + lastName + "]";
	}
	
	
}
