package Gen_Grafs;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import GRAFICS.EFC;
import MMC.*;
/**
 * this class implements the interface actionlistener 
 * and extends the jframe
 * @author andreas
 */
public class butt_1 extends JFrame implements ActionListener {
	
	
	private int x;
	private JButton donothing = new JButton();
	private JButton retrograde = new JButton();
	private JButton transpose = new JButton();
	private JButton reflect = new JButton();
	private JButton generate = new JButton();
	private JRadioButton box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,box11;
	private JRadioButton box0a,box1a,box2a,box3a,box4a,box5a,box6a,box7a,box8a,box9a,box10a,box11a;
	private static Free dd = new Free();
	
	/**
	 * this function return the button donothing
	 * @return the button donothing
	 */
	public JButton Getdonothing(){ return donothing;}
	/**
	 * this function return the button retrograde
	 * @return the button retrograde
	 */
	public JButton Getretrograde(){return retrograde;}
	/**
	  * this function return the button transpose
	 * @return the button transpose
	 */
	public JButton Gettranspose(){return transpose;}
	/**
	  * this function return the button reflect
	 * @return the button reflect
	 */
	public JButton Getreflect(){return reflect;}
	/**
	  * this function return the button generate
	 * @return the button generate
	 */
	public JButton Getgenerate(){return generate;}
	/**
	* this constructs the buttons and sets the size 
	* the position in the frame ,the text and the background 
	* and create 2 jframes for the reflect and transpose
	 */
	public butt_1(){
		donothing.setVisible(true);
		retrograde.setVisible(true);
		transpose.setVisible(true);
		reflect.setVisible(true);
		generate.setVisible(true);
		donothing.setBackground(Color.pink);
		retrograde.setBackground(Color.green);
		transpose.setBackground(Color.CYAN);
		reflect.setBackground(Color.orange);
		generate.setBackground(Color.black);
		donothing.setSize(150 ,50);
		retrograde.setSize(150 , 50);
		transpose.setSize(150 ,50);
		reflect.setSize(150, 50);
		generate.setSize(150, 50);
		donothing.setLocation(50 , 330);
		retrograde.setLocation(250 , 330);
		transpose.setLocation(450 , 330);
		reflect.setLocation(650 , 330);
		generate.setLocation(350, 330);
		donothing.addActionListener(this);
		retrograde.addActionListener(this);
		transpose.addActionListener(this);
		reflect.addActionListener(this);
		generate.addActionListener(this);
		donothing.setText("Do Nothing");
		retrograde.setText("Retrograde");
		transpose.setText("Transpose");
		reflect.setText("Reflect");
		generate.setText("Generate");
		generate.setForeground(Color.white);
		
		
		box1 =new JRadioButton();
		box1.setText("transpose(1)");
		box2 =new JRadioButton();
		box2.setText("transpose(2)");
		box3 =new JRadioButton();
		box3.setText("transpose(3)");
		box4 =new JRadioButton();
		box4.setText("transpose(4)");
		box5 =new JRadioButton();
		box5.setText("transpose(5)");
		box6 =new JRadioButton();
		box6.setText("transpose(6)");
		box7 =new JRadioButton();
		box7.setText("transpose(7)");
		box8 =new JRadioButton();
		box8.setText("transpose(8)");
		box9 =new JRadioButton();
		box9.setText("transpose(9)");
		box10 =new JRadioButton();
		box10.setText("transpose(10)");
		box11 =new JRadioButton();
		box11.setText("transpose(11)");
		
		box0a =new JRadioButton();
		box0a.setText("reflect(0)");
		box1a =new JRadioButton();
		box1a.setText("reflect(1)");
		box2a =new JRadioButton();
		box2a.setText("reflect(2)");
		box3a =new JRadioButton();
		box3a.setText("reflect(3)");
		box4a =new JRadioButton();
		box4a.setText("reflect(4)");
		box5a =new JRadioButton();
		box5a.setText("reflect(5)");
		box6a =new JRadioButton();
		box6a.setText("reflect(6)");
		box7a =new JRadioButton();
		box7a.setText("reflect(7)");
		box8a =new JRadioButton();
		box8a.setText("reflect(8)");
		box9a =new JRadioButton();
		box9a.setText("reflect(9)");
		box10a =new JRadioButton();
		box10a.setText("reflect(10)");
		box11a =new JRadioButton();
		box11a.setText("reflect(11)");
		
		
	}
	/**
	 * this function change the nx
	 * @param nx the new nx
	 */
	public void setX(int nx){
		x=nx;
	}
	/**
	 * this function return the x
	 */
	public  int getX(){
		return x;
	}
	/**
	 * this function sets the action when you ckick on the button
	 */
	public void actionPerformed(ActionEvent E){
		//AtonalRow tita = new AtonalRow();
		
		Algorithmic maria=new Algorithmic();
		if(E.getSource() == donothing){}
		
		if(E.getSource() == reflect){
			JFrame frame =new JFrame();
			frame.setTitle("Reflect(x)");
			frame.setSize(370, 250);
			frame.setLocationRelativeTo(null);
			
			JPanel panel =new JPanel();
			ButtonGroup group =new ButtonGroup();
			group.add(box0a);group.add(box1a);group.add(box2a);group.add(box3a);group.add(box4a);group.add(box5a);group.add(box6a);group.add(box7a);group.add(box8a);group.add(box9a);group.add(box10a);group.add(box11a);
			panel.add(box0a);panel.add(box1a);panel.add(box2a);panel.add(box3a);panel.add(box4a);panel.add(box5a);panel.add(box6a);panel.add(box7a);panel.add(box8a);panel.add(box9a);panel.add(box10a);panel.add(box11a);
			frame.getContentPane().add(panel);
			frame.setVisible(true);
			if(EFC.mode.equals("AtonalComposition")){AtonalComposition sofia = new AtonalComposition();
				if(box0a.isSelected()){setX(1);  sofia.reflect(dd.getNotes(),getX());}
				if(box1a.isSelected()){setX(1); sofia.reflect(dd.getNotes(),getX());}
				if(box2a.isSelected()){setX(2); sofia.reflect(dd.getNotes(),getX());}
				if(box3a.isSelected()){setX(3); sofia.reflect(dd.getNotes(),getX());}
				if(box4a.isSelected()){setX(4); sofia.reflect(dd.getNotes(),getX());}
				if(box5a.isSelected()){setX(5); sofia.reflect(dd.getNotes(),getX());}
				if(box6a.isSelected()){setX(6); sofia.reflect(dd.getNotes(),getX());}
				if(box7a.isSelected()){setX(7);sofia.reflect(dd.getNotes(),getX());}
				if(box8a.isSelected()){setX(8); sofia.reflect(dd.getNotes(),getX());}
				if(box9a.isSelected()){setX(9); sofia.reflect(dd.getNotes(),getX());}
				if(box10a.isSelected()){setX(10); sofia.reflect(dd.getNotes(),getX());}
				if(box11a.isSelected()){setX(11);sofia.reflect(dd.getNotes(),getX());}
				
		}else if(EFC.mode.equals("AtonalRow")){AtonalRow sofia=new AtonalRow();
			if(box0a.isSelected()){setX(1);  sofia.reflect(dd.getNotes(),getX());}
			if(box1a.isSelected()){setX(1); sofia.reflect(dd.getNotes(),getX());}
			if(box2a.isSelected()){setX(2); sofia.reflect(dd.getNotes(),getX());}
			if(box3a.isSelected()){setX(3); sofia.reflect(dd.getNotes(),getX());}
			if(box4a.isSelected()){setX(4); sofia.reflect(dd.getNotes(),getX());}
			if(box5a.isSelected()){setX(5); sofia.reflect(dd.getNotes(),getX());}
			if(box6a.isSelected()){setX(6); sofia.reflect(dd.getNotes(),getX());}
			if(box7a.isSelected()){setX(7); sofia.reflect(dd.getNotes(),getX());}
			if(box8a.isSelected()){setX(8); sofia.reflect(dd.getNotes(),getX());}
			if(box9a.isSelected()){setX(9); sofia.reflect(dd.getNotes(),getX());}
			if(box10a.isSelected()){setX(10); sofia.reflect(dd.getNotes(),getX());}
			if(box11a.isSelected()){setX(11);sofia.reflect(dd.getNotes(),getX());}
		
		}
	}
		
		if(E.getSource() == transpose){
			JFrame frame2 =new JFrame();
			frame2.setTitle("Transpose(x)");
			frame2.setSize(300, 230);
			frame2.setLocationRelativeTo(null);
			
			JPanel panel =new JPanel();
			
			ButtonGroup group =new ButtonGroup();
			group.add(box1);group.add(box2);group.add(box3);group.add(box4);group.add(box5);group.add(box6);group.add(box7);group.add(box8);group.add(box9);group.add(box10);group.add(box11);
			panel.add(box1);panel.add(box2);panel.add(box3);panel.add(box4);panel.add(box5);panel.add(box6);panel.add(box7);panel.add(box8);panel.add(box9);panel.add(box10);panel.add(box11);
			frame2.getContentPane().add(panel);
			frame2.setVisible(true);
			if(EFC.mode.equals("AtonalComposition")){AtonalComposition sofia = new AtonalComposition();
				if(box1.isSelected()){setX(1); sofia.transpose(dd.getNotes(),getX());}
				if(box2.isSelected()){setX(2);  sofia.transpose(dd.getNotes(),getX());}
				if(box3.isSelected()){setX(3); sofia.transpose(dd.getNotes(),getX());}
				if(box4.isSelected()){setX(4); sofia.transpose(dd.getNotes(),getX());}
				if(box5.isSelected()){setX(5);  sofia.transpose(dd.getNotes(),getX());}
				if(box6.isSelected()){setX(6);  sofia.transpose(dd.getNotes(),getX());}
				if(box7.isSelected()){setX(7); sofia.transpose(dd.getNotes(),getX());}
				if(box8.isSelected()){setX(8);  sofia.transpose(dd.getNotes(),getX());}
				if(box9.isSelected()){setX(9); sofia.transpose(dd.getNotes(),getX());}
				if(box10.isSelected()){setX(10); sofia.transpose(dd.getNotes(),getX());}
				if(box11.isSelected()){setX(11);   sofia.transpose(dd.getNotes(),getX());
			}
			
		}else if(EFC.mode.equals("AtonalRow")){AtonalRow sofia=new AtonalRow();
			if(box1.isSelected()){setX(1); sofia.transpose(dd.getNotes(),getX());}
			if(box2.isSelected()){setX(2);  sofia.transpose(dd.getNotes(),getX());}
			if(box3.isSelected()){setX(3); sofia.transpose(dd.getNotes(),getX());}
			if(box4.isSelected()){setX(4);  sofia.transpose(dd.getNotes(),getX());}
			if(box5.isSelected()){setX(5);  sofia.transpose(dd.getNotes(),getX());}
			if(box6.isSelected()){setX(6);  sofia.transpose(dd.getNotes(),getX());}
			if(box7.isSelected()){setX(7); sofia.transpose(dd.getNotes(),getX());}
			if(box8.isSelected()){setX(8);  sofia.transpose(dd.getNotes(),getX());}
			if(box9.isSelected()){setX(9); sofia.transpose(dd.getNotes(),getX());}
			if(box10.isSelected()){setX(10); sofia.transpose(dd.getNotes(),getX());}
			if(box11.isSelected()){setX(11);   sofia.transpose(dd.getNotes(),getX());}
	
		}
		}
			if(E.getSource() == retrograde){
				if(EFC.mode.equals("AtonalComposition")){AtonalComposition sofia = new AtonalComposition();
					sofia.retrograde(dd.getNotes());
				} else if(EFC.mode.equals("AtonalRow")){AtonalRow sofia=new AtonalRow();
					sofia.retrograde(dd.getNotes());
			}
		}
		if(E.getSource()== generate){
			maria.generator(dd.getNotes());
		}
	}
}