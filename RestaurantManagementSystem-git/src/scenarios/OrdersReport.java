package scenarios;

import enums.Tables;
import etc.Date;
import etc.Time;
import service.Item;
import service.Order;

public class OrdersReport {

	public static void main(String[] args) {
		Order o1 = new Order  (0001, (1,1,2021), (01, 26, 00) , Tables.Big_Central, Item [] Items);
	}

}
