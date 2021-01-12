package service;

/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Food that inherits from Item.
 */

public class Food extends Item {

	public String info;
/**

 * @param itemId represents the id of the item
 * @param itemName represents the name of the item
 * @param price represents the price of the item
 * @param info represents the additional information of the item
 */
	public Food (int itemId, String itemName, double price, String info) { //regular constructor
		super(itemId, itemName, price);
		this.info = info;
	}
	
	public Food (int itemId, String itemName, double price) //regular constructor
	{
		super(itemId, itemName, price);
		this.info = "";
	}

	public String getInfo() { // Getters and Setters
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override // toString method
	public String toString() {
		return (super.toString() + " " + info);
	}
	
}
