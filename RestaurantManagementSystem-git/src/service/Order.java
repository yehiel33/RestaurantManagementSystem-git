package service;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Order.
 */
import java.util.Arrays;

import enums.Tables;
import etc.Date;
import etc.Time;
import people.Customer;

public class Order {

	private int orderId;
	private Customer customer;
	private Date orderDate;
	private Time orderTime;
	private Tables table;
	private Item [] items;
	/**
	 * @param orderId represents the Order ID of Order
	 * @param firstName represents the customers' first name of order
	 * @param lastName represents the customers' last name of order
	 * @param phoneNumber represents the customers' phone number  of order
	 * @param orderDate represents the date order
	 * @param orderTime represents the time order
	 * @param table represents the table of the order
	 * @param items (array) represents all the items in the order
	 */
	public Order (int orderId,String firstName,String lastName,String phoneNumber , Date orderDate, Time orderTime, Tables table, Item [] items) //regular constructor
	{
		this.orderId = orderId;
		this.customer = new Customer(firstName, lastName, phoneNumber);
		this.orderDate = new Date(orderDate);
		this.orderTime = new Time(orderTime);
		this.table = table;
		this.items = items;
	}
	
	public Order (int orderId, Customer customer, Date orderDate, Time orderTime, Tables table, Item [] items) //regular constructor - (overloading)
	{
		this.orderId = orderId;
		this.customer = new Customer(customer);
		this.orderDate = new Date(orderDate);
		this.orderTime = new Time(orderTime);
		this.table = table;
		this.items = items;
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
	
	public int GetOrderId() { // Getters and Setters
		return orderId;
	}
	public void SetOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer GetCustomer() {
		return customer;
	}
	public void SetCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date GetOrderDate() {
		return new Date (orderDate);
	}
	public void SetOrderDate(Date orderDate) {
		this.orderDate = new Date (orderDate);
	}
	public Time GetOrderTime() {
		return new Time (orderTime);
	}
	public void SetOrderTime(Time orderTime) {
		this.orderTime =new Time (orderTime);
	}
	public Tables GetTable() {
		return table;
	}
	public void SetTable(Tables table) {
		this.table = table;
	}
	public Item[] GetItems() {
		return items;
	}
	public void SetItems(Item[] items) {
		this.items = items;
	}

	public double OrderSum () // 
	{
		/**
		 * OrderSum is method that returns the total sum of all items in the order
		 */
		double orderSum=0;
		for (int i=0; i<items.length;i++)
		{
			orderSum+=items[i].GetPrice();
		}
		
		return orderSum;
	}

	@Override // toString method
	public String toString() {
		return "Order [OrderId=" + orderId + ", customer=" + customer + ", OrderDate=" + orderDate + ", OrderTime="
				+ orderTime + ", Table=" + table + ", Items=" + Arrays.toString(items) + "]";
	}


}
