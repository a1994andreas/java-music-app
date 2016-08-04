package MMC;
/**
 * 
 * @author vaggeliw , andreas
 *Contains the basic elements and functions of any model (free/Atonal/algorithmic)  of the xylophone
 *
 */
public abstract class Composition{

	protected static String notes;
	protected static String insturment="I[Piano] ";
	protected static String comp_name;
	protected static String composer="csd3076";
	/**
	 * this functions change the string notes
	 * @param notes the notes of the track
	 */
	public void setNotes(String notes){this.notes =notes;}
	/**
	 * this function change the string composition name
	 * @param comp_name the composition's name
	 */
	public void setComp_name(String comp_name){this.comp_name=comp_name;} 
	/**
	 * this function change the string composer
	 * @param composer the composer's name
	 */
	public void setComposer(String composer){this.composer =composer;}
	/**
	 * this function change the instrument
	 * @param insturment the instrument of  the track
	 */
	public void setInturment(String insturment){this.insturment=insturment;}
	/**
	 * this return a string with the notes
	 * @return the notes of this composition
	 */
	public String getNotes(){if(notes!= null) return notes; else throw new IllegalArgumentException("mpla mpla");}
	/**
	 * this return a string with the composition's name
	 * @return the composition's name 
	 */
	public String getComp_name(){return comp_name;}
	/**
	 * this return a string with the composer 
	 * @return the compeser of this composition
	 */
	public String getComposer(){return composer;}
	/**
	 * this return a string with the instrument
	 * @return the instrument of the composition
	 */
	public String getInsturmnet(){return insturment;}
	
	
}