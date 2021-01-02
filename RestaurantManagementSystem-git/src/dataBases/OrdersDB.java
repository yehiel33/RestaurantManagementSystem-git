package dataBases;


import java.text.DecimalFormat;

import etc.Date;
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
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<CounterOfOrders;i++)
			{
				OrdersSum+=OrdersArray[i].OrderSum();
				
			}
			Str="our resturants sum of orders is: " + df.format(OrdersSum);
			return Str;
		}
		
		
		public String OrdersSumByDate (Date d) {

			String Str ="";
			double OrdersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<CounterOfOrders;i++)
			{
				if((OrdersArray[i].GetOrderDate()).IsEquals(d))
					OrdersSum+=OrdersArray[i].OrderSum();
			}
			Str="our resturants sum of orders is: " + df.format(OrdersSum);
			return Str;
		}

		
		
		

		
}
