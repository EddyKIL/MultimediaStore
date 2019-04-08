import java.util.Scanner;

public class MediaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MediaManagement store = new MediaManagement();
		
		System.out.println("\n\t\tMedia Management System\n\n\n");
		System.out.println("1. Create new media object\n");
		System.out.println("2. Update an existing media object by ID\n");
		System.out.println("3. Delete a media object by ID\n");
		System.out.println("4. Find a media object by name\n");
		System.out.println("5. Find a media object by ID\n");
		System.out.println("6. Create new order\n");
		System.out.println("7. Update an order by ID\n");
		int i = sc.nextInt();
		switch (i) {
		
			case 1:
				store.create();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Veuillez effectuer votre choix");
		
		}
		
		
	}

}
