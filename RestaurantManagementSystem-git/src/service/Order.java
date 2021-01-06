package service;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * This class represents  object in type of Order.
 */

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
	
	public int getOrderId() { // Getters and Setters
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getOrderDate() {
		return new Date (orderDate);
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = new Date (orderDate);
	}
	public Time getOrderTime() {
		return new Time (orderTime);
	}
	public void setOrderTime(Time orderTime) {
		this.orderTime =new Time (orderTime);
	}
	public Tables getTable() {
		return table;
	}
	public void setTable(Tables table) {
		this.table = table;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}

	public double orderSum () // 
	{
		/**
		 * OrderSum is method that returns the total sum of all items in the order
		 */
		double orderSum=0;
		for (int i=0; i<items.length;i++)
		{
			orderSum+=items[i].getPrice();
		}
		
		return orderSum;
	}

	@Override // toString method
	public String toString() {
		return "OrderId: " + orderId  + "\n\nTable: " + table + "\n\n" + "OrderDate: " + orderDate + "\n\nOrderTime: "
				+ orderTime + "\n\n" + customer + "\n" + "Items:\n" + printItemArray(items);
	}
	
	
	public String printItemArray(Item [] items)
	{
		String str="";
		for(int i=0; i<items.length; i++)
		{
			str+=items[i].toString()+ "\n";
		}
		return str;
	}


}
