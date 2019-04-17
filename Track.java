import java.util.ArrayList;

public class Track {
	private String title;
	private float length;
	
	Track() {
		
	}

	 Track(String trck, float tlen) {
		 title=trck;
		 length=tlen;
	}
	 
	 public String getTitle() {return title;}
	 public float getLenth() {return length;}
	 public void setTitle(String pTitle) {title = pTitle;}
	 public void setLength(float pLength) {length = pLength;}
	 
	 
	 

}
