package scenarios;

import dataBases.OrdersDB;
import enums.Tables;
import etc.Date;
import etc.Time;
import service.Item;
import service.Order;

public class OrdersReport {

	public static void main(String[] args) {

		Date d1 = new Date (1,1,2021);
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
		
		Item [] I1 = {i1, i2, i3, i4, i5};
		Item [] I2 = {i6, i7, i8, i9, i10};
		
		Order o1 = new Order  (1,"Yoni","Mizrahi", "0543298726",  d1, t1, Tables.Big_Central, I1);
		Order o2 = new Order  (2,"Eyal", "Amar", "0504387263", d1, t1, Tables.Bar_2, I2);
		Order o3 = new Order  (2,"Dror", "Cohen", "0504382300", d1, t1, Tables.Bar_2, I2);

		OrdersDB ODB1 = new OrdersDB();
		ODB1.AddOrder(o1);
		ODB1.AddOrder(o2);
		ODB1.AddOrder(o3);
		
		System.out.println(ODB1.OrdersSum());

		
		
	}

}
