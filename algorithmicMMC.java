package GRAFICS;

import Gen_Grafs.butt_1;

//import Gen_Grafs.butt_1;

/**
 * this class extends the class EFC
 * @author andreas
 *
 */

public class algorithmicMMC extends EFC{
	/**
	 * this constructs an editor in algorithmic mode
	 */
	public algorithmicMMC(){
		super("Algorithmic");
		butt_1 koumpia = new butt_1();
		 F.add(koumpia.Getgenerate());
	}

}

