package dataBases;

import people.Employee;
import service.Order;

public class OrdersDB {
		private Order [] OrdersArray;
		private int MaxItemsInOrder=100;
		private int CounterOfItems =0;

		public OrdersDB() {
		Order [] OrdersArray = new Order [MaxItemsInOrder];
		}
		public void AddOrder(Order order)
		{
			if(CounterOfItems < MaxItemsInOrder)
			{
			OrdersArray[CounterOfItems] = order;
			CounterOfItems ++;
			}
			System.out.println(OrdersArray);
		}
}
