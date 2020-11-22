import java.util.List;
import java.util.Scanner;

public class Item {

	public static int AutoItemID=0;
	
	public ItemModel AddNewItem() {
		Scanner sc = new Scanner(System.in);
		ItemModel newItem = new ItemModel();

		System.out.print("Enter Item's Name:");
		newItem.setItemName(sc.nextLine());
		System.out.print("Enter Item's Company:");
		newItem.setItemCompany(sc.nextLine());
		System.out.print("Enter Item's Price:");
		while(true)
		{
			try {
				Scanner SC =new Scanner(System.in);
				newItem.setItemPrice(SC.nextDouble());
				if(newItem.getItemPrice()<=0)
					throw new Exception();
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
				//continue;
			}
		}
		System.out.print("Enter Item's Tax in %:");
		while(true)
		{
			try {
				Scanner SC =new Scanner(System.in);
				newItem.setItemTaxPercentage(SC.nextInt());
				if(newItem.getItemTaxPercentage()<0 || newItem.getItemTaxPercentage()>100)
					throw new Exception();
				break;
			} catch (Exception e) {
				ErrorClass.ErrorMessage();
			}
		}		
		newItem.setItemID(++AutoItemID);
		return newItem;
	}

	public ItemModel getItemByID(List<ItemModel> itemsList, int id) {
		for (ItemModel c : itemsList) {
			if(c.getItemID() == id)
			{
				return c;
			}
		}
		ErrorClass.ErrorMessage();
		return new ItemModel();
	}
	

}
