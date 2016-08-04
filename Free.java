package MMC;
/**
 * this class extends composition 
 * @author andreas
 *
 */

public class Free extends Composition{
	/**
	 * this constructs a composition in free model without to specified any elements
	 */
	public Free(){}
	/**
	 * this constructs a composition in free model and 
	 * specified the composition'a name
	 * @param comp_name the composition's name
	 */
	public Free(String comp_name){
		this.comp_name=comp_name;
	}
	/**
	 * this constructs a composition in free model and 
	 * specified the composition'a name and the composer's name
	 * @param comp_name the composition's name
	 * @param composer the composer's name
	 */
	public Free(String comp_name,String composer){
		this.comp_name=comp_name;
		this.composer=composer;
	}
	/**
	 *  adds a new note to the older one
	 * @param notes the note you want to add
	 */
	public void AddNotes(String notes){if(this.notes!=null)this.notes+=notes;else this.notes=notes;}
}
