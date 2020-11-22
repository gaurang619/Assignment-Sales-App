
public class ItemModel {

	private int ItemID;
	private String ItemName;
	private String ItemCompany;
	private double ItemPrice;
	private int ItemTaxPercentage;

	public ItemModel() {
		super();
	}

	public ItemModel(String itemName, String itemCompany, double itemPrice, int itemTaxPercentage) {
		super();
		ItemName = itemName;
		ItemCompany = itemCompany;
		ItemPrice = itemPrice;
		ItemTaxPercentage = itemTaxPercentage;
	}

	public ItemModel(int itemID, String itemName, String itemCompany, double itemPrice, int itemTaxPercentage) {
		super();
		ItemID = itemID;
		ItemName = itemName;
		ItemCompany = itemCompany;
		ItemPrice = itemPrice;
		ItemTaxPercentage = itemTaxPercentage;
	}

	public int getItemID() {
		return ItemID;
	}

	public void setItemID(int itemID) {
		ItemID = itemID;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemCompany() {
		return ItemCompany;
	}

	public void setItemCompany(String itemCompany) {
		ItemCompany = itemCompany;
	}

	public double getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}

	public int getItemTaxPercentage() {
		return ItemTaxPercentage;
	}

	public void setItemTaxPercentage(int itemTaxPercentage) {
		ItemTaxPercentage = itemTaxPercentage;
	}
}
