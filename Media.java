
abstract class Media {
	protected int id;
	protected String title;
	protected float price;
	protected String category;
	protected int number;//numéro d'un média
	
	Media() {
		
		
	}
	Media( int pId, float pPrice, int pNumber,String pTitle, String pCategory ) {
		
		id=pId;
		title=pTitle;
		price=pPrice;
		number=pNumber;
		category=pCategory;
	}
	
	public int getId() {return id ;}
	public String getTitle() {return title;}
	public float getPrice() {return price;}
	public String getCategory() {return category;}
	public int getNumber() {return number;}
	
	public void setId(int pId) {id = pId;} 
	public void setTitle(String pTitle) { title = pTitle;}
	public void setNumber(int pNumber) { number = pNumber;}
	public void setPrice(float pPrice) {price = pPrice;}
	public void setCategory(String pCategory) {category = pCategory;}
	
	
	
	
	
}
