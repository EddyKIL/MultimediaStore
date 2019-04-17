import java.util.ArrayList;

public class CompactDisc extends DigitalVideoDisc{
	
	private ArrayList <Track> tracklist;
	CompactDisc() {
		super();
		tracklist = new ArrayList<Track>() ;
	}
	
	CompactDisc(int pId,float pPrice,int pNumber,String pTitle, String pCategory,float pLength, String pDirector,ArrayList <Track> pTracklist) {
		super(pId,pPrice,pNumber,pTitle,pCategory,pLength,pDirector);
		tracklist = pTracklist;
	}
	
	public ArrayList<Track> getTracklist() {return tracklist;}
	public void setTrackList(ArrayList<Track> ptrack) {tracklist = ptrack;}
	
	
	
	
	
	
	
	
	
}
