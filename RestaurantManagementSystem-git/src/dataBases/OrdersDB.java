package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of order objects
 */

import java.text.DecimalFormat;
import java.util.Arrays;

import etc.Date;
import service.Order;

public class OrdersDB {
	
		private Order [] ordersArray;
		
		public OrdersDB() { //regular constructor
		ordersArray = new Order[1];
		}
		
		public void AddOrder(Order order)
		{
			/**
			 * method that get Order object and adding it to order array
			 */
			ordersArray[ordersArray.length-1] = order;	
			ordersArray = increaseArray(ordersArray);
		}
		
		
		public String OrdersSum ()
		{
			/**
			 * method that return string with the sum of all orders 
			 */

			String str ="";
			double ordersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<ordersArray.length-1;i++)
			{
				ordersSum+=ordersArray[i].OrderSum();
			}
			str="our resturants sum of orders is: " + df.format(ordersSum);
			return str;
		}
		
		
		public String OrdersSumByDate (Date d) {
			/**
			 * method that return string with the sum of all order in some date 
			 */
			String str ="";
			double ordersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<ordersArray.length-1;i++)
			{
				if((ordersArray[i].GetOrderDate()).IsEquals(d))
					ordersSum+=ordersArray[i].OrderSum();
			}
			str="our resturants sum of orders is: " + df.format(ordersSum);
			return str;
		}
		
		public Order[] increaseArray (Order[] OldArray)
		{
			/**
			 * method that increases array when adding new object
			 */
			Order [] newArray=new Order[OldArray.length+1];
			for(int i=0; i<OldArray.length; i++)
			{
				newArray[i]=OldArray[i];
			}
			return newArray;
		}

		@Override // toString
		public String toString() {
			return "OrdersDB [OrdersArray=" + Arrays.toString(ordersArray) + "]";
		}



		
		
		

		
}
