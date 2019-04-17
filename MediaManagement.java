import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.*;

public class MediaManagement {
	
	private ArrayList<Media> mediaList = new  ArrayList<Media>();
	private ArrayList<ArrayList<Order>> listAllOrder = new ArrayList<ArrayList<Order>>();
	
	//constructor
	MediaManagement() {
		
		
	}
	MediaManagement(ArrayList<Media> pmediaList) {
		mediaList = pmediaList;
		
	}
	
	//Other Methods
	
	
	/*public void clrscr(){
	    //Clears Screen in java
		for(int i = 0; i < 80*300; i++) // Default Height of cmd is 300 and Default width is 80
		    System.out.print("\b"); // Prints a backspace
	}*/
	
	
	
	
	
	public ArrayList<Media> create() {
		
		Scanner scn = new Scanner(System.in);
		String ans = "N";
		int nbreMedia,pid;
		
		do {
			
			nbreMedia = mediaList.size();
			System.out.println("Select media type\n");
			System.out.println("1. Book\n");
			System.out.println("2. Digital Video Disc\n");
			System.out.println("3. Compact Disc\n");
			int j = scn.nextInt();
			Scanner n;
			String tit;
			
			Scanner pr;
			Scanner nu;
			float prix;
			int num;
			
			//scn.close();
			
			switch (j) {
			
			case 1:
				System.out.println("Title du livre: ");
				n = new Scanner(System.in);
				tit = n.nextLine();
				System.out.println("Publisher: ");
				Scanner p = new Scanner(System.in);
				String pub = p.nextLine();
				System.out.println("Prix: ");
				pr = new Scanner(System.in);
				prix = pr.nextFloat();
				System.out.println("Number: ");
				nu = new Scanner(System.in);
				num = nu.nextInt();
				
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
				mediaList.add(book);
				break;
			case 2:
				System.out.println("Title du DVD: ");
				n = new Scanner(System.in);
				tit = n.nextLine();
				System.out.println("Director: ");
				Scanner d = new Scanner(System.in);
				String dir = d.nextLine();
				
				System.out.println("Length: ");
				Scanner l = new Scanner(System.in);
				float len = l.nextFloat();
				System.out.println("Prix du DVD: ");
				pr = new Scanner(System.in);
				prix = pr.nextFloat();
				System.out.println("Number de DVD: ");
				nu = new Scanner(System.in);
				num = nu.nextInt();
				pid=nbreMedia+1;
				DigitalVideoDisc disc = new DigitalVideoDisc(pid,prix,num,tit,"DVD",len,dir);
				mediaList.add(disc);
				break;
			case 3:
				
				float clen=0;
				System.out.println("Title du CD: ");
				n = new Scanner(System.in);
				tit = n.nextLine();
				System.out.println("Director: ");
				Scanner cd = new Scanner(System.in);
				String cdir = cd.nextLine();
				
				System.out.println("Prix du CD: ");
				pr = new Scanner(System.in);
				prix = pr.nextFloat();
				System.out.println("Number de CD: ");
				nu = new Scanner(System.in);
				num = nu.nextInt();
				
				ArrayList <Track> tracklist = new ArrayList<Track>();
				do {
					
					System.out.println("Track title: ");
					Scanner a = new Scanner(System.in);
					String trck = a.nextLine();
					System.out.println("Track length: ");
					Scanner tl = new Scanner(System.in);
					float tlen = tl.nextFloat();
					clen +=tlen;
					Track track = new Track(trck,tlen);
					
					tracklist.add(track);
					System.out.println("Ajouter un Track? O/N");
					Scanner o = new Scanner(System.in);
					String rep = o.next();
					ans = rep.substring(0,1).toUpperCase();
					
				}while (ans.equals("O"));
				pid=nbreMedia+1;
				CompactDisc cdisc = new CompactDisc(pid,prix,num,tit,"CD",clen,cdir,tracklist);
				mediaList.add(cdisc);
				break;
			default:
				
				ans ="O";
			
			}	
			
			System.out.println("Voulez vous ajouter un autre média? O/N");
			Scanner sc = new Scanner(System.in);
			String rep = sc.next();
			//sc.close();
			ans = rep.substring(0,1).toUpperCase();
			
			
		}while (ans.equals("O"));
		
		System.out.println("Liste des médias disponible");
		
		System.out.format("%40s","----------------------------------------------------------------");
		System.out.println();
		System.out.format("| %5s |", "ID");
		System.out.format("| %10s |", "Title");
		System.out.format("| %5s |", "Qté");
		System.out.format("| %17s |", "Prix");
		System.out.format("| %10s |", "Catégory");
		System.out.println();
		for (Media i : mediaList) {
			
			System.out.format("%40s","----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5d |", i.getId());
			System.out.format("| %10s |",i.getTitle());
			System.out.format("| %5d |", i.getNumber());
			System.out.format("| %15.2f |", i.getPrice());
			System.out.format("| %10s |", i.getCategory());
			System.out.println();
			
			//System.out.println("|"+i.getId()+"|"+i.getTitle()+"|"+i.getNumber()+"|"+i.getCategory());
			
		}
		System.out.format("%40s","----------------------------------------------------------------");
		return mediaList;
			
	}
	
		
	public ArrayList<Media> delete(ArrayList<Media> listMedia) {
		System.out.println("Liste des médias disponible");
		System.out.format("%40s", "----------------------------------------------------------------");
		System.out.println();
		System.out.format("| %5s |", "ID");
		System.out.format("| %10s |", "Title");
		System.out.format("| %5s |", "Qté");
		System.out.format("| %15s |", "Prix");
		System.out.format("| %10s |", "Catégory");
		System.out.println();
		for (Media i : listMedia) {

			System.out.format("%40s", "----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5d |", i.getId());
			System.out.format("| %10s |", i.getTitle());
			System.out.format("| %5d |", i.getNumber());
			System.out.format("| %15.2f |", i.getPrice());
			System.out.format("| %10s |", i.getCategory());
			System.out.println();

		}
		System.out.format("%40s", "----------------------------------------------------------------");
		System.out.println("\nSaisissez l'id du média à supprimer: ");
		Scanner scid = new Scanner(System.in);
		int id = scid.nextInt();
		
		Media m=this.findById(listMedia, id);
		
		if(m!=null) {
			listMedia.remove(m);
		}else {
			System.out.println("Ce média n'existe pas dans la liste");
		}
		
		System.out.println("Liste des médias disponible");
		System.out.format("%40s", "----------------------------------------------------------------");
		System.out.println();
		System.out.format("| %5s |", "ID");
		System.out.format("| %10s |", "Title");
		System.out.format("| %5s |", "Qté");
		System.out.format("| %15s |", "Prix");
		System.out.format("| %10s |", "Catégory");
		System.out.println();
		for (Media i : listMedia) {

			System.out.format("%40s", "----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5d |", i.getId());
			System.out.format("| %10s |", i.getTitle());
			System.out.format("| %5d |", i.getNumber());
			System.out.format("| %15.2f |", i.getPrice());
			System.out.format("| %10s |", i.getCategory());
			System.out.println();

			//System.out.println("|"+i.getId()+"|"+i.getTitle()+"|"+i.getNumber()+"|"+i.getCategory());

		}
		System.out.format("%40s", "----------------------------------------------------------------");

		return listMedia;
	}
	public void findByIdVerbose(ArrayList<Media> listMedia) {
		System.out.println("Veuillez saisir l'ID du média recherché");
		Scanner scid = new Scanner(System.in);
		int id = scid.nextInt();
		Media m = this.findById(listMedia, id);
		if(m!=null) {
			System.out.format("%40s", "----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5s |", "ID");
			System.out.format("| %10s |", "Title");
			System.out.format("| %5s |", "Qté");
			System.out.format("| %15s |", "Prix");
			System.out.format("| %10s |", "Catégory");
			System.out.println();
			//for (Media i : listMedia) {

				System.out.format("%40s", "----------------------------------------------------------------");
				System.out.println();
				System.out.format("| %5d |", m.getId());
				System.out.format("| %10s |", m.getTitle());
				System.out.format("| %5d |", m.getNumber());
				System.out.format("| %15.2f |", m.getPrice());
				System.out.format("| %10s |", m.getCategory());
				System.out.println();

				//System.out.println("|"+i.getId()+"|"+i.getTitle()+"|"+i.getNumber()+"|"+i.getCategory());

			//}
			System.out.format("%40s", "----------------------------------------------------------------");
			
		}else {
			System.out.println("Le media recherché n'existe pas dans la liste");
		}
		

		
	}
	
	
	public void findByNameVerbose(ArrayList<Media> listMedia) {
		System.out.println("Veuillez saisir le nom du média recherché");
		Scanner scid = new Scanner(System.in);
		String name = scid.nextLine();
		Media m = this.findByName(listMedia, name);
		if(m!=null) {
			System.out.format("%40s", "----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5s |", "ID");
			System.out.format("| %10s |", "Title");
			System.out.format("| %5s |", "Qté");
			System.out.format("| %15s |", "Prix");
			System.out.format("| %10s |", "Catégory");
			System.out.println();

			System.out.format("%40s", "----------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5d |", m.getId());
			System.out.format("| %10s |", m.getTitle());
			System.out.format("| %5d |", m.getNumber());
			System.out.format("| %15.2f |", m.getPrice());
			System.out.format("| %10s |", m.getCategory());
			System.out.println();

				
			System.out.format("%40s", "----------------------------------------------------------------");
			
		}else {
			System.out.println("Le media recherché n'existe pas dans la liste");
		}
		
	}
	
public Media findById(ArrayList<Media> listMedia, int mediaId) {
    	
		    for(Media m : listMedia) {
		        if(mediaId== m.getId()) {
		            return m;
		        }
		    }
		    return null;
		
}
public void setById(ArrayList<Media> listMedia, int mediaId, Media pMedia) {
    	int i=-1;
    	
	    for(Media m : listMedia) {
	    	i++;
	        if(mediaId== m.getId()) {
	        	
	        	listMedia.set(i, pMedia);
	            
	        }
	    }
	
}
    
