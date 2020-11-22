
public class SalesOrder {

	private int SOID;
	private ClientModel SOClient;
	private ItemModel SOItem;
	private int SOItemQuantity;
	private double SOPrice;
	private double SOTax;
	private double SOPriceWithTax;
	private int SODiscountPercentage;
	private double SOFinalPrice;

	
	public SalesOrder() {
		super();
	}


	public SalesOrder(ClientModel sOClient, ItemModel sOItem, int sOItemQuantity, double sOPrice, double sOTax,
			double sOPriceWithTax, int sODiscountPercentage, double sOFinalPrice) {
		super();
		SOClient = sOClient;
		SOItem = sOItem;
		SOItemQuantity = sOItemQuantity;
		SOPrice = sOPrice;
		SOTax = sOTax;
		SOPriceWithTax = sOPriceWithTax;
		SODiscountPercentage = sODiscountPercentage;
		SOFinalPrice = sOFinalPrice;
	}


	public SalesOrder(int sOID, ClientModel sOClient, ItemModel sOItem, int sOItemQuantity, double sOPrice,
			double sOTax, double sOPriceWithTax, int sODiscountPercentage, double sOFinalPrice) {
		super();
		SOID = sOID;
		SOClient = sOClient;
		SOItem = sOItem;
		SOItemQuantity = sOItemQuantity;
		SOPrice = sOPrice;
		SOTax = sOTax;
		SOPriceWithTax = sOPriceWithTax;
		SODiscountPercentage = sODiscountPercentage;
		SOFinalPrice = sOFinalPrice;
	}


	public int getSOID() {
		return SOID;
	}


	public void setSOID(int sOID) {
		SOID = sOID;
	}


	public ClientModel getSOClient() {
		return SOClient;
	}


	public void setSOClient(ClientModel sOClient) {
		SOClient = sOClient;
	}


	public ItemModel getSOItem() {
		return SOItem;
	}


	public void setSOItem(ItemModel sOItem) {
		SOItem = sOItem;
	}


	public int getSOItemQuantity() {
		return SOItemQuantity;
	}


	public void setSOItemQuantity(int sOItemQuantity) {
		SOItemQuantity = sOItemQuantity;
	}


	public double getSOPrice() {
		return SOPrice;
	}


	public void setSOPrice(double sOPrice) {
		SOPrice = sOPrice;
	}


	public double getSOTax() {
		return SOTax;
	}


	public void setSOTax(double sOTax) {
		SOTax = sOTax;
	}


	public double getSOPriceWithTax() {
		return SOPriceWithTax;
	}


	public void setSOPriceWithTax(double sOPriceWithTax) {
		SOPriceWithTax = sOPriceWithTax;
	}


	public int getSODiscountPercentage() {
		return SODiscountPercentage;
	}


	public void setSODiscountPercentage(int sODiscountPercentage) {
		SODiscountPercentage = sODiscountPercentage;
	}


	public double getSOFinalPrice() {
		return SOFinalPrice;
	}


	public void setSOFinalPrice(double sOFinalPrice) {
		SOFinalPrice = sOFinalPrice;
	}

}
