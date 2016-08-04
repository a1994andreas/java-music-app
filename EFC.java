package GRAFICS;


import java.awt.Color;

import javax.swing.JFrame;

import Gen_Grafs.butt_2;
import Gen_Grafs.menu_bar;
import Gen_Grafs.play_pause;
import Gen_Grafs.text_area;

/**
 * A general abstract class witch create a frame
 * @author andreas
 *
 */
public abstract class EFC {
	
	public static JFrame F;
	public static String mode="Free";
	/**
	 * this change the mode of the editor
	 * @param mode the mode of the editor
	 */
	public void setMode(String mode){
		this.mode=mode;
	}
	/**
	 * this return the mode of the editor
	 * @return the mode of the editor
	 */
	public String getMode(){
		return mode;
	}
	/**
	 * this change the frame of the editor
	 * @param F the frame of the editor
	 */
	public void setWind(JFrame F){
		this.F=F;
	}
	/**
	 * this return the frame of the editor
	 * @return the editor's frame
	 */
	public JFrame getWind(){
		return F;
	}
	/**
	 * this constructs a new editor and specified the mode
	 * and add the basic buttons and the menu
	 * @param mode the mode of the editor
	 */
	public EFC(String mode){
		F = new JFrame("Kolpa zorika!");
		this.mode=mode;
		 menu_bar a =new menu_bar(mode);
		    F.setLayout(null);
		    F.setJMenuBar(a.getMenubar());
		    F.getContentPane().setBackground(Color.WHITE);
		    //.................
		    //tou pros8etoume to textarea
		    text_area b = new text_area(mode);
		    F.add(b.GetJEditorPane());
		    
		    butt_2 koumpia2 = new butt_2(this.mode);
		    F.add(koumpia2.GetA1());
		    F.add(koumpia2.GetA2());
		    F.add(koumpia2.GetB());
		    F.add(koumpia2.GetC1());
		    F.add(koumpia2.GetC2());
		    F.add(koumpia2.GetD1());
		    F.add(koumpia2.GetD2());
		    F.add(koumpia2.GetE());
		    F.add(koumpia2.GetF1());
		    F.add(koumpia2.GetF2());
		    F.add(koumpia2.GetG1());
		    F.add(koumpia2.GetG2());
		    play_pause pl_p = new play_pause(this.mode);
		    F.add(pl_p.getPl_Pa());
		    F.setSize(900 , 600);
		    F.setVisible(true);
	}
	
}
