import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "N";
		Scanner sc = new Scanner(System.in);
		MediaManagement store = new MediaManagement();
		ArrayList<Media> mediaList = new ArrayList<Media>();
		ArrayList<AllOrderedList> orderedList = new ArrayList<AllOrderedList>();
		
		 /*try {
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");

		      String url = "jdbc:mysql://localhost:3306/store";
		      String user = "root";
		      String passwd = "admin";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");         
		         
		    } catch (Exception e) {
		      e.printStackTrace();
		    } */
		
		
		do {
			
			System.out.println("\n\t\tMedia Management System\n\n\n");
			System.out.println("1. Create new media object\n");
			System.out.println("2. Update an existing media object by ID\n");
			System.out.println("3. Delete a media object by ID\n");
			System.out.println("4. Find a media object by name\n");
			System.out.println("5. Find a media object by ID\n");
			System.out.println("6. Create new order\n");
			System.out.println("7. Update an order by ID\n");
			System.out.println("0. Exit\n");
			int i = sc.nextInt();
			switch (i) {
			
				case 1:
					mediaList=store.create();
					break;
				case 2:
					mediaList=store.update(mediaList);
					break;
				case 3:
					mediaList=store.delete(mediaList);
					break;
				case 4:
					store.findByNameVerbose(mediaList);
					break;
				case 5:
					store.findByIdVerbose(mediaList);
					break;
				case 6:
					orderedList=store.createorder(mediaList, orderedList);
					break;
				case 7:
					break;
				case 0:
					break;
				default:
					System.out.println("Veuillez selectionner une opération");
			
			}
			System.out.println("\nEffectuer une autre opération? O/N");
			Scanner o = new Scanner(System.in);
			String rep = o.nextLine();
			//sc.close();
			ans = rep.toUpperCase();
		}while(ans.equals("O"));
					
		
	}

}
