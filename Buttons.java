package Player;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.jfugue.Pattern;
import org.jfugue.Player;
/**
 * this class implements the actionlistener and the runnable interfaces
 * and create 7 buttons (play , stop, pause, next track , previus track , volume up , volume down)
 * @author andreas
 *
 */
public class Buttons implements ActionListener, Runnable {
	private JButton Play = new JButton();
	private JButton Pause = new JButton();
	private JButton Stop = new JButton();
	private JButton NextTrack = new JButton();
	private JButton PreTrack = new JButton();
	private Collection dok1 ;
	private Collection dok2 = new Collection();
	private Player d = new Player();
	public Thread dk; 
	private String[] nn;
	private boolean a1,a2,a3=true , a4=true;;
	private int r=0 ,tt;
	private   int w=0;
	private Track keep_tr ;
	private JButton vol = new JButton();
	private JButton vol2 = new JButton();
	int a=10200;
	String aa=" ";
	/**
	 * this constructs the buttons and sets the size 
	 * the position in the frame ,the text and the images
	 */
	public Buttons(){
		Play.setVisible(true);
		Pause.setVisible(true);
		Stop.setVisible(true);
		NextTrack.setVisible(true);
		PreTrack.setVisible(true);
		vol.setVisible(true);
		vol.setSize(32, 32);
		vol.setLocation(30, 72);
		vol.addActionListener(this);
		vol2.setVisible(true);
		vol2.setSize(32, 32);
		vol2.setLocation(77, 72);
		vol2.addActionListener(this);
		vol.setIcon(new ImageIcon("C://test//test6.png"));
		vol2.setIcon(new ImageIcon("C://test//test7.png"));
		Play.setSize(32 ,32);
		Pause.setSize(32 ,32);
		Stop.setSize(32 ,32);
		NextTrack.setSize(32 ,32);
		PreTrack.setSize(32 ,32);
		Play.setLocation(30,20);
		Pause.setLocation(60, 20);
		Stop.setLocation(90, 20);
		PreTrack.setLocation(120, 20);
		NextTrack.setLocation(150, 20);
		Play.addActionListener(this);
		Pause.addActionListener(this);
		Stop.addActionListener(this);
		NextTrack.addActionListener(this);
		PreTrack.addActionListener(this);
		Play.setIcon(new ImageIcon("C://test//test1.png"));
		Pause.setIcon(new ImageIcon("C://test//test2.png"));
		Stop.setIcon(new ImageIcon("C://test//test3.png"));
		PreTrack.setIcon(new ImageIcon("C://test//test4.png"));
		NextTrack.setIcon(new ImageIcon("C://test//test5.png"));
	}
	/**
	 * this function sets the action when you ckick on the button
	 */
	public synchronized void actionPerformed(ActionEvent E){
		try {
			dok1 = new Collection(dok2.GetPath());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(E.getSource() == Play){
			if(a2)w=0;
			a1=true;
			a4=true;
			dk=new Thread(this);
			a2=true;
			if(a3)dk.start();
			a3=false;
			
		}
		if(E.getSource() == Pause){
			a2=false;
			a4=false;
			notify();
		}
		if(E.getSource() == Stop){
			//if(dok1.GetPlayback().equals("RepeatTrack")){w=0;}
			//else {w=-1;}
			w=-1;
			a2=false;
			a4=false;
			notify();	
		}
		
		if(E.getSource() ==NextTrack){
			w++;
			a1=true;
			a2=true;
			notify();
			//dk.stop();

		}
		if(E.getSource() == PreTrack){
			w--;
			a1=true;
			a2=true;
			notify();

		}
		if (E.getSource() == vol){
			aa=" ";
			a=a-1200;
			Pattern pattern = new Pattern(" X[Volume]="+ a);
			System.out.println(pattern);
			aa=pattern+aa;
		}
		if (E.getSource() == vol2){
			aa=" ";
			a=a+1200;
			Pattern pattern = new Pattern(" X[Volume]="+ a);
			System.out.println(pattern);
			aa=pattern+aa;
		}
	}
	/**
	 * this function runs when the thread start
	 */
	public void run() {
		while(a1){
			if(dok1.GetPlayback().equals("InARow") && a4 ){ 
				for(int i=w ; i<dok1.GetTrackList().size() ;i++){
					if(dok1.GetTrackList().get(i).GetPath().contains(".mid")){
					try {
						d.playMidiDirectly(new File(dok1.GetTrackList().get(i).GetPath()));
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvalidMidiDataException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
					else
						
						nn = dok1.GetTrackList().get(i).GetNotes().split(" ");
						for(int g=0 ; g<nn.length;g++){
							d.play(aa+nn[g]);
						}
						//d.play(aa+dok1.GetTrackList().get(i).GetNotes()); 
						w++; 
						System.out.println(aa+dok1.GetTrackList().get(i).GetNotes());
						break;}
				}
			
			if(dok1.GetPlayback().equals("RandomOrder") && a4){
				Random q = new Random();
				w=q.nextInt(dok1.GetTrackList().size());
				d.play(dok1.GetTrackList().get(w).GetNotes());
			}
			if(dok1.GetPlayback().equals("RepeatTrack") && a4){
				for( ; ; ){
					if(dok1.GetTrackList().size()==w){w--;}
					d.play(dok1.GetTrackList().get(w).GetNotes());
				}
			}
			if(dok1.GetPlayback().equals("RepeatList") && a4){
				for(int i=w ; i<dok1.GetTrackList().size() ;i++){
					d.play(dok1.GetTrackList().get(i).GetNotes()); 
					w++;
					if(w==dok1.GetTrackList().size())w=0; 
					break;
					}
			}
			
		}
				try{
				synchronized(this){
					while(!a2 && a4){
						wait();
					}
				}
			}
			catch(InterruptedException e){System.out.println("Wrong");}
		}
				
	
	

/**
 * this function return the button play
 * @return the play button 
 */
public JButton GetPlay(){return Play;}
/**
 * this function return the button pause
 * @return the pause button 
 */
public JButton GetPause(){return Pause;}
/**
 * this function return the button stop
 * @return the stop button 
 */
public JButton GetStop(){return Stop;}
/**
 * this function return the button nexttrack
 * @return the nexttrack button 
 */
public JButton GetNextTrack(){return NextTrack;}
/**
 * this function return the button pretrack
 * @return the pretrack button 
 */
public JButton GetPreTrack(){return PreTrack;}
/**
 * this function return the button vol_up
 * @return the vol_up button 
 */
public JButton Getvol(){return vol;}
/**
 * this function return the button vol_d
 * @return the vol_d button 
 */
public JButton Getvol2(){return vol2;}
}