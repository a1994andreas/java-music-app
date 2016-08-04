package Gen_Grafs;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.jfugue.Player;
/**
 * this class implements the interface actionlistener
 * and create the button play and pause
 * @author andreas
 *
 */
public class play_pause implements ActionListener , Runnable{
	private JButton pl_pa = new JButton();
	private int metrhths=0;			
	private String mode;
	private Player d = new Player();
	
	/**
	 * this constructs the button and sets the background , the size and the location
	 */
	public play_pause (String mode){
		this.mode=mode;
		pl_pa.setIcon(new ImageIcon("C://test2.png"));
		pl_pa.setSize(60,60);
		pl_pa.setLocation(820,10);
		pl_pa.addActionListener(this);
		
	
	}
	/**
	 * this function return the button play , pause
	 * @return the button play-pause
	 */
	public JButton getPl_Pa(){return pl_pa;}
	/**
	 *  this function sets the action when you ckick on the button
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == pl_pa && metrhths%2==0){
			pl_pa.setIcon(new ImageIcon("C://test1.png"));
			Thread dk = new Thread(this,"dokimh");
			dk.start();
			//d.play(a.GetFree().getNotes());
					
		}else 		{	d.stop(); pl_pa.setIcon(new ImageIcon("C://test2.png"));}
		metrhths++;
	}
	/**
	 * this function running when the thread starts
	 */
	public void run(){
		butt_2 a = new butt_2(mode);
		if(a.GetFree().getNotes()!=null) d.play(a.GetFree().getNotes());
		if(metrhths%2!=0) {metrhths++; pl_pa.setIcon(new ImageIcon("C://test2.png"));}
	}
	
	
	
	
}
