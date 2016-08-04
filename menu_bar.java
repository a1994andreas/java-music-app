package Gen_Grafs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import org.jfugue.Player;

import GRAFICS.algorithmicMMC;
import GRAFICS.atonalCompMMC;
import GRAFICS.atonalRowMMC;
import GRAFICS.freeMMC;
import MMC.Free;
	/**
   * this class extends jframe and implements actionlistener
   * and create the menu bar  for the editor
   * @author 3076,3031
   *
   */
public class menu_bar extends JFrame implements ActionListener {
	private JMenuBar menubar;
	private JMenu menu1,menu2,menu3;
	private JMenuItem composition1,composition2,composition3,composition4,composition5,composition6,composition7,composition8,composition9,composition10,composition11; 
    private static JMenuItem instrument1,instrument2,instrument3,instrument4,instrument5,instrument6; 
    private static JMenuItem help;
    private static Free dd = new Free();
    private Scanner x;
    private Formatter l;
    private Free oo = new Free();
    /**
     * constructs the menu bar and adds all the menu , the munu items and sets the name of the items
     * @param mode 
     */
    public menu_bar(String mode){
    	menubar=new JMenuBar();
        menu1 = new JMenu("Composition");
        menu1.addActionListener(this );
        menubar.add(menu1);
        menu2 = new JMenu("Instruments");
        menu2.addActionListener(this );
        menubar.add(menu2);
        menu3 = new JMenu("Help");
        menu3.addActionListener(this );
        menubar.add(menu3);
        
        composition1 = new JMenuItem("Open");
        composition1.addActionListener(this );
        menu1.add(composition1);
        
        composition2 = new JMenu("New");
        composition2.addActionListener(this );
        menu1.add(composition2);
        
        composition7 = new JMenuItem("Free");
        composition7.addActionListener(this );
        composition2.add(composition7);
        
        composition8 = new JMenuItem("Algorithmic");
        composition8.addActionListener(this );
        composition2.add(composition8);
        
        composition9 = new JMenu("Atonal");
        composition9.addActionListener(this );
        composition2.add(composition9);
        
        composition10 = new JMenuItem("Atonal Row");
        composition10.addActionListener(this );
        composition9.add(composition10);
        
        composition11 = new JMenuItem("Atonal Composition");
        composition11.addActionListener(this );
        composition9.add(composition11);
        
        composition3 = new JMenuItem("Save");
        composition3.addActionListener(this );
        menu1.add(composition3);
        
        composition4 = new JMenuItem("Save as...");
        composition4.addActionListener(this );
        menu1.add(composition4);
        
        composition5 = new JMenuItem("Export");
        composition5.addActionListener(this );
        menu1.add(composition5);
        
        composition6 = new JMenuItem("Exit");
        composition6.addActionListener(this );
        menu1.add(composition6);
        
        instrument1 = new JMenuItem("Piano");
        instrument1.addActionListener(this );
        menu2.add(instrument1);
    
        instrument2 = new JMenuItem("Guitar");
        instrument2.addActionListener(this );
        menu2.add(instrument2);

        instrument3 = new JMenuItem("Flute");
        instrument3.addActionListener(this );
        menu2.add(instrument3);
        
        instrument4 = new JMenu("More...");
        instrument4.addActionListener(this );
        menu2.add(instrument4);
        
        instrument5 = new JMenuItem("Violin");
        instrument5.addActionListener(this );
        instrument4.add(instrument5);
        
        instrument6 = new JMenuItem("GunShot");
        instrument6.addActionListener(this );
        instrument4.add(instrument6);
        
        help = new JMenuItem("About");
        help.addActionListener(this );
        menu3.add(help);
    }
    
    /**
     * this function return the menu witch created by the constructor
     * @return the menu bar
     */
    public JMenuBar getMenubar(){return menubar;}
    /**
     * this function sets the action when you ckick on the items of the menu
     */
    public void actionPerformed(ActionEvent E){
    	
        if(E.getSource() == composition1){
            JFileChooser F = new JFileChooser(".");
            F.showOpenDialog(null);
            try {
            	x =new Scanner (F.getSelectedFile());
            } catch (Exception e) {
            	System.out.println("not found");
            }
            String boh8="";
            while(x.hasNext()){
        	   boh8+=x.nextLine();
            }
            dd.setNotes("");
            dd.AddNotes(boh8);
         }
        
        if(E.getSource() == composition3){
        	
        	try {
				l= new Formatter("bb.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
        	l.format(dd.getNotes());
        	l.close();
        }
        if(E.getSource() == composition5){
        	Player player = new Player();
            try {
				player.saveMidi(dd.getNotes(), new File("C://test.mid"));
			} catch (IOException e) {
				e.printStackTrace();
			}	
        }
        if (E.getSource()== composition4){
        	JFileChooser chooser = new JFileChooser();

        	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
        	chooser.showSaveDialog(null);

        	String path = chooser.getSelectedFile().getAbsolutePath();

        	PrintWriter file;
			try {
				file = new PrintWriter(new File(path+".txt"));

	            file.write(dd.getNotes());
	            file.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
        if(E.getSource() == composition7){
        	dd.setNotes("");
        	dd.setInturment("I[Piano] ");
        	freeMMC a = new freeMMC();
        }
        if(E.getSource() == composition8){
        	dd.setNotes("");
        	dd.setInturment("I[Piano] ");
        	algorithmicMMC a = new algorithmicMMC();
        }
        if(E.getSource() == composition10){
        	dd.setNotes("");
        	dd.setInturment("I[Piano] ");
        	atonalRowMMC a = new atonalRowMMC();
        }      
        if(E.getSource() == composition11){
        	dd.setNotes("");
        	dd.setInturment("I[Piano] ");
        	atonalCompMMC a = new atonalCompMMC();
        }
        if(E.getSource() == composition6){
            System.exit(0);
        }
        if(E.getSource() == instrument1){dd.setInturment("I[Piano] "); dd.AddNotes("I[Piano] ");}
    	if(E.getSource() == instrument2){dd.setInturment("I[Guitar] "); dd.AddNotes("I[Guitar] ");}
    	if(E.getSource() == instrument3){dd.setInturment("I[Flute] "); dd.AddNotes("I[Flute] ");}
    	if(E.getSource() == instrument5){dd.setInturment("I[Violin] "); dd.AddNotes("I[Violin] ");}
    	if(E.getSource() == instrument6){dd.setInturment("I[Gunshot] "); dd.AddNotes("I[Gunshot] ");}
    	
        
    }

}
 