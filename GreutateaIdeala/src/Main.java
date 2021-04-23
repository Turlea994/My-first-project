import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		int a = 200;
	    int b = 190;		
	    int x = 180;
		int y = 170;
		int z = 160;
		
		
		int inaltime = Integer.parseInt(JOptionPane.showInputDialog("Introduceti inaltimea dvs: "));
        
		if(inaltime > a) {
		JOptionPane.showMessageDialog(null,"Momentan nu e disponibila greutatea ideala pentru o inaltime de peste 200 cm.");	
		}
		
		else if(inaltime >= b) {
		JOptionPane.showMessageDialog(null,"Greutatea dvs ideala este de 80 si 95 kg.");
		}
		
		else if(inaltime >= x) {
		JOptionPane.showMessageDialog(null,"Greutatea dvs ideala este cuprinsa intre 70 si 85 kg.");
		}
	
        else if(inaltime >= y) {
		JOptionPane.showMessageDialog(null,"Greutatea dvs ideala este de 60-75 kg.");
		}
		
		else if(inaltime >= z) {
		JOptionPane.showMessageDialog(null,"Greutatea dvs ideala este cuprinsa intre 55 si 70 kg.");
		}
		
		else if(inaltime < z) {
		JOptionPane.showMessageDialog(null,"Momentan nu e disponibila greutatea ideala pentru o inaltime sub 160 cm.");
		}
		
		
	}	
		
}
