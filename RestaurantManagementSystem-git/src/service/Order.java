package service;

import java.util.Arrays;

import enums.Tables;
import etc.Date;
import etc.Time;
import people.Customer;

public class Order {

	private int OrderId;
	private Customer customer;
	private Date OrderDate;
	private Time OrderTime;
	private Tables Table;
	private Item [] Items;
	
	public Order (int OrderId,String FirstName,String LastName,String PhoneNumber , Date OrderDate, Time OrderTime, Tables Table, Item [] Items)
	{
		this.OrderId = OrderId;
		this.customer = new Customer(FirstName, LastName, PhoneNumber);
		this.OrderDate = new Date(OrderDate);
		this.OrderTime = new Time(OrderTime);
		this.Table = Table;
		this.Items = Items;
	}
	
	public Order (int OrderId, Customer customer, Date OrderDate, Time OrderTime, Tables Table, Item [] Items)
	{
		this.OrderId = OrderId;
		this.customer = new Customer(customer);
		this.OrderDate = new Date(OrderDate);
		this.OrderTime = new Time(OrderTime);
		this.Table = Table;
		this.Items = Items;
	}
	
	/*public Order (int OrderId, Customer customer, Date OrderDate, Time OrderTime, Tables Table, Item [] Items)
	{
		this.OrderId = OrderId;
		this.customer = new Customer(customer);
		this.OrderDate = new Date(OrderDate);
		this.OrderTime = new Time(OrderTime);
		this.Table = Table;
		this.Items = Items;
		for(int i=0; i<Items.length;i++)
		{
			this.Items[i]=new Item (Items[i]);
		}
	}
	*/
	
	public int GetOrderId() {
		return OrderId;
	}

	public void SetOrderId(int OrderId) {
		this.OrderId = OrderId;
	}
	public Customer GetCustomer() {
		return customer;
	}

	public void SetCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date GetOrderDate() {
		return new Date (OrderDate);
	}

	public void SetOrderDate(Date OrderDate) {
		this.OrderDate = new Date (OrderDate);
	}

	public Time GetOrderTime() {
		return new Time (OrderTime);
	}

	public void SetOrderTime(Time OrderTime) {
		this.OrderTime =new Time (OrderTime);
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
	
	public double OrderSum ()
	{

		double OrderSum=0;
		for (int i=0; i<Items.length;i++)
		{
			OrderSum+=Items[i].GetPrice();
		}
		
		return OrderSum;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", customer=" + customer + ", OrderDate=" + OrderDate + ", OrderTime="
				+ OrderTime + ", Table=" + Table + ", Items=" + Arrays.toString(Items) + "]";
	}


}
