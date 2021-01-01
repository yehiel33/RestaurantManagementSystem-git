package service;

import java.util.Arrays;

import etc.Date;
import etc.Time;
import enums.Tables;

public class Order {

	private int OrderId;
	private Date OrderDate;
	private Time OrderTime;
	private Tables Table;
	private Item [] Items;
	
	public Order (int OrderId, Date OrderDate, Time OrderTime, Tables Table, Item [] Items)
	{
		this.OrderId = OrderId;
		this.OrderDate = new Date(OrderDate);
		this.OrderTime = new Time(OrderTime);
		this.Table = Table;
		this.Items = Items;
	}
	
	public int GetOrderId() {
		return OrderId;
	}

	public void SetOrderId(int OrderId) {
		this.OrderId = OrderId;
	}

	public Date GetOrderDate() {
		return OrderDate;
	}

	public void SetOrderDate(Date OrderDate) {
		this.OrderDate = OrderDate;
	}

	public Time GetOrderTime() {
		return OrderTime;
	}

	public void SetOrderTime(Time OrderTime) {
		this.OrderTime = OrderTime;
	}

	public Tables GetTable() {
		return Table;
	}

	public void SetTable(Tables Table) {
		this.Table = Table;
	}
	
	public Item[] GetItems() {
		return Items;
	}

	public void SetItems(Item[] Items) {
		this.Items = Items;
	}

	@Override
	public String toString() {
		return "Order [OrderDate=" + OrderDate + ", OrderTime=" + OrderTime + ", OrderId=" + OrderId
				+ ", Items=" + Arrays.toString(Items) + "]";
	}
		
}
