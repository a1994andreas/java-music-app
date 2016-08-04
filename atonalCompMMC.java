package GRAFICS;

import Gen_Grafs.butt_1;

//import Gen_Grafs.butt_1;


/**
 * this class extends the class atonalMMC
 * @author andreas
 *
 */
public class atonalCompMMC extends atonalMMC {
	/**
	 * this constructs an editor in atonal composition mode
	 */
	public atonalCompMMC(){
		
		super("AtonalComposition");
		butt_1 koumpia = new butt_1();
	    F.add(koumpia.Getdonothing());
	    F.add(koumpia.Getretrograde());
	    F.add(koumpia.Getreflect());
	    F.add(koumpia.Gettranspose());
	   
	}

}
