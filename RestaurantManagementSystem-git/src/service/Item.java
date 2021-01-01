package service;

public class Item {

	private int ItemId;
	private String ItemName;
	private double Price;
	
	public Item (int ItemId, String ItemName, double Price)
	{
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.Price = Price;
	}

	public int GetItemId() {
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

	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", ItemName=" + ItemName + ", Price=" + Price
				+ "]";
	}
	
	
	
}
