package dataBases;

import service.Item;

public class MenuDB {

	private Item [] Menu;
	private int TheNumberOfItems = 20;
	private int Counter;
	
	public MenuDB() {
		Menu = new Item [TheNumberOfItems];
		Counter = 0;
	}
	
	public void AddItemToMenu(Item item)
	{
		if(Counter < TheNumberOfItems)
		{
		Menu[Counter] = item;
		Counter ++;
		}
	}
	
	@Override 
	public String toString()
	{
		String Str = "";
		for(int i = 0; i < Counter; i++)
			Str += Menu[i].toString() + "\n";
		
		return Str;
	}
}