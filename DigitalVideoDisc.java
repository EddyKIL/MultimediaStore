
public class DigitalVideoDisc extends Media {
	private float length;
	private String director;
	
	DigitalVideoDisc() {
		super();
	}
	DigitalVideoDisc(int pId,float pPrice,int pNumber,String pTitle, String pCategory,float pLength, String pDirector) {
		super(pId,pPrice,pNumber,pTitle,pCategory);
		length=pLength;
		director=pDirector;
	}
	//getters
	public float getLength() {return length;}
	public String getDirector() {return director;}
	//setters
	public void setLength(float pLength) {length=pLength;}
	public void setDirector(String pDirector) {director = pDirector;}
	
    
	
	
}
