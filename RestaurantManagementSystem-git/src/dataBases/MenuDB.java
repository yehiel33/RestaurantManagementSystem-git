package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of item objects
 */

import service.Drink;
import service.Food;
import service.Item;

public class MenuDB {
	
	private Item [] menu;
	 /**
	  * @param menu represents array of items 
	  */
	public MenuDB() { //default constructor
			menu = new Item[1];
	}
	
	public void addItemToMenu(Item item)
	{
		/**
		 * method that get Item object and adding it to array
		 */

		menu[menu.length - 1] = item;
		menu = increaseMenu(menu);
	}
	
	public Item [] increaseMenu (Item[] oldMenu)
	{
		/**
		 * method that increases array when adding new object
		 */
		Item [] newMenu = new Item[oldMenu.length + 1];
		for(int i = 0; i < oldMenu.length; i++)
		{
			newMenu[i] = oldMenu[i];
		}
		return newMenu;
	}
	
	public void removeItemFromMenu(Item itemToDelete)
	{
		/**
		 * method that get Item object and adding it to array
		 */

		menu = decreaseMenu(menu, itemToDelete);
	}
	
	public Item [] decreaseMenu (Item[] oldMenu, Item itemToDelete)
	{
		/**
		 * method that increases array when adding new object
		 */
		Item [] newMenu = new Item[oldMenu.length - 1];
		for(int i = 0; i < oldMenu.length; i++)
		{
			if(oldMenu[i].isEquals(itemToDelete))
				newMenu[i] = oldMenu[i+1];
			
			else
				newMenu[i] = oldMenu[i];
		}
		return newMenu;
	}
	
	@Override // toString method
	public String toString()
	{
		String str = "The Menu Is:\n\n";
		String strFood = "";
		String strDrink = "";
		String strItem="";
		
		for(int i = 0; i < menu.length-1; i++)
		{
			if(menu[i] instanceof Food)
				strFood += menu[i].toString() + "\n";
			
			else if (menu[i] instanceof Drink)
				strDrink += menu[i].toString() + "\n";
			
			else
				strItem += menu[i].toString() + "\n";
		}
		
		return (str + strItem + strFood + strDrink);
	}
}