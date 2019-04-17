import java.util.ArrayList;

public class Book extends Media {
	private String publisher;
	//private String author;
	private ArrayList<String> authors;
	
	Book() {
		super();
	}
	public Book(int pId,float pPrice,int pNumber,String pTitle, String pCategory,ArrayList<String> pAuthors, String pPublisher) {
		
		super(pId,pPrice,pNumber,pTitle,pCategory);
		publisher = pPublisher;
		authors = pAuthors;
	}
	
	/* public Book createBook(ArrayList<Media> mediaList,int nbreMedia, int pid) {
		
		//int pid;
		String ans = "N";
		
		System.out.println("Title du livre: ");
		Scanner n = new Scanner(System.in);
		String tit = n.nextLine();
		System.out.println("Publisher: ");
		Scanner p = new Scanner(System.in);
		String pub = p.nextLine();
		System.out.println("Prix: ");
		Scanner pr = new Scanner(System.in);
		float prix = pr.nextFloat();
		System.out.println("Number: ");
		Scanner nu = new Scanner(System.in);
		int num = nu.nextInt();
		
		ArrayList <String> auth = new ArrayList<String>();
		do {
			
			System.out.println("Nom de l'Auteur: ");
			Scanner a = new Scanner(System.in);
			String auteur = a.nextLine();
			auth.add(auteur);
			System.out.println("Ajouter un auteur? O/N"); 
			Scanner o = new Scanner(System.in);
			String rep = o.next();
			//sc.close();
			ans = rep.substring(0,1).toUpperCase();
			
		}while (ans.equals("O"));
		pid=nbreMedia+1;
		Book book = new Book(pid,prix,num,tit,"Book",auth,pub);
		return book;
	} */
	
	// Getters
	public String getPublisher() {return publisher;}
	public ArrayList<String> getAuthorsList() {return authors; }
	//Setters
	public void setAuthorsList(ArrayList<String> auth) {authors = auth;}
	public void setPublisher(String pub) {publisher = pub;}
	
	
	
	
	
	
	
}
