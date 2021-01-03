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
	public Item (int ItemId, String ItemName, double Price) //regular constructor
	{
		this.itemId = ItemId;
		this.itemName = ItemName;
		this.price = Price;
	}
	public Item (Item other) //copy constructor
	{
		this.itemId = other.itemId;
		this.itemName = other.itemName;
		this.price = other.price;
	}

	public int GetItemId() { // Getters and Setters
		return itemId;
	}
	public void SetItemId(int itemId) {
		this.itemId = itemId;
	}
	public String GetItemName() {
		return itemName;
	}
	public void SetItemName(String itemName) {
		this.itemName = itemName;
	}
	public double GetPrice() {
		return price;
	}
	public void SetPrice(double price) {
		this.price = price;
	}

	@Override // toString method
	public String toString() {
		return itemId +":"+"\t" +itemName + "\t" + price + "\t" + "nis";
	}
	
	
	
}