    public Media findByName(ArrayList<Media> listMedia, String mediaName) {
    	
	    for(Media m : listMedia) {
	        if(mediaName.equals(m.getTitle())) {
	            return m;
	        }
	    }
	    return null;
	
    }
 // Order Management 
    public ArrayList<AllOrderedList>createorder(ArrayList<Media> listMedia,ArrayList<AllOrderedList> pList) {
    	String ans = "N";
    	ArrayList<Order> orderedList = new  ArrayList<Order>();
    	Scanner scanId,scanQty;
		int id;// id du média à commander, saisi par l'utilisateur
		int qty;//Quantité à commander
		Media m;//variable media, servant à la recherche du avant l'opération de commande 
		float prix=0;
    	
    do {
    		float p=0;
    		System.out.println("ID du média à commander:");
			scanId = new Scanner(System.in);
			id = scanId.nextInt();
			m=this.findById(listMedia, id);
			if (m!=null) {
				System.out.println("Quantité de média à commander:");
				scanQty = new Scanner(System.in);
				qty = scanQty.nextInt();
				p = qty*m.getPrice();//A revoir
				Order ordered = new Order(m,id, qty,p);
				orderedList.add(ordered);
				prix +=p;
				
			}else {
				System.out.println("Le média n'existe pas!!");
			}
	    	System.out.println("Ajouter un autre média à la commande? O/N");
			Scanner sc = new Scanner(System.in);
			String rep = sc.next();
			ans = rep.substring(0,1).toUpperCase();
	}while (ans.equals("O"));
    System.out.println("Costumer name: ");
	Scanner scannCostumer = new Scanner(System.in);
	String costumer = scannCostumer.nextLine();
    DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date currentDate = new Date();//Date non formatée
	id=pList.size();
	AllOrderedList l = new AllOrderedList(orderedList,format.format(currentDate),id+1,prix,costumer);
	pList.add(l);
	
	
	System.out.format("%40s", "--------------------------------------------------------------------------");
	System.out.println();
	System.out.format("| %5s |", "ID");
	System.out.format("| %18s |", "Date");
	System.out.format("| %20s |", "List of ordered media");
	System.out.format("| %15s |", "Total Price");
	System.out.format("| %15s |", "Customer");
	System.out.println();
	
	
	for (AllOrderedList i : pList) {
		

		System.out.format("%40s", "--------------------------------------------------------------------------");
		System.out.println();
		System.out.format("| %5d |", i.getId());
		System.out.format("| %10s |", i.getDate());
		for (Order o: i.getOneOrder()) {
				
			System.out.format("%d x %-10s,",o.getQty(),o.getOrderedobject().getTitle());
			
			
		}
		System.out.format("| %15.2f |", i.getPrice());
		System.out.format("| %15s |", i.getCustomer());
		System.out.println();


	}
	
	
    	return pList;
		
	}
 
