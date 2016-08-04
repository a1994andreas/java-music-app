package Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * this class implements a track(with title , path , notes and duration)
 * @author andreas
 *
 */
public class Track {
	private String title;
	private String path;
	private String notes="";
	private int duration;
	/**
	 * this constructs a Track without to specified any elements
	 */
	public Track(){}
	/**
	 * this constructs a Track and specified the path the name the notes
	 * @param path the path of the track
	 * @throws FileNotFoundException if the file doesn't exist
	 */
	public Track(String path ) throws FileNotFoundException{
		String[] a = path.split("//");
		this.title=a[a.length-1].replaceFirst(".txt","");
		this.path=path;
		Scanner x = new Scanner(new File(path));
		int met =0;
		String m="";
		while(x.hasNext()){
			m=x.next();
			this.notes+=m+" ";
			if(!m.startsWith("I"))
			met++;
		}
		//System.out.println(this.notes);
		this.duration=met;

		
	}
	/**
	 * this function sets the title of the track
	 * @param title the new title of the track
	 */
	public void Settitle(String title){this.title=title;}
	/**
	 * this function sets the path of the track
	 * @param path the new path of the track
	 */
	public void SetPath(String path){this.path=path;}
	/**
	 * this function sets the duration of the track
	 * @param duration the new duration of the track
	 */
	public void Setduration(int duration){this.duration=duration;}
	/**
	 * this function returns the title of the track
	 * @return the track's title
	 */
	public String Gettitle(){return this.title;}
	/**
	 * this function returns the path of the track
	 * @return the track's path
	 */
	public String GetPath(){return this.path;}
	/**
	 * this function returns the duration of the track
	 * @return the track's duration
	 */
	public int GetDuration(){return this.duration;}
	/**
	 * this function change the notes of the track
	 * @param notes the new notes of the track
	 */
	public void SetNotes(String notes){this.notes=notes;}
	/**
	 * this function returns the notes of the track
	 * @return the track's notes
	 */
	public String GetNotes(){return this.notes;}
}
