import javax.swing.*;

public class Faktorial{
	
	static int fak=1;
	static int n;
	static String nilai;

	public static void main(String args[]){
		nilai=JOptionPane.showInputDialog("Masukkan nilai faktorial?");
		n=Integer.parseInt(nilai);
		if(n!=0){
			for(int i=1;i<=n;i++){
				fak=fak*i;
			}
		}
		System.out.println(n+" Faktorial = "+fak);
	}
}	
