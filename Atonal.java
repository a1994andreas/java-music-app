package MMC;

/**
*This class extends composition 
 * @author andreas
 */
public abstract class Atonal extends Composition{
	/**
	 * this function check if the string's notes is acceptable 
	 * @return true if the string is acceptable 
	 * @throws Exception if the string notes is not acceptable
	 */
	public boolean checknotes() throws Exception{return false;}
	/**
	 * this function add a string to existing string notes
	 * @param notes the notes of the track
	 */
	public void AddNotes(String notes){if(this.notes!=null)this.notes+=notes;else this.notes=notes;}

}
