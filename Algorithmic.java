package MMC;

import java.util.Random;

/**
 * 
 * @author andreas
 *This class extends the class Composition.
 */
public class Algorithmic extends Composition {
	Random ran1;
	private String path;
	private int x1;
	private static Free dd = new Free();
	
	/**
	 * this constructs a composition in algorithmic mode and specified the path and the composition name
	 * @param path the path of the file
	 * @param comp_name  the composition' name
	 * @throws Exception if doesn't exist file in this path
	 */
	public Algorithmic(String path,String comp_name)throws Exception{
		this.comp_name=comp_name;
		this.path=path;
	}
	/**
	 * this constructs a composition in algorithmic mode and specified the path , the composition name and the composer's name
	 * @param path the path of the file
	 * @param comp_name  the composition' name
	 * @param composer the composer name 
	 * @throws Exception if doesn't exist file in this path
	 */
	public Algorithmic(String path, String comp_name,String composer)throws Exception{
		this.comp_name=comp_name;
		this.composer=composer;
	
		this.path=path;
	}
	/**
	 * this change the path of this file
	 * @param path the path of the file
	 * @throws Exception if doesn't exist file in the new path
	 */
	public void SetPath(String path) throws Exception{this.path=path;}
	/**
	 * this return a string with the path of the file
	 * @return the path of the file
	 */
	public String GetPath(){return path;}

	/**
	 * this constructs a composition in algorithmic mode and without to specified 
	 * any elements
	 */
	public Algorithmic(){}
	/**
	 *this generate random notes depending the given string of notes
	 * @param a the string you want to edit
	 */
	public void generator(String a){
		
		String aa=a;
		System.out.println(a);
		String[] z=a.split(" ");
		for(int i=0; i<z.length; i++){
				ran1=new Random();
				this.x1=ran1.nextInt(128) + 0;
				aa+="["+x1+"] ";
			
		}
		dd.setNotes(aa);
		
	}
	}
