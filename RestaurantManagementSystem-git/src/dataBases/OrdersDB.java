package dataBases;


import people.Employee;
import service.Item;
import service.Order;

public class OrdersDB {
		private Order [] OrdersArray;
		private int MaxOrders=100;
		private int CounterOfOrders;

		public OrdersDB() {
		OrdersArray = new Order[MaxOrders];
		CounterOfOrders = 0;
		}
		
		public void AddOrder(Order order)
		{
			if(CounterOfOrders < MaxOrders) 
			{
			OrdersArray[CounterOfOrders] = order;
			CounterOfOrders ++;
			}
		}
		
		
		public String OrdersSum ()
		{
			String Str ="";
			double OrdersSum=0;
			for (int i=0; i<CounterOfOrders;i++)
			{
				OrdersSum+=OrdersArray[i].OrderSum();
			}
			Str="our resturants sum of orders is: " + OrdersSum;
			return Str;
		}
		
}
