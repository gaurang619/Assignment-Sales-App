
public class ClientModel {

	private int ClientID;
	private String ClientName;
	private String ClientPhNo;
	private String ClientNationality;
	private String ClientCompany;
	private String ClientCompanyAddress;
	
	
	public ClientModel() {
		super();
	}
	
	public ClientModel(String clientName, String clientPhNo, String clientNationality, String clientCompany,
			String clientCompanyAddress) {
		super();
		ClientName = clientName;
		ClientPhNo = clientPhNo;
		ClientNationality = clientNationality;
		ClientCompany = clientCompany;
		ClientCompanyAddress = clientCompanyAddress;
	}
	
	public ClientModel(int clientID, String clientName, String clientPhNo, String clientNationality,
			String clientCompany, String clientCompanyAddress) {
		super();
		ClientID = clientID;
		ClientName = clientName;
		ClientPhNo = clientPhNo;
		ClientNationality = clientNationality;
		ClientCompany = clientCompany;
		ClientCompanyAddress = clientCompanyAddress;
	}

	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	public String getClientPhNo() {
		return ClientPhNo;
	}
	public void setClientPhNo(String clientPhNo) {
		ClientPhNo = clientPhNo;
	}
	public String getClientNationality() {
		return ClientNationality;
	}
	public void setClientNationality(String clientNationality) {
		ClientNationality = clientNationality;
	}
	public String getClientCompany() {
		return ClientCompany;
	}
	public void setClientCompany(String clientCompany) {
		ClientCompany = clientCompany;
	}
	public String getClientCompanyAddress() {
		return ClientCompanyAddress;
	}
	public void setClientCompanyAddress(String clientCompanyAddress) {
		ClientCompanyAddress = clientCompanyAddress;
	}
	
	
	
}
