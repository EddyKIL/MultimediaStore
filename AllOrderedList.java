import java.util.ArrayList;

public class AllOrderedList {
	private ArrayList <Order> oneOrder;
	String date;
	int id;
	float prix;
	String customer;
	
	AllOrderedList(){
		oneOrder = new ArrayList <Order>();
		date = new String();
		customer = new String();
	}
	AllOrderedList(ArrayList <Order> pOneOrder,String pDate,int pId, float pPrix, String pCustomer){
		oneOrder = pOneOrder;
		date = pDate;
		id=pId;
		prix = pPrix;
		customer = pCustomer;
	}
	
	public int getId() { return id;	}
	public String getDate() { return date;	}
	public float getPrice() {return prix;}
	public ArrayList<Order> getOneOrder(){ return oneOrder;}
	public String getCustomer () {return customer;}
	//Setters
	public void setId(int pId) {
		id=pId;
	}
	public void setDate(String pDate) {
		date=pDate;
	}
	public void setPrice(float pPrice) {
		prix=pPrice;
	}
	public void setOneOrder(ArrayList<Order> pOneOrder) {
		oneOrder=pOneOrder;
	}
	public void setCustomer(String pCustomer) {
		customer=pCustomer;
	}
	
	
	
}