    public ArrayList<Media> update(ArrayList<Media> pMediaList) {
		
    	// Update of the book
    		
    		if (pMediaList.size()!=0) {
    			System.out.println("Liste des médias disponible");
    			System.out.format("%40s", "----------------------------------------------------------------");
    			System.out.println();
    			System.out.format("| %5s |", "ID");
    			System.out.format("| %10s |", "Title");
    			System.out.format("| %5s |", "Qté");
    			System.out.format("| %17s |", "Prix");
    			System.out.format("| %10s |", "Catégory");
    			System.out.println();
    			for (Media i : pMediaList) {

    				System.out.format("%40s", "----------------------------------------------------------------");
    				System.out.println();
    				System.out.format("| %5d |", i.getId());
    				System.out.format("| %10s |", i.getTitle());
    				System.out.format("| %5d |", i.getNumber());
    				System.out.format("| %15.2f |", i.getPrice());
    				System.out.format("| %10s |", i.getCategory());
    				System.out.println();

    				//System.out.println("|"+i.getId()+"|"+i.getTitle()+"|"+i.getNumber()+"|"+i.getCategory());

    			}
    			System.out.format("%40s", "----------------------------------------------------------------");
    			System.out.println("\nSaisissez l'id du média à mettre à jour: ");
    			Scanner scid = new Scanner(System.in);
    			int id = scid.nextInt();
    			Media m=this.findById(pMediaList, id);
    			
    			if(m!=null) {
    				System.out.println("Changer le titre: [" + m.getTitle() + "]");
    				Scanner sc = new Scanner(System.in);
    				String title = sc.nextLine();
    				if (title.length() != 0) {
    					m.setTitle(title);
    				}
    				System.out.println("Changer le Prix: [" + m.getPrice() + "]");
    				Scanner px = new Scanner(System.in);
    				String prix = px.nextLine();
    				if (prix.length()!=0) {
    					float price = Float.parseFloat(prix);
    					m.setPrice(price);
    				}
    				System.out.println("Changer le nombre: [" + m.getNumber() + "]");
    				Scanner nb = new Scanner(System.in);
    				String nbrstr = nb.nextLine();
    				
    				if (nbrstr.length()!=0) {
    					int nbr = Integer.parseInt(nbrstr);
    					m.setNumber(nbr);
    				}
    				if (m instanceof Book) {

    					ArrayList<String> authors = new ArrayList<String>();
    					System.out.println("Changer le Publisher: [" + ((Book) m).getPublisher() + "]");
    					Scanner pu = new Scanner(System.in);
    					String pub = pu.nextLine();
    					if (pub.length() != 0) {
    						((Book) m).setPublisher(pub);
    					}
    					for (String a : ((Book) m).getAuthorsList()) {
    						System.out.println("Auteur: [" + a + "]");
    						Scanner aut = new Scanner(System.in);
    						String auth = aut.nextLine();
    						if (auth != null) {
    							authors.add(auth);
    						} else {
    							authors.add(a);
    						}
    					}
    					((Book) m).setAuthorsList(authors);
    				}
    				if (m instanceof DigitalVideoDisc) {

    					System.out.println("Changer le Director: [" + ((DigitalVideoDisc) m).getDirector() + "]");
    					Scanner dgv = new Scanner(System.in);
    					String pub = dgv.nextLine();
    					if (pub.length() != 0) {
    						((DigitalVideoDisc) m).setDirector(pub);
    						//pMediaList.set(id, m);
    					}
    					if (m instanceof CompactDisc) {
    						ArrayList<Track> tracks = new ArrayList<Track>();
    						Track b = new Track();
    						float cdl = 0;
    						for (Track a : ((CompactDisc) m).getTracklist()) {
    							System.out.println("Track: [" + a.getTitle() + "]");
    							Scanner tit = new Scanner(System.in);
    							String tle = tit.nextLine();
    							System.out.println("Durée du Track: [" + a.getLenth() + "]");
    							Scanner ln = new Scanner(System.in);
    							String lnstr = ln.nextLine();
    							
    							if (tle != null) {
    								
    								b.setTitle(tle);
    							} else {
    								b.setTitle(a.getTitle());
    							}
    							if (lnstr.length() != 0) {
    								float tlen = Float.parseFloat(lnstr);
    								b.setLength(tlen);
    								cdl += tlen;
    							} else {
    								b.setLength(a.getLenth());
    								cdl += a.getLenth();
    							}
    							tracks.add(b);
    						}
    						((CompactDisc) m).setTrackList(tracks);
    						((CompactDisc) m).setLength(cdl);
    					} else {
    						System.out.println("Modifier la longueur du Disc: [" + ((DigitalVideoDisc) m).getLength() + "]");
    						Scanner dlen = new Scanner(System.in);
    						String dlstr = dlen.nextLine();
    						
    						if (pub.length() != 0) {
    							float dl = Float.parseFloat(dlstr);
    							((DigitalVideoDisc) m).setLength(dl);
    							//pMediaList.set(id, m);
    						}
    					}
    				}
    					
    				//setById(ArrayList<Media> listMedia, int mediaId, Media pMedia)
    				this.setById(pMediaList, id,m);
    				
    				System.out.println("Liste des médias disponible");
    				System.out.format("%40s", "----------------------------------------------------------------");
    				System.out.println();
    				System.out.format("| %5s |", "ID");
    				System.out.format("| %10s |", "Title");
    				System.out.format("| %5s |", "Qté");
    				System.out.format("| %15s |", "Prix");
    				System.out.format("| %10s |", "Catégory");
    				System.out.println();
    				for (Media i : pMediaList) {

    					System.out.format("%40s", "----------------------------------------------------------------");
    					System.out.println();
    					System.out.format("| %5d |", i.getId());
    					System.out.format("| %10s |", i.getTitle());
    					System.out.format("| %5d |", i.getNumber());
    					System.out.format("| %15.2f |", i.getPrice());
    					System.out.format("| %10s |", i.getCategory());
    					System.out.println();
    				}
    				System.out.format("%40s", "----------------------------------------------------------------");
    				
    			}else {
    				System.out.println("Ce média n'existe pas dans la liste");
    			}
    		}else {
    			System.out.println("Votre bibliothèque est vide");
    	}
    			
    	return pMediaList;
    		
    }
    
	
public ArrayList<AllOrderedList> updateorder(ArrayList<Media> listMedia,ArrayList<AllOrderedList> pList) {
		
		if (pList.size()!=0) {
			System.out.println("Liste des commandes disponibles");
			System.out.format("%40s", "--------------------------------------------------------------------------");
			System.out.println();
			System.out.format("| %5s |", "ID");
			System.out.format("| %18s |", "Date");
			System.out.format("| %20s |", "List of ordered media");
			System.out.format("| %15s |", "Total Price");
			System.out.format("| %15s |", "Customer");
			System.out.println();
			for (AllOrderedList i : pList) {

				System.out.format("%40s", "--------------------------------------------------------------------------");
				System.out.println();
				System.out.format("| %5d |", i.getId());
				System.out.format("| %10s |", i.getDate());
				for (Order o : i.getOneOrder()) {

					System.out.format("%d x %-10s,", o.getQty(), o.getOrderedobject().getTitle());

				}
				System.out.format("| %15.2f |", i.getPrice());
				System.out.format("| %15s |", i.getCustomer());
				System.out.println();
			}
			System.out.println("\nSaisissez l'id de la commande à mettre à jour: ");
			Scanner scid = new Scanner(System.in);
			int id = scid.nextInt();
			AllOrderedList o=this.findOrderById(pList, id);
			if (o!=null) {
				
				
				
			}else {
				System.out.println("La commande n'existe pas");
				
			}
			
			
			
			
			
			
		}else {
			System.out.println("Aucune commande n'est disponible");
			
		}
		
		return pList;
	}
		
	public AllOrderedList findOrderById(ArrayList<AllOrderedList> listOrder, int orderId) {
	    	
		    for( AllOrderedList o : listOrder) {
		        if(orderId== o.getId()) {
		            return o;
		        }
		    }
		    return null;
		
	}
	public void listorders() {
		
	}


}
