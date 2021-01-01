package scenarios;

import dataBases.MenuDB;
import service.Item;

public class MenuReports {

	public static void main(String[] args) {

		MenuDB db1 = new MenuDB();
		
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
	}

}
