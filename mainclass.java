package Player;

import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;





public class mainclass{

	public static JFrame dok = new JFrame("PLAYER");
	public static JScrollPane dok1 = new JScrollPane();
	
	public static void main(String args[]) throws FileNotFoundException{
		dok.setLayout(null); 
		Menu a = new Menu();
		dok.setJMenuBar(a.getMenubar());
		Buttons b = new Buttons();
		dok.add(b.GetPlay());
		dok.add(b.GetPause());
		dok.add(b.GetStop());
		dok.add(b.GetNextTrack());
		dok.add(b.GetPreTrack());
		dok.add(b.Getvol());
		dok.add(b.Getvol2());
		AddJList m = new AddJList("C://play.txt");
		dok1=m.getJscrollpane();
		dok1.setPreferredSize(new Dimension(1000,100) );
		dok1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		dok.add(dok1);
		
		dok.getContentPane().setBackground(Color.white);
		dok.setSize(800 , 400);
		dok.setVisible(true);
	}
	public JFrame getJframe(){return dok;}
	public void setjscrollpane(JScrollPane a){dok.add(a);}
	public JScrollPane getJscrollpane(){return dok1;}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	