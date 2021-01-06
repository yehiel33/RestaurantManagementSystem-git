package people;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Employee. this object inherit from Person object
 */
import enums.Role;

public class Employee extends Person {

	private String id;
	private int age;
	private Role role;
	private String address;
	private double hourRate;
/**
 * @param firstName represents the first name of Employee
 * @param lastName represents the last name of Employee
 * @param id represents the ID number of Employee
 * @param age represents the age of Employee
 * @param role represents the role of Employee
 * @param address represents the address of Employee
 * @param hourRate represents the salary per hour of Employee
 */
	public Employee (String firstName, String lastName, String id, int age, Role role, String address, double hourRate) //regular constructor
	{
		super(firstName, lastName);
		this.id = id;
		this.age = age;
		this.role = role;
		this.address = address;
		this.hourRate = hourRate;
	}

	public String getId() { // Getters and Setters
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Role setRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHourRate() {
		return hourRate;
	}
	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	@Override // toString method
	public String toString() {
		return "Employee [ID=" + id + ", Age=" + age + ", Role=" + role + ", Address=" + address
				+ ", HourRate=" + hourRate + ", FirstName=" + firstName + ", LastName=" + lastName + "]";
	}
	
	
}
