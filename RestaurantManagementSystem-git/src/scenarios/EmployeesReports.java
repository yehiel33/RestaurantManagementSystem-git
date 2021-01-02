package scenarios;

import dataBases.EmployeeDB;
import enums.Role;
import people.Employee;

public class EmployeesReports {

	public static void main(String[] args) {

		EmployeeDB db1 = new EmployeeDB();
		
		Employee e1 = new Employee ("Yoni", "Mizrahi", "001", 25, Role.Cashier, "Bialik 12, Beer-Sheva", 34.5);
		Employee e2 = new Employee ("Eyal", "Amar", "002", 27, Role.Chef, "Alexander Yanai 4, Beer-Sheva", 43.2);
		Employee e3 = new Employee ("Dror", "Cohen", "003", 35, Role.Cleaner, "Ben Gurion 2, Beer-Sheva", 29.12);
		Employee e4 = new Employee ("Adi", "Maman", "004", 18, Role.Hostess, "Avraham Avinu 5, Beer-Sheva", 30.1);
		
		db1.AddEmployee(e1);
		db1.AddEmployee(e2);
		db1.AddEmployee(e3);
		db1.AddEmployee(e4);
		
		System.out.println(db1.PrintHighHourRateEmployee());
		System.out.println(db1.PrintLowHourRateEmployee());
		System.out.println(db1.PrintAvgHourRate());
		
		System.out.println(db1.PrintNumberOfEachRole());
	}

}
