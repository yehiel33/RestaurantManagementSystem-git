package service;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Item.
 */
public class Item {

	private int itemId;
	private String itemName;
	private double price;
	/**
	 * @param itemId represents the Item ID of Item
	 * @param itemName represents the Item name of Item
	 * @param price represents the Price of Item
	 */
	public Item (int itemId, String itemName, double price) //regular constructor
	{
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public Item (Item other) //copy constructor
	{
		this.itemId = other.itemId;
		this.itemName = other.itemName;
		this.price = other.price;
	}

	public int getItemId() { // Getters and Setters
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override // toString method
	public String toString() {
		return itemId +":"+"\t" +itemName + "\t" + price + "\t" + "nis";
	}
	
	
	
}
