package Player;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * this class implements a collection(with collection name 
 * ,the playback and a list of tracks)
 * @author andreas
 *
 */
public class Collection {
	private static String collName;
	private static String path;
	private static String pr_path="";
	private static String playback="InARow";
	private List<Track> trackList = new LinkedList<Track>();
	private Scanner x;
	/**
	 * this constructs a new collection without to specified any elements
	 */
	public Collection(){}
	/**
	 * this constructs a new collection 
	 * @param path with given path we create a list of tracks
	 * @throws FileNotFoundException if the file doesn't exist
	 */
	public Collection(String path) throws FileNotFoundException{
		String[] a =path.split("/");
		this.collName=a[a.length-1].replaceFirst(".txt", "");
		this.path=path;
		
		x = new Scanner(new File(path));
		while(x.hasNext()){
			Track w = new Track(x.next());
			trackList.add(w);
		}
	} 
	/**
	 * this constructs a new collection and specified the collection name 
	 * and a list of Tracks
	 * @param collName the collection name
	 * @param trackList the listo of tracks
	 */
	public Collection(String collName , List<Track> trackList){
		this.collName=collName;
		this.trackList=trackList;
	}
	/**
	 * this function add a track in the list of tracks
	 * @param a the track you want to add
	 */
	public void addTrack(Track a){
		trackList.add(a);
	}
	/**
	 * this function remove a track from the list of tracks
	 * @param a the track you want to remove
	 */
	public void removeTrack(Track a){}
	/**
	 * this return the position of a track in the list of tracks
	 * @param a the track you want to find the position
	 * @return the position of the track
	 */
	public int GetPositionInList(Track a){return 0;}
	/**
	 * this move one up the givven track in the list 
	 * @param a the track you want to go up
	 */
	public void trackOneUp(Track a){}
	/**
	 * this move one down the givven track in the list 
	 * @param a the track you want to go one down
	 */
	public void trackONeDown(Track a){}
	/**
	 * this change the track list
	 * @param trackList the new track list
	 */
	public void SettrackList(List<Track> trackList){this.trackList=trackList;}
	/**
	 * this return the list with the tracks
	 * @return the track list
	 */
	public List<Track> GetTrackList(){return this.trackList;}
	/**
	 * this change the collection name
	 * @param collName the new collection name
	 */
	public void SetCollName(String collName){}
	/**
	 * this return the collection name
	 * @return the name of the collection
	 */
	public String GetCollName(){return this.collName;}
	/**
	 * this change the playback of the collection
	 * @param playback the new playback of the collection
	 */
	public void Setplayback(String playback){this.playback=playback;}
	/**
	 * this function return the playback of the collection  
	 * @return the playback of the collection
	 */
	public String GetPlayback(){return this.playback;}
	/**
	 * this function return the pre playback of the collection
	 * @return the previus playback of the collection
	 */
	public String getPrePath(){return pr_path;}
	/**
	 * this function change the previus playback of the collection
	 * @param pr_path the new previus playback of the collection
	 */
	public void setPrePath(String pr_path){this.pr_path=pr_path;}
	/**
	 * this function return the path of the collection
	 * @return the path of the collection
	 */
	public String GetPath(){return path;}
}
