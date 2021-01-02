package dataBases;


import java.text.DecimalFormat;
import java.util.Arrays;

import etc.Date;
import service.Order;

public class OrdersDB {
		private Order [] OrdersArray;
			
		public OrdersDB() {
		OrdersArray = new Order[1];
		}
		
		public void AddOrder(Order order)
		{
			OrdersArray[OrdersArray.length-1] = order;	
			OrdersArray = increaseArray(OrdersArray);
		}
		
		
		public String OrdersSum ()
		{

			String Str ="";
			double OrdersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<OrdersArray.length-1;i++)
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

			for (int i=0; i<OrdersArray.length-1;i++)
			{
				if((OrdersArray[i].GetOrderDate()).IsEquals(d))
					OrdersSum+=OrdersArray[i].OrderSum();
			}
			Str="our resturants sum of orders is: " + df.format(OrdersSum);
			return Str;
		}
		
		public Order[] increaseArray (Order[] OldArray)
		{
			Order [] newArray=new Order[OldArray.length+1];
			for(int i=0; i<OldArray.length; i++)
			{
				newArray[i]=OldArray[i];
			}
			return newArray;
		}

		@Override
		public String toString() {
			return "OrdersDB [OrdersArray=" + Arrays.toString(OrdersArray) + "]";
		}



		
		
		

		
}
