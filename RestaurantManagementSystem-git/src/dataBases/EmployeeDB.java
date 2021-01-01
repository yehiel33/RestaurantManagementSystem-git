package dataBases;

import people.Employee;

public class EmployeeDB {

	private Employee [] Employees;
	private int TotalEmployeeNumber = 20;
	private int Counter;
	
	public EmployeeDB() {
		Employees = new Employee [TotalEmployeeNumber];
		Counter = 0;
	}
	
	public void AddEmployee(Employee employee)
	{
		if(Counter < TotalEmployeeNumber)
		{
		Employees[Counter] = employee;
		Counter ++;
		}
	}
	
	public String PrintHighHourRateEmployee()
	{
		String Str = "";
		double HighHourRate = 0;
		String Name = "";
		
		for(int i = 0; i < Counter; i++)
		{
			if(Employees [i].GetHourRate() > HighHourRate)
			{
				HighHourRate = Employees [i].GetHourRate();
				Name = Employees [i].GetFirstName() + " " + Employees [i].GetLastName();
			}
		}
		
		Str = "The Employee With The Highest Hour Rate Is: " + Name + ", And His Hour Rate Is: " + HighHourRate;
		
		return Str;
	}
	
}
