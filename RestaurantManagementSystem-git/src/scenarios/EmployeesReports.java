package scenarios;

import dataBases.EmployeeDB;
import enums.Role;
import people.Employee;

public class EmployeesReports {

	public static void main(String[] args) {

		EmployeeDB db1 = new EmployeeDB();
		
		Employee e1 = new Employee ("Yoni", "Mizrahi", "001", 25, Role.Cashier, "Bialik 12, Beer-Sheva", 34.5);
		Employee e2 = new Employee ("Eyal", "Amar", "002", 27, Role.Chef, "Alexander Yanai 4, Beer-Sheva", 43.2);
		Employee e3 = new Employee ("Dror", "Cohen", "003", 35, Role.Cleaner, "Ben Gurion 2, Arad", 29.12);
		Employee e4 = new Employee ("Adi", "Maman", "004", 18, Role.Hostess, "Avraham Avinu 5, Dimona", 30.1);
		Employee e5 = new Employee ("Bibi", "Gantz", "005", 25, Role.Manager, "Bialik 12, Beer-Sheva", 36.5);
		Employee e6 = new Employee ("Beni", "Netanyaho", "006", 27, Role.Chef, "Rager 4, omer", 43.2);
		Employee e7 = new Employee ("Yair", "Liberman", "007", 35, Role.Waiter, "Even Gavirol 1, Beer-Sheva", 29.9);
		Employee e8 = new Employee ("Yehiel", "Yegudayev", "008", 18, Role.Waiter, "Ha-Shaked 5, Yeruham", 33.4);
		
		db1.addEmployee(e1);
		db1.addEmployee(e2);
		db1.addEmployee(e3);
		db1.addEmployee(e4);
		db1.addEmployee(e5);
		db1.addEmployee(e6);
		db1.addEmployee(e7);
		db1.addEmployee(e8);
		
		System.out.println(db1.highHourRateEmployee());
		
		System.out.println(db1.lowHourRateEmployee());
		
		System.out.println(db1.avgHourRate());
		
		System.out.println(db1.numberOfEachRole());
	}

}
