package scenarios;

import dataBases.MenuDB;
import enums.Volume;
import service.Drink;
import service.Food;

public class MenuReports {

	public static void main(String[] args) {

		MenuDB db1 = new MenuDB();
		
		Food f1 = new Food(1, "Pizza", 35, "dairy");
		Food f2 = new Food(2, "Burger", 42, "meaty");
		Food f3 = new Food(3, "Rice", 12.9,"basmatic");
		Food f4 = new Food(4, "Pasta", 21.8, "napolitana");
		Food f5 = new Food(5, "Salad", 31.6, "ceaser");
		Food f6 = new Food(6, "Bread", 11.3);

		Drink d1 = new Drink(7, "Cola", 15.5, Volume.A_Liter_And_a_Half);
		Drink d2 = new Drink(8, "Water", 8, Volume.One_Third_Of_A_Liter);
		Drink d3 = new Drink(9, "Fanta", 12.5,Volume.Half_A_Litr);
		Drink d4 = new Drink(10, "Beer", 20, Volume.Half_A_Litr);
		Drink d5 = new Drink(11, "Soda", 9, Volume.One_Third_Of_A_Liter);
		
		db1.addItemToMenu(f1);
		db1.addItemToMenu(f2);
		db1.addItemToMenu(f3);
		db1.addItemToMenu(f4);
		db1.addItemToMenu(f5);
		db1.addItemToMenu(f6);
		db1.addItemToMenu(d1);
		db1.addItemToMenu(d2);
		db1.addItemToMenu(d3);
		db1.addItemToMenu(d4);
		db1.addItemToMenu(d5);
		
		System.out.println(db1.toString());
	}

}
