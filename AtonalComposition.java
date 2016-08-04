package MMC;
/**
 * this class extends the class atonal and implements the interface symmetry
 * @author andreas
 *
 */

public class AtonalComposition extends Atonal implements Symmetry {
	private static Free dd=new Free();
	private int j=0;
	/**
	 * This constructs an atonal composition without to spesified 
	 * any elements
	 */
	public AtonalComposition(){}
	/**
	 * this constructs an atonal composition and specified the composition's name
	 * @param comp_name the composition's name
	 */
	public AtonalComposition(String comp_name){
		this.comp_name=comp_name;
	}
	/**
	 * this constructs an atonal composition and specified the composition's name and 
	 * the composer's name
	 * @param comp_name the composition's name
	 * @param composer the composer's name
	 */
	public AtonalComposition(String comp_name,String composer){
		this.comp_name=comp_name;
		this.composer=composer;
	}
	/**
	 * lets the existing String as it is.
	 */
	public void doNothing(String a){
		dd.AddNotes(a);
	}
	
	public int returnNumOfNote(String a) {
		if(a.equals("C"))return 0;
		if(a.equals("C#"))return 1;
		if(a.equals("D"))return 2;
		if(a.equals("D#"))return 3;
		if(a.equals("E"))return 4;
		if(a.equals("F"))return 5;
		if(a.equals("F#"))return 6;
		if(a.equals("G"))return 7;
		if(a.equals("G#"))return 8;
		if(a.equals("A"))return 9;
		if(a.equals("A#"))return 10;
		if(a.equals("B"))return 11;
		return -1;

	}
	public String returnNote(int i){
		if(i==0)return "C";
		if(i==1)return "C#";
		if(i==2)return "D";
		if(i==3)return "D#";
		if(i==4)return "E";
		if(i==5)return "F";
		if(i==6)return "F#";
		if(i==7)return "G";
		if(i==8)return "G#";
		if(i==9)return "A";
		if(i==10)return "A#";
		if(i==11)return "B";
		return "";
		}
	/**
	 * thinks of the notes as a polygon and reflects them according to a given integer that points to the top of the axis.
	 * @throws SymmetryActionOnNonValidAtonalRow 
	 */
	public void reflect(String a,int x) {
		String[] notes = new String[30];
		String[] organa = new String[30];
		for(int n=0 ; n<notes.length;n++){notes[n]="";}
		organa[0]="I[Piano]";
		for(int n=1 ; n<organa.length;n++){organa[n]="";}

		int metr_n =0 , metr_o=1;
		boolean el_n =true ,el_o=false;
		char[] w =a.toCharArray();
		for(int l=0 ;l<w.length;l++){
			
			if(w[l]=='I'){el_n=false; metr_n++; el_o=true;  }
			if(w[l]==']'){el_n=true; el_o=false; organa[metr_o]+="]"; metr_o++;}
			if(el_n && w[l]!=']')notes[metr_n]+=w[l];
			if(el_o)organa[metr_o]+=w[l];
		}
		String tel_apo="";
		for(int r=0 ; r<notes.length;r++){
			if(notes[r]!=""){
			System.out.println(notes[r]);
			String[] kk =notes[r].split(" ");
			String qq="";
			for(int m=0 ; m<kk.length ;m++){
				if(!kk[m].isEmpty()){
				//System.out.println(kk[m]);
				int ari;
				ari=((returnNumOfNote(kk[m])+6)%12);
				qq+=returnNote(ari)+" ";
				}
			}
			tel_apo+=organa[r]+" "+qq;
		
			}
		}
		dd.AddNotes(tel_apo);
	
	}
	/**
	 *  thinks of the notes as a polygon and transposes it clockwise according to a given integer.
	 */
	public void transpose(String a,int x)  {
	System.out.println("sdfsdf");
		String aa="I[piano] "+a;
		int p=0;
		this.j=x;
	
		String[] notes = aa.split(" ");
		String[] notes2= new String[notes.length + 1];
		for(int i=0; i<notes2.length;i++){notes2[i]=" ";}
		for(int i=0; i<notes.length; i++){
			if(j>=notes.length){
				notes2[i]=notes[p];
				p++;
				j++;
			}
			else{
			notes2[i]=notes[j];
			j++;
			}
		}
		
		for(int n=0 ; n<notes.length;n++){dd.AddNotes(notes2[n]+" ");}
	}
	
	
	private String antistrofh(String pin) {
		String[] anap =pin.split(" ");
		String b="";
		for(int k=anap.length-1;k>=0;k--){
			b+=anap[k]+" ";
		}
		return b;
	}
	
	
	/**
	 * retrogrades the String’s notes.
	 */
	public void retrograde(String a) {
		String[] notes = new String[30];
		String[] organa = new String[30];
		for(int n=0 ; n<notes.length;n++){notes[n]="";}
		organa[0]="I[Piano]";
		for(int n=1 ; n<organa.length;n++){organa[n]="";}

		int metr_n =0 , metr_o=1;
		boolean el_n =true ,el_o=false;
		char[] w =a.toCharArray();
		for(int l=0 ;l<w.length;l++){
			
			if(w[l]=='I'){el_n=false; metr_n++; el_o=true;  }
			if(w[l]==']'){el_n=true; el_o=false; organa[metr_o]+="]"; metr_o++;}
			if(el_n && w[l]!=']')notes[metr_n]+=w[l];
			if(el_o)organa[metr_o]+=w[l];
		}
		String apo="";
		for(int k=metr_n ; k>=0;k--){	
			apo+=organa[k]+" "+antistrofh(notes[k]);
		}
		dd.AddNotes(apo);
	}
	
	


}
