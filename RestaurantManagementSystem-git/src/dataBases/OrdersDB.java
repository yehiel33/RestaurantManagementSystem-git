package dataBases;
/**
 * @author Eyal Amar and Yehiel Yegudayev
 * this class contains the data base of order objects
 */

import java.text.DecimalFormat;

import etc.Date;
import service.Order;

public class OrdersDB {
		
		private Order [] ordersArray;
		/**
		 * @param ordersArray represent array of order type  objects
		 */
		
		public OrdersDB() { //default constructor
		ordersArray = new Order[1];
		}
		
		public void addOrder(Order order)
		{
			/**
			 * method that get Order object and adding it to order array
			 */
			ordersArray[ordersArray.length-1] = order;	
			ordersArray = increaseArray(ordersArray);
		}
		
		
		public String ordersSum ()
		{
			/**
			 * method that return string with the sum of all orders 
			 */

			String str ="";
			double ordersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<ordersArray.length-1;i++)
			{
				ordersSum+=ordersArray[i].orderSum();
			}
			str="Total Income: " + df.format(ordersSum) + " nis\n";
			return str;
		}
		
		
		public String ordersSumByDate (Date d) {
			/**
			 * method that return string with the sum of all order in some date 
			 */
			String str ="";
			double ordersSum=0;
			DecimalFormat df = new DecimalFormat("#.###");

			for (int i=0; i<ordersArray.length-1;i++)
			{
				if((ordersArray[i].getOrderDate()).isEquals(d))
					ordersSum+=ordersArray[i].orderSum();
			}
			str="Total Income for Date: "+ d + ", Is: " + df.format(ordersSum) + " nis\n";
			return str;
		}
		
		public Order[] increaseArray (Order[] oldArray)
		{
			/**
			 * method that increases array when adding new object
			 */
			Order [] newArray=new Order[oldArray.length+1];
			for(int i=0; i<oldArray.length; i++)
			{
				newArray[i]=oldArray[i];
			}
			return newArray;
		}
		
		public String printOrderArray(Order [] orders)
		{
			String str ="";
			
			for (int i=0; i<ordersArray.length-1;i++)
			{
				str+=ordersArray[i].toString() + "---------------------------------------\n";
			}
			
			return str;
		}

		@Override // toString
		public String toString() {
			
			String str="---------------------------------------\n";
			str+=printOrderArray(ordersArray);
			return str;
		}
		
	



		
		
		

		
}
