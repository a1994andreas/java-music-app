package Player;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * this class implements actionlistener
 * and create the menu bar for the player
 * @author 3076,3031
 *
 */
public class Menu implements ActionListener {
	private JMenuBar menubar = new JMenuBar();
	private JMenuItem collection1 = new JMenuItem("New Collection");
	private JMenuItem collection2 = new JMenuItem("Add File");
	private JMenuItem collection3 = new JMenuItem("Add Folder");
	private JMenuItem collection4 = new JMenuItem("Open");
	private JMenuItem collection5 = new JMenuItem("Save");
	private JMenuItem collection6 = new JMenuItem("Exit");
	private JMenuItem playback1 = new JMenuItem("In A Row");
	private JMenuItem playback2 = new JMenuItem("Random Order");
	private JMenuItem playback3 = new JMenuItem("Repeat Track");
	private JMenuItem playback4 = new JMenuItem("Repeat List");
	private JMenuItem Help1 = new JMenuItem("About");
	private mainclass a = new mainclass();
	private JFrame neo = new JFrame("aaa");
	private JFrame helpn;
	private Formatter x;
	private Scanner ee;
	/**
	 *  constructs the menu bar and adds all the menu , the munu items and
	 *   sets the name of the items
	 */
	public Menu(){
		JMenu menu1 = new JMenu("Collection");
		menu1.setVisible(true);
		menu1.add(collection1);
		menu1.add(collection2);
		menu1.add(collection3);
		menu1.add(collection4);
		menu1.add(collection5);
		menu1.add(collection6);
		collection1.addActionListener(this);
		collection2.addActionListener(this);
		collection3.addActionListener(this);
		collection4.addActionListener(this);
		collection5.addActionListener(this);
		collection6.addActionListener(this);
		menubar.add(menu1);
		JMenu menu2 = new JMenu("Playback");
		menu2.add(playback1);
		menu2.add(playback2);
		menu2.add(playback3);
		menu2.add(playback4);
		playback1.addActionListener(this);
		playback2.addActionListener(this);
		playback3.addActionListener(this);
		playback4.addActionListener(this);
		menubar.add(menu2);
		JMenu menu3 = new JMenu("Help");
		menu3.add(Help1);
		Help1.addActionListener(this);
		menubar.add(menu3);
		menubar.setVisible(true);
		menubar.setEnabled(true);
	}
	/**
	 * this function return the menu bar of the player
	 * @return the menu bar of the player
	 */
	public JMenuBar getMenubar(){return menubar;}
	/**
	 * this function sets the action when you ckick on the items of the menu
	 */
	public void actionPerformed(ActionEvent E){
		if(E.getSource() == collection1){
			JFileChooser F = new JFileChooser(".");
			F.showOpenDialog(null);				
			try {
				neo.setLayout(null);
				Menu a = new Menu();
				neo.setJMenuBar(a.getMenubar());
				Buttons b = new Buttons();
				neo.add(b.GetPlay());
				neo.add(b.GetPause());
				neo.add(b.GetStop());
				neo.add(b.GetNextTrack());
				neo.add(b.GetPreTrack());
				AddJList d = new AddJList(F.getSelectedFile().getAbsolutePath());
				neo.add(d.getJscrollpane());
				
				neo.getContentPane().setBackground(Color.white);
			    neo.setSize(800 , 400);
				neo.setVisible(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
		if(E.getSource() == collection2){
			try{
			JFileChooser F = new JFileChooser(".");
			F.showOpenDialog(null);	
			Collection a = new Collection();
			a.setPrePath(a.GetPath());
			x = new Formatter("C://temp_file.txt");		
			ee = new Scanner(new File(a.GetPath()));
			System.out.println(a.GetPath());
			while(ee.hasNext()){
				x.format("%s ", ee.next());
			
			}
			x.format("%s", F.getSelectedFile().getAbsolutePath());
			x.close();
			ee.close();
			neo.setLayout(null);
			Menu ii = new Menu();
			neo.setJMenuBar(ii.getMenubar());
			Buttons b = new Buttons();
			neo.add(b.GetPlay());
			neo.add(b.GetPause());
			neo.add(b.GetStop());
			neo.add(b.GetNextTrack());
			neo.add(b.GetPreTrack());
			AddJList d = new AddJList("C://temp_file.txt");
			neo.add(d.getJscrollpane());
			
			neo.getContentPane().setBackground(Color.white);
		    neo.setSize(800 , 400);
			neo.setVisible(true);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(E.getSource() == collection3){
			JFileChooser fileChooser = new JFileChooser(".");
		    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			fileChooser.showOpenDialog(null);	
			Collection a = new Collection();
			a.setPrePath(a.GetPath());
			try {
				x = new Formatter("C://temp_file.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
			try {
				ee = new Scanner(new File(a.GetPath()));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(a.GetPath());
			while(ee.hasNext()){
				x.format("%s ", ee.next());
			
			}
			File folderDir = new File(fileChooser.getSelectedFile().getAbsolutePath()); 
			File[] listOfFiles = folderDir.listFiles(); 
			for (int i = 0; i < listOfFiles.length; i++) { 
				if (listOfFiles[i].isFile()) { 
					x.format("%s ", listOfFiles[i]);
				}
				}
			
			try {
				x.close();
				ee.close();
				neo.setLayout(null);
				Menu ii = new Menu();
				neo.setJMenuBar(ii.getMenubar());
				Buttons b = new Buttons();
				neo.add(b.GetPlay());
				neo.add(b.GetPause());
				neo.add(b.GetStop());
				neo.add(b.GetNextTrack());
				neo.add(b.GetPreTrack());
				AddJList d;
				d = new AddJList("C://temp_file.txt");
				neo.add(d.getJscrollpane());
				
				neo.getContentPane().setBackground(Color.white);
			    neo.setSize(800 , 400);
				neo.setVisible(true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		if(E.getSource() == collection5){
			try {
				Collection a = new Collection();
				x = new Formatter(a.getPrePath());
				ee = new Scanner(new File("C://temp_file.txt"));
				while(ee.hasNext()){
					x.format("%s ", ee.next());
				}
				x.close();
				ee.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		if(E.getSource() == collection6){
			System.exit(0);
		}
		if(E.getSource() == playback1){
			Collection a = new Collection();
			a.Setplayback("InARow");
		}
		if(E.getSource() == playback2){
			Collection a = new Collection();
			a.Setplayback("RandomOrder");
		}
		if(E.getSource() == playback3){
			Collection a = new Collection();
			a.Setplayback("RepeatTrack");
		}
		if(E.getSource() == playback4){
			Collection a = new Collection();
			a.Setplayback("RepeatList");
		}
		if(E.getSource() == Help1){
			 helpn= new JFrame();
	   		 helpn.setTitle("help");
	   		 helpn.setLocation(200, 100);
	   		 helpn.setSize(450, 150);
	   		 helpn.setVisible(true);
	   		 JLabel label1 = new JLabel();
	   		 label1.setText("Athanasaki Vaggeliw 3076, Paravoliashs Andreas 3031");
	   		 label1.setFont(new Font("Serif", Font.PLAIN, 16));
	   		 helpn.add(label1);
			
		}
	}
}
