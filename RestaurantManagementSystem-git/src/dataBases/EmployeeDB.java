package dataBases;

import enums.Role;
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String PrintLowHourRateEmployee()
	{
		String Str = "";
		String Name = Employees [0].GetFirstName()+ " " + Employees [0].GetLastName();
		
		double LowHourRate=Employees[0].GetHourRate();

		for(int i = 1; i < Counter; i++)
		{
			if(Employees [i].GetHourRate() < LowHourRate)
			{
				LowHourRate = Employees [i].GetHourRate();
				Name = Employees [i].GetFirstName() + " " + Employees [i].GetLastName();
			}
		}
		
		Str = "The Employee With The lowest Hour Rate Is: " + Name + ", And His Hour Rate Is: " + LowHourRate;
		
		return Str;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String PrintAvgHourRate()
	{
		double AvgHourRate = 0;
		String Str = "";
		for(int i=0; i<Counter;i++)
		{
			AvgHourRate+=Employees [i].GetHourRate();
		}
		Str = "The Average Hour Rate is: "  + Math.round(AvgHourRate/Counter);
		return Str;
		
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String PrintNumberOfEachRole()
	{
		int numOfManager= 0;
		int numOfWaiter= 0;
		int numOfHostess= 0;
		int numOfCashier= 0;
		int numOfCleaner= 0;
		int numOfChef= 0;
		String Str = "";
		
		for(int i=0; i<Counter;i++)
		{
			switch(Employees [i].GetRole())
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
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
