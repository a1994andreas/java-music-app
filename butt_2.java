package Gen_Grafs;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.jfugue.Player;

import MMC.Free;
/**
 * this class implements the interface actionlistener
 * and create 12 buttons with the notes
 * @author andreas
 *
 */
public class butt_2 implements ActionListener {
private JButton  C1 = new JButton();
private JButton  C2 = new JButton();
private JButton  D1 = new JButton();
private JButton  D2 = new JButton();
private JButton  E = new JButton();
private JButton  F1 = new JButton();
private JButton  F2 = new JButton();
private JButton  G1 = new JButton();
private JButton  G2 = new JButton();
private JButton  A1 = new JButton();
private JButton  A2 = new JButton();
private JButton  B = new JButton();
private static Free dd = new Free();
private String mode;
//orizoume to size to backround to position to enable kai pros8etoume addactionlistener 
/**
 * this constructs the buttons and sets the size 
 * the position in the frame ,the text and the background 
 */
public butt_2(String mode){
	this.mode=mode;
	C1.setSize(70, 240);
	C2.setSize(65, 230);
	D1.setSize(55, 220);
	D2.setSize(50, 210);
	E.setSize(50, 160);
	F1.setSize(50, 140);
	F2.setSize(50, 200);
	G1.setSize(50, 200);
	G2.setSize(50, 200);
	A1.setSize(50, 200);
	A2.setSize(50, 200);
	B.setSize(50, 200);
	C1.setLocation(30,40);
	C2.setLocation(105,45);
	D1.setLocation(175,50);
	D2.setLocation(235,55);
	E.setLocation(310,70);
	F1.setLocation(380,70);
	F2.setLocation(450,70);
	G1.setLocation(520,70);
	G2.setLocation(590,70);
	A1.setLocation(660,70);
	A2.setLocation(730,70);
	B.setLocation(800,70);
	C1.setBackground(Color.red);
	C2.setBackground(Color.red);
	D1.setBackground(Color.orange);
	D2.setBackground(Color.orange);
	E.setBackground(Color.yellow);
	F1.setBackground(Color.yellow);
	F2.setBackground(Color.green);
	G1.setBackground(Color.green);
	G2.setBackground(Color.cyan);
	A1.setBackground(Color.cyan);
	A2.setBackground(Color.blue);
	B.setBackground(Color.blue);
	C1.setText("C");
	C2.setText("C#");
	D1.setText("D");
	D2.setText("D#");
	E.setText("E");
	F1.setText("F");
	F2.setText("F#");
	G1.setText("G");
	G2.setText("G#");
	A1.setText("A");
	A2.setText("A#");
	B.setText("B");
	C1.addActionListener(this);
	C2.addActionListener(this);
	D1.addActionListener(this);
	D2.addActionListener(this);
	E.addActionListener(this);
	F1.addActionListener(this);
	F2.addActionListener(this);
	G1.addActionListener(this);
	G2.addActionListener(this);
	A1.addActionListener(this);
	A2.addActionListener(this);
	B.addActionListener(this);
	
}
/**
 * this function return the button with the note C
 * @return the button with the note C
 */
public JButton GetC1(){return C1;}
/**
 * this function return the button with the note C#
 * @return the button with the note C#
 */
public JButton GetC2(){return C2;}
/**
 * this function return the button with the note D
 * @return the button with the note D
 */
public JButton GetD1(){return D1;}
/**
 * this function return the button with the note D#
 * @return the button with the note D#
 */
public JButton GetD2(){return D2;}
/**
 * this function return the button with the note E
 * @return the button with the note E
 */
public JButton GetE(){return E;}
/**
 * this function return the button with the note F
 * @return the button with the note F
 */
public JButton GetF1(){return F1;}
/**
 * this function return the button with the note F#
 * @return the button with the note F#
 */
public JButton GetF2(){return F2;}
/**
 * this function return the button with the note G
 * @return the button with the note G
 */
public JButton GetG1(){return G1;}
/**
 * this function return the button with the note G#
 * @return the button with the note G#
 */
public JButton GetG2(){return G2;}
/**
 * this function return the button with the note A
 * @return the button with the note A
 */
public JButton GetA1(){return A1;}
/**
 * this function return the button with the note A#
 * @return the button with the note A#
 */
public JButton GetA2(){return A2;}
/**
 * this function return the button with the note B
 * @return the button with the note B
 */
public JButton GetB(){return B;}
/**
 * this function sets the action when you ckick on the button
 */
public void actionPerformed(ActionEvent event) {
	text_area gg = new text_area(mode);
	Player a = new Player();
	if(mode.equals("Free") || mode.equals("Algorithmic")){
	if(event.getSource() == C1 ){a.play(dd.getInsturmnet()+"C "); dd.AddNotes("C "); }
	if(event.getSource() == C2){a.play(dd.getInsturmnet()+"C# "); dd.AddNotes("C# ");}
	if(event.getSource() == D1){a.play(dd.getInsturmnet()+"D ");dd.AddNotes("D ");}
	if(event.getSource() == D2){a.play(dd.getInsturmnet()+"D# ");dd.AddNotes("D# ");}
	if(event.getSource() == E){a.play(dd.getInsturmnet()+"E ");dd.AddNotes("E ");}
	if(event.getSource() == F1){a.play(dd.getInsturmnet()+"F ");dd.AddNotes("F ");}
	if(event.getSource() == F2){a.play(dd.getInsturmnet()+"F# ");dd.AddNotes("F# ");}
	if(event.getSource() == G1){a.play(dd.getInsturmnet()+"G ");dd.AddNotes("G ");}
	if(event.getSource() == G2){a.play(dd.getInsturmnet()+"G# ");dd.AddNotes("G# ");}
	if(event.getSource() == A1){a.play(dd.getInsturmnet()+"A ");dd.AddNotes("A ");}
	if(event.getSource() == A2){a.play(dd.getInsturmnet()+"A# ");dd.AddNotes("A# ");}
	if(event.getSource() == B){a.play(dd.getInsturmnet()+"B ");dd.AddNotes("B ");}
	}
	if(mode.equals("AtonalRow") || mode.equals("AtonalComposition")){
		
		if(event.getSource() == C1 ){a.play(dd.getInsturmnet()+"C "); dd.AddNotes("C ");  C1.setBackground(Color.GRAY); C1.setEnabled(false);}
		if(event.getSource() == C2){a.play(dd.getInsturmnet()+"C# "); dd.AddNotes("C# ");C2.setBackground(Color.GRAY); C2.setEnabled(false);}
		if(event.getSource() == D1){a.play(dd.getInsturmnet()+"D ");dd.AddNotes("D ");D1.setBackground(Color.GRAY);D1.setEnabled(false);}
		if(event.getSource() == D2){a.play(dd.getInsturmnet()+"D# ");dd.AddNotes("D# ");D2.setBackground(Color.GRAY);D2.setEnabled(false);}
		if(event.getSource() == E){a.play(dd.getInsturmnet()+"E ");dd.AddNotes("E ");E.setBackground(Color.GRAY);E.setEnabled(false);}
		if(event.getSource() == F1){a.play(dd.getInsturmnet()+"F ");dd.AddNotes("F ");F1.setBackground(Color.GRAY);F1.setEnabled(false);}
		if(event.getSource() == F2){a.play(dd.getInsturmnet()+"F# ");dd.AddNotes("F# ");F2.setBackground(Color.GRAY);F2.setEnabled(false);}
		if(event.getSource() == G1){a.play(dd.getInsturmnet()+"G ");dd.AddNotes("G ");G1.setBackground(Color.GRAY);G1.setEnabled(false);}
		if(event.getSource() == G2){a.play(dd.getInsturmnet()+"G# ");dd.AddNotes("G# ");G2.setBackground(Color.GRAY);G2.setEnabled(false);}
		if(event.getSource() == A1){a.play(dd.getInsturmnet()+"A ");dd.AddNotes("A ");A1.setBackground(Color.GRAY);A1.setEnabled(false);}
		if(event.getSource() == A2){a.play(dd.getInsturmnet()+"A# ");dd.AddNotes("A# ");A2.setBackground(Color.GRAY);A2.setEnabled(false);}
		if(event.getSource() == B){a.play(dd.getInsturmnet()+"B ");dd.AddNotes("B ");B.setBackground(Color.GRAY);B.setEnabled(false);}
	}

}
/**
 * this function return the private element of type free 
 * @return a free variable
 */
public Free GetFree(){return dd;}
}

