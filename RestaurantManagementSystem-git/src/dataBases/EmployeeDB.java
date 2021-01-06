package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of order objects
 */

import java.text.DecimalFormat;

import people.Employee;

public class EmployeeDB { 
	
	private Employee [] employees;
	private static final int MAXIMUM_NUMBER_OF_EMPLOYEES = 25;
	private int currentNumberOfEmployees;
	
	public EmployeeDB() { //regular constructor
		employees = new Employee [MAXIMUM_NUMBER_OF_EMPLOYEES];
		currentNumberOfEmployees = 0;
	}
	
	public void addEmployee(Employee employee) 
	{
		/**
		 * method that get Employee object and adding it to array of employees
		 */
		if(currentNumberOfEmployees < MAXIMUM_NUMBER_OF_EMPLOYEES)
		{
		employees[currentNumberOfEmployees] = employee;
		currentNumberOfEmployees ++;
		}
	}
	
	public String highHourRateEmployee()
	{
		/**
		 * method that returns the full name of employee that have the highest hour rate
		 */
		String str = "";
		double highHourRate = 0;
		String fullName = "";
		
		for(int i = 0; i < currentNumberOfEmployees; i++)
		{
			if(employees [i].getHourRate() > highHourRate)
			{
				highHourRate = employees [i].getHourRate();
				fullName = employees [i].getFirstName() + " " + employees [i].getLastName();
			}
		}
		
		str = "The Employee With The Highest Hour Rate Is: " + fullName + ", \nAnd His Hour Rate Is: " + highHourRate + "\n";
		
		return str;
	}

	public String lowHourRateEmployee()
	{
		/**
		 * method that returns the full name of employee that have the lowest hour rate
		 */
		String str = "";
		String name = employees [0].getFirstName()+ " " + employees [0].getLastName();
		
		double lowHourRate=employees[0].getHourRate();

		for(int i = 1; i < currentNumberOfEmployees; i++)
		{
			if(employees [i].getHourRate() < lowHourRate)
			{
				lowHourRate = employees [i].getHourRate();
				name = employees [i].getFirstName() + " " + employees [i].getLastName();
			}
		}
		
		str = "The Employee With The lowest Hour Rate Is: " + name + ", \nAnd His Hour Rate Is: " + lowHourRate + "\n";
		
		return str;
	}

	public String avgHourRate()
	{
		/**
		 * method that returns the average hour rate
		 */
		double avgHourRate = 0;
		String str = "";
		for(int i=0; i<currentNumberOfEmployees;i++)
		{
			avgHourRate+=employees [i].getHourRate();
		}
		DecimalFormat df = new DecimalFormat("#.###");

		str = "The Average Hour Rate is: "  + df.format(avgHourRate/currentNumberOfEmployees) + "\n";
		return str;
		
	}

	public String numberOfEachRole()
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
		String str = "";
		
		for(int i=0; i<currentNumberOfEmployees;i++)
		{
			switch(employees [i].setRole())
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
		str = "----------------------------------------------"
				+ "\nEmployees Report:\n"
				+ "\n Managers:	" + numOfManager
				+ "\n Waiters:	" + numOfWaiter
				+ "\n Hostess:	" + numOfHostess
				+ "\n Cashiers:	" + numOfCashier
				+ "\n Cleaners:	" + numOfCleaner
				+ "\n Chefs:		" + numOfChef
				+"\n----------------------------------------------";
			
		return str;
		
	}

}
