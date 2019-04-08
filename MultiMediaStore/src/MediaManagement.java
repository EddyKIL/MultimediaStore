import java.util.ArrayList;
import java.util.Scanner;

public class MediaManagement {
	
	private ArrayList<Media> objectlist;
	
	//constructor
	public MediaManagement() {
		
		
	}
	
	//Other Methods
	
	public void create() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Select media type\n");
		System.out.println("1. Book\n");
		System.out.println("2. Digital Video Disc\n");
		System.out.println("3. Compact Disc\n");
		int j = scn.nextInt();
		switch (j) {
		
		case 1:
			Book book = new Book();
			
			break;
		case 2:
			DigitalVideoDisc disc = new DigitalVideoDisc();
			break;
		case 3:
			CompactDisc cdisc = new CompactDisc();
			break;
		default:
			System.out.println("Choose file type!");
		
		}	
			
	}
	
	public void delete() {
		
		
		
	}
	
	public void update(int id) {
		
	}
	public Media find(int id) {
		
		
		return null;// verifier ce qu'il faudrait retourner
	}
	
	public void sortbyprice() {
		
	}
	public void sortbycategory() {
		
	}
	public void createorder() {
		
	}
	public void updateorder() {
		
	}
	public void listorders() {
		
	}

}
