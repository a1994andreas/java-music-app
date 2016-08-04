package Player;


import java.awt.List;
import java.io.FileNotFoundException;
import java.util.LinkedList;

import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
/**
 * this class create a scrollable JList with all the tracks and all the informations about the tracks
 * @author andreas
 *
 */
public class AddJList {
	String name="NAME";
	String title="Title";
	String[] dok = new String[10]  ;
	private static int mee=0;
	private JList<String> all1= new JList<String>();
	private JScrollPane lala;
	private JProgressBar a ;
	/**
	 * this constructs a new Jlist and a scrollpane
	 * @param aa the path of the collection you want to add in the list
	 * @throws FileNotFoundException if the file doesn't exist
	 */
	public AddJList(String aa) throws FileNotFoundException{
		a = new JProgressBar();
		Collection a = new Collection(aa);
		
		dok = new String[a.GetTrackList().size()+1];
		dok[0]="Playing"+"     Artist/Album"+"           Track  No"+"        Title"+"                 Duration ";
		
		for(int i =0 ; i<dok.length-1;i++){
			dok[i+1]="                  "+a.GetCollName()+"                               "+(i+1)+"                     "
		+a.GetTrackList().get(i).Gettitle()+"               "+a.GetTrackList().get(i).GetDuration();
		}
		
		
		lala =new JScrollPane(all1);
		all1.setListData(dok);
		
		lala.setVisible(true);
		lala.setLocation(0, 200);
		lala.setSize(786, 145);
		all1.setVisible(true);
		all1.setLocation(0,270);
		all1.setSize(800, 100);
	 }
	/**
	* this function return the jlist witch created by the constructor
     * @return the jlist
	 */
	public JList<String> getjist(){return all1;}
	/**
	 * this function return the scrollpane witch created by the constructor
     * @return the scrollpane
	 */
	public JScrollPane getJscrollpane(){return lala;}
}
