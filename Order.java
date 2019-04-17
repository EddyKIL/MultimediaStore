import java.util.ArrayList;
import java.util.Date;

public class Order {
	private int id;
	//private ArrayList<Media> orderedObjectList;
	private Media m;
	//private String ordereddate;
	private int qty;
	private float prix;
	Order(){
		
		//orderedobject = new  ArrayList<Media>();
		//ordereddate = new Date();
	}
	
	Order(Media pMedia, int pId, int pQty, float pPrix){
		
		id=pId;
		qty=pQty;
		m=pMedia;
		prix=pPrix;
		
	}
	
	//Getters
	
	public int getId() {
		return id;
	}
	public Media getOrderedobject(){
		return m;
	}
	public int getQty(){
		return qty;
	}
	//Setters
	/*setters de la date de commande*/
	
	/*public void setDate(String pOrdereddate) {
		ordereddate=pOrdereddate;
	}*/
	/*setters de l'Id de la commande*/
	public void setId(int pId) {
		id=pId;
	}
	/*setters de la liste des objects commandés*/
	public void setOrderedMedia(Media pm) {
		
		m=pm;
		
	}
	
	
}
