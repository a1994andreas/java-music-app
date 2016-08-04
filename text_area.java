package Gen_Grafs;


import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * this class create a scrollable text area
 * @author andreas
 *
 */
public class text_area {
	private JTextArea stoixeia ; 
	private JScrollPane a ;
	
	/**
	 * this constructs the size , the location in the frame and the background of the text area
	 */
	public text_area(String mode){
		butt_2 yy = new butt_2(mode);
		 stoixeia = new JTextArea(
					"Composition: Java Project\n"
					+"Composer: AM 3076 , 3031\n"
					+"Mode: "+mode
					+"\nInstrument: "+yy.GetFree().getInsturmnet()
					+"\n\n",4 , 30);
		 stoixeia.setEditable(false);
			stoixeia.setBackground(Color.LIGHT_GRAY);
		 a = new JScrollPane(stoixeia);
		a.setLocation(0 ,400);
		a.setSize(890,140);
		
	}
	public void refreshTextArea(){
		stoixeia.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naa");
		
	}
	/**
	 * this function return the text area witch the constructor create
	 * @return the text area
	 */
	public JScrollPane GetJEditorPane(){return a;}
	public JTextArea GetJTextArea(){return stoixeia;}

}
