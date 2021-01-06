package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of item objects
 */
import service.Item;

public class MenuDB {

	private Item [] menu;
	private static final int MAXIMUM_NUMBER_OF_ITEMS = 20;
	private int currentNumberOfItems;
	 
	public MenuDB() { //regular constructor
		menu = new Item [MAXIMUM_NUMBER_OF_ITEMS];
		currentNumberOfItems = 0;
	}
	
	public void addItemToMenu(Item item)
	{
		/**
		 * method that get Item object and adding it to array
		 */
		if(currentNumberOfItems < MAXIMUM_NUMBER_OF_ITEMS)
		{
		menu[currentNumberOfItems] = item;
		currentNumberOfItems ++;
		}
	}
	
	@Override // toString method
	public String toString()
	{
		String str = "The Menu Is:\n\n";
		for(int i = 0; i < currentNumberOfItems; i++)
			str += menu[i].toString() + "\n";
		
		return str;
	}
}