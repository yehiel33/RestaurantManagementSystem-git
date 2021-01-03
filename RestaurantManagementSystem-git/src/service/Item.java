package service;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Item.
 */
public class Item {

	private int ItemId;
	private String ItemName;
	private double Price;
	/**
	 * @param ItemId represents the Item ID of Item
	 * @param ItemName represents the Item name of Item
	 * @param Price represents the Price of Item
	 */
	public Item (int ItemId, String ItemName, double Price) //regular constructor
	{
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.Price = Price;
	}
	public Item (Item other) //copy constructor
	{
		this.ItemId = other.ItemId;
		this.ItemName = other.ItemName;
		this.Price = other.Price;
	}

	public int GetItemId() { // Getters and Setters
		return ItemId;
	}
	public void SetItemId(int ItemId) {
		this.ItemId = ItemId;
	}
	public String GetItemName() {
		return ItemName;
	}
	public void SetItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public double GetPrice() {
		return Price;
	}
	public void SetPrice(double Price) {
		this.Price = Price;
	}

	@Override // toString method
	public String toString() {
		return ItemId +":"+"\t" +ItemName + "\t" + Price + "\t" + "nis";
	}
	
	
	
}
