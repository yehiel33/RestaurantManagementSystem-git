package scenarios;

import dataBases.MenuDB;
import dataBases.OrdersDB;
import enums.Tables;
import enums.Volume;
import etc.Date;
import etc.Time;
import people.Customer;
import service.Drink;
import service.Food;
import service.Item;
import service.Order;

public class OrdersReport {

	public static void main(String[] args) {

		Date d1 = new Date (1,1,2021);
		Date d2 = new Date (2,1,2021);
		
		Time t1 = new Time (01,26,00);
		Time t2 = new Time (01,30,00);
		Time t3 = new Time (01,42,30);
		
		Customer c1 = new Customer("Ron", "Shabat", "0543298726");
		Customer c2 = new Customer("Haim", "Levi", "0504387263");
		Customer c3 = new Customer("Yosi", "Betito", "0504382300");
		
		Food f1 = new Food(1, "Pizza", 35, "dairy");
		Food f2 = new Food(2, "Burger", 42, "meaty");
		Food f3 = new Food(3, "Rice", 12.9,"basmatic");
		Food f4 = new Food(4, "Pasta", 21.8, "napolitana");
		Food f5 = new Food(5, "Salad", 31.6, "ceaser");
		Food f6 = new Food(6, "Bread", 11.3);

		Drink dr1 = new Drink(7, "Cola", 15.5, Volume.A_Liter_And_a_Half);
		Drink dr2 = new Drink(8, "Water", 8, Volume.One_Third_Of_A_Liter);
		Drink dr3 = new Drink(9, "Fanta", 12.5,Volume.Half_A_Litr);
		Drink dr4 = new Drink(10, "Beer", 20, Volume.Half_A_Litr);
		Drink dr5 = new Drink(11, "Soda", 9, Volume.One_Third_Of_A_Liter);

		
		MenuDB db1 = new MenuDB();
		
		db1.addItemToMenu(f1);
		db1.addItemToMenu(f2);
		db1.addItemToMenu(f3);
		db1.addItemToMenu(f4);
		db1.addItemToMenu(f5);
		db1.addItemToMenu(f6);
		db1.addItemToMenu(dr1);
		db1.addItemToMenu(dr2);
		db1.addItemToMenu(dr3);
		db1.addItemToMenu(dr4);
		db1.addItemToMenu(dr5);
		
		System.out.println(db1.toString());
			
		Item [] I1 = {f1, f2, f3, f4,f6,dr2,dr3,dr3};
		Item [] I2 = {f4, dr1, dr2, f4};
		Item [] I3 = {f4, dr5, dr1, dr2,f3};
		
		Order o1 = new Order  (1, c1, d1, t1, Tables.Big_Central,I1);
		Order o2 = new Order  (2, c2, d2, t2, Tables.Bar_2, I2);
		Order o3 = new Order  (3, c3, d1, t3, Tables.Small_Central, I3);
		
		OrdersDB orderDB1 = new OrdersDB();
		
		orderDB1.addOrder(o1);
		orderDB1.addOrder(o2);
		orderDB1.addOrder(o3);
		
		
		System.out.println(orderDB1.toString());
		
		System.out.println(orderDB1.ordersSum());
		
		System.out.println(orderDB1.ordersSumByDate(d1));
		

		
	}

}
