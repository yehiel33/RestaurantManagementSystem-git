package scenarios;

import dataBases.MenuDB;
import dataBases.OrdersDB;
import enums.Tables;
import etc.Date;
import etc.Time;
import people.Customer;
import service.Item;
import service.Order;

public class OrdersReport {

	public static void main(String[] args) {

		Date d1 = new Date (1,1,2021);
		Date d2 = new Date (2,1,2021);
		Time t1 = new Time (01,26,00);
		
		Item i1 = new Item(1, "Pizza", 28.7);
		Item i2 = new Item(2, "Salad", 22.3);
		Item i3 = new Item(3, "Coca-Cola", 12.5);
		Item i4 = new Item(4, "Pasta", 32.6);
		Item i5 = new Item(5, "Soda", 8.5);
		Item i6 = new Item(6, "Hamburger", 42.3);
		Item i7 = new Item(7, "Rice", 11.9);
		Item i8 = new Item(8, "Orenge-Juice", 9.9);
		Item i9 = new Item(9, "Bread", 5.5);
		Item i10 = new Item(10, "Soup", 15.4);
		
		MenuDB db1 = new MenuDB();

		db1.AddItemToMenu(i1);
		db1.AddItemToMenu(i2);
		db1.AddItemToMenu(i3);
		db1.AddItemToMenu(i4);
		db1.AddItemToMenu(i5);
		db1.AddItemToMenu(i6);
		db1.AddItemToMenu(i7);
		db1.AddItemToMenu(i8);
		db1.AddItemToMenu(i9);
		db1.AddItemToMenu(i10);
		
		System.out.println(db1.toString());
		
		Customer c1 = new Customer("Ron", "Shabat", "0543298726");
		Customer c2 = new Customer("Haim", "Levi", "0504387263");
		Customer c3 = new Customer("Yosi", "Betito", "0504382300");
		
		Item [] I1 = {i1, i2, i3, i4};
		Item [] I2 = {i4, i5, i6, i7};
		Item [] I3 = {i7, i8, i9, i10};
		
		Order o1 = new Order  (1, c1, d1, t1, Tables.Big_Central, I1);
		Order o2 = new Order  (2, c2, d2, t1, Tables.Bar_2, I2);
		Order o3 = new Order  (2, c3, d1, t1, Tables.Small_Central, I3);

		OrdersDB ODB1 = new OrdersDB();
		
		ODB1.AddOrder(o1);
		ODB1.AddOrder(o2);
		ODB1.AddOrder(o3);
		
		
		System.out.println(ODB1.OrdersSum());
		
		System.out.println(ODB1.OrdersSumByDate(d1));
		
		for(int i=0; i<o1.GetItems().length;i++)
		{
			System.out.println(o1.GetItems()[i]);
		}
		
	}

}
