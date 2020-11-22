
import java.util.List;
import java.util.Scanner;

public class Sales {

	public static int AutoSOID=0;
	public SalesOrder GenerateSalesOrder(List<ClientModel> clientsList, List<ItemModel> itemsList) {

		
		SalesOrder newSO = new SalesOrder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select/Enter ClientID From Below:");
		System.out.format("| %-8s | %-15s | %-15s | %-13s |\n", "ClientID", "Name", "Company", "Phone Number");
		for (ClientModel c : clientsList) {
			System.out.format("| %-8d | %-15s | %-15s | %-13s |\n", c.getClientID(), c.getClientName(),
					c.getClientCompany(), c.getClientPhNo());
		}
		int selectedClient = 0;
		while (true) {
			try {
				Scanner SC =new Scanner(System.in);
				selectedClient = SC.nextInt();
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
			}
		}
		Client cc = new Client();
		newSO.setSOClient(cc.getClentByID(clientsList,selectedClient));

		System.out.println("Select/Enter ItemID From Below:");
		System.out.format("| %-6s | %-15s | %-15s | %-13s |\n", "ItemID", "Name", "Brand", "Price");
		for (ItemModel c : itemsList) {

			System.out.format("| %-6d | %-15s | %-15s | %-13s |\n", c.getItemID(), c.getItemName(),
					c.getItemCompany(), c.getItemPrice());
		}
		int selectedItem = 0;
		while (true) {
			try {
				Scanner SC =new Scanner(System.in);
				selectedItem = SC.nextInt();
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
			}
		}
		Item ii =new Item();
		newSO.setSOItem(ii.getItemByID(itemsList,selectedItem));

		System.out.print("Enter Item Quantity:");
		while(true)
		{
			try {
				Scanner SC =new Scanner(System.in);
				newSO.setSOItemQuantity(SC.nextInt());
				if(newSO.getSOItemQuantity()<=0)
				{
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
			}
		}
		
		newSO.setSOPrice(newSO.getSOItem().getItemPrice()*newSO.getSOItemQuantity());
		
		newSO.setSOPriceWithTax(newSO.getSOPrice()+(newSO.getSOPrice()*newSO.getSOItem().getItemTaxPercentage()/100));
		
		System.out.print("Enter Discount in %:");
		while(true)
		{
			try {
				Scanner SC =new Scanner(System.in);
				newSO.setSODiscountPercentage(SC.nextInt());
				if(newSO.getSODiscountPercentage()<0 || newSO.getSODiscountPercentage()>100)
				{
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
			}
		}
		
		newSO.setSOFinalPrice(newSO.getSOPriceWithTax()-(newSO.getSOPriceWithTax()*newSO.getSODiscountPercentage()/100));
		
		newSO.setSOID(++AutoSOID);
		return newSO;
		// return null;

	}

	public void DisplaySalesOrder(List<SalesOrder> salesOrderList) {
		//int i=0;
		System.out.format("| %-3s | %-15s | %-10s | %-8s | %-10s | %-9s | %-8s | %-8s | %-11s |\n","No.","Company","Item","Quantity","Item Price","Amount","Tax","Discount","Final Price");
		for (SalesOrder s : salesOrderList) {
			System.out.format("| %-3d | %-15s | %-10s | %-8d | %-10s | %-9s | +$%-6.2f | %-8s | %-11.2f |\n",s.getSOID(),s.getSOClient().getClientCompany(),s.getSOItem().getItemName(),s.getSOItemQuantity(),"$"+s.getSOItem().getItemPrice(),s.getSOPrice(),s.getSOPriceWithTax()-s.getSOPrice(),s.getSODiscountPercentage()+"%",s.getSOFinalPrice());
		}
		
	}

}
