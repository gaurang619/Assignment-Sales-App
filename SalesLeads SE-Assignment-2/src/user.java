import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user {

	
	public static List<ClientModel> ClientsList = new ArrayList<ClientModel>();
	public static List<ItemModel> ItemsList = new ArrayList<ItemModel>();
	public static List<SalesOrder> SalesOrderList = new ArrayList<SalesOrder>();

	public static void main(String[] args) {

		while (true) {
			userChoice();
		}
		// System.out.println(ClientsList.get(0).getClientID());
		// System.out.println(ClientsList.get(0).getClientName());

	}

	public static void userChoice() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add New Client\n2. Add New Item\n3. Generate Sales Order\n4. Display Past Sales Orders");
		String choice = sc.nextLine();
		switch (choice) {
		case "1":
			Client c = new Client();
			ClientsList.add(c.AddNewClient());
			break;
		case "2":
			Item i = new Item();
			ItemsList.add(i.AddNewItem());
			break;

		case "3":
			Sales s = new Sales();
			SalesOrderList.add(s.GenerateSalesOrder(ClientsList, ItemsList));
			System.out.println("Successfully Generated Sales Order:)");
			break;
		case "4":
			Sales ss = new Sales();
			ss.DisplaySalesOrder(SalesOrderList);
			break;
		default:
			break;
		}

	}

}
