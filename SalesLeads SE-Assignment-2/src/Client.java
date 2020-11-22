import java.util.List;
import java.util.Scanner;

public class Client {

	public static int AutoClientID = 0;

	public ClientModel AddNewClient() {

		Scanner sc = new Scanner(System.in);
		ClientModel newClient = new ClientModel();

		System.out.print("Enter Client's Name:");
		newClient.setClientName(sc.nextLine());
		System.out.print("Enter Client's Phone Number:");
		newClient.setClientPhNo(sc.nextLine());
		System.out.print("Enter Client's Nationality:");
		newClient.setClientNationality(sc.nextLine());
		System.out.print("Enter Client's Company's Name:");
		newClient.setClientCompany(sc.nextLine());
		System.out.print("Enter Client's Company's Address:");
		newClient.setClientCompanyAddress(sc.nextLine());

		newClient.setClientID(++AutoClientID);

		return newClient;

	}

	public ClientModel getClentByID(List<ClientModel> clientsList, int id) {

		while (true) {
			try {
				for (ClientModel c : clientsList) {
					if (c.getClientID() == id) {
						return c;
					}
				}
				ErrorClass.ErrorMessage();
				Scanner sc = new Scanner(System.in);
				id = sc.nextInt();
			}

			catch (Exception e) {
				continue;
			}
		}
	}
}
