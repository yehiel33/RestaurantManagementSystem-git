package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of order objects
 */

import people.Employee;

public class EmployeeDB { 
	
	private Employee [] employees;
	private static final int maximum_number_of_employees = 25;
	private int currentNumberOfEmployees;
	
	public EmployeeDB() { //regular constructor
		employees = new Employee [maximum_number_of_employees];
		currentNumberOfEmployees = 0;
	}
	
	public void AddEmployee(Employee employee) 
	{
		/**
		 * method that get Employee object and adding it to array of employees
		 */
		if(currentNumberOfEmployees < maximum_number_of_employees)
		{
		employees[currentNumberOfEmployees] = employee;
		currentNumberOfEmployees ++;
		}
	}
	
	public String HighHourRateEmployee()
	{
		/**
		 * method that returns the full name of employee that have the highest hour rate
		 */
		String Str = "";
		double highHourRate = 0;
		String fullName = "";
		
		for(int i = 0; i < currentNumberOfEmployees; i++)
		{
			if(employees [i].GetHourRate() > highHourRate)
			{
				highHourRate = employees [i].GetHourRate();
				fullName = employees [i].GetFirstName() + " " + employees [i].GetLastName();
			}
		}
		
		Str = "The Employee With The Highest Hour Rate Is: " + fullName + ", And His Hour Rate Is: " + highHourRate;
		
		return Str;
	}

	public String LowHourRateEmployee()
	{
		/**
		 * method that returns the full name of employee that have the lowest hour rate
		 */
		String Str = "";
		String Name = employees [0].GetFirstName()+ " " + employees [0].GetLastName();
		
		double lowHourRate=employees[0].GetHourRate();

		for(int i = 1; i < currentNumberOfEmployees; i++)
		{
			if(employees [i].GetHourRate() < lowHourRate)
			{
				lowHourRate = employees [i].GetHourRate();
				Name = employees [i].GetFirstName() + " " + employees [i].GetLastName();
			}
		}
		
		Str = "The Employee With The lowest Hour Rate Is: " + Name + ", And His Hour Rate Is: " + lowHourRate;
		
		return Str;
	}

	public String avgHourRate()
	{
		/**
		 * method that returns the average hour rate
		 */
		double avgHourRate = 0;
		String Str = "";
		for(int i=0; i<currentNumberOfEmployees;i++)
		{
			avgHourRate+=employees [i].GetHourRate();
		}
		Str = "The Average Hour Rate is: "  + Math.round(avgHourRate/currentNumberOfEmployees);
		return Str;
		
	}

	public String NumberOfEachRole()
	{
		/**
		 * method that returns string that list the number of each role
		 */
		int numOfManager= 0;
		int numOfWaiter= 0;
		int numOfHostess= 0;
		int numOfCashier= 0;
		int numOfCleaner= 0;
		int numOfChef= 0;
		String Str = "";
		
		for(int i=0; i<currentNumberOfEmployees;i++)
		{
			switch(employees [i].GetRole())
			{
			case Manager:
				numOfManager++;
				break;
			case Waiter:
				numOfWaiter++;
				break;
			case Hostess:
				numOfHostess++;
				break;
			case Cashier:
				numOfCashier++;
				break;
			case Cleaner:
				numOfCleaner++;
				break;
			case Chef:
				numOfChef++;
				break;

				
			}
		}
		Str = "----------------------------------------------"
				+ "\n The number Of Managers is:" + numOfManager
				+ "\n The number Of Waiters is:" + numOfWaiter
				+ "\n The number Of Hostess is:" + numOfHostess
				+ "\n The number Of Cashier is:" + numOfCashier
				+ "\n The number Of Cleaner is:" + numOfCleaner
				+ "\n The number Of Chef is:" + numOfChef
				+"\n----------------------------------------------";
			
		return Str;
		
	}

}
