package GRAFICS;

import Gen_Grafs.butt_1;

/**
 * this class extends the class EFC
 * @author andreas
 *
 */
public class atonalMMC extends EFC{
	/**
	 * this constructs an editor in atonal mode
	 */
	public atonalMMC(String mode){
		super(mode);
		butt_1 koumpia = new butt_1();
	    F.add(koumpia.Getdonothing());
	    F.add(koumpia.Getretrograde());
	    F.add(koumpia.Getreflect());
	    F.add(koumpia.Gettranspose());
	}
	

}
