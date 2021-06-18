package edunova;

import javax.swing.JOptionPane;

public class IgraTrazenjaBroja {

	public static void main(String[] args) {
		
		// ovo je igra za dva igraèa
		// prvi igraè unosi broj izmeði 1 i 100
		// drugi igraè pokušava pogoditi unešeni broj
				
		int trazeniBroj, brojDrugogIgraca;
		
		JOptionPane.showInternalMessageDialog(null, "Prvi igraè unosi broj izmeðu 1 i 100.\n"
													+ "Drugi igraè æe pokušati pogodi taj broj. ");
				
		for(;;) {
			trazeniBroj = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izmeðu 1 i 100 koji æe drugi igraè pokušati pogoditi")
					);
					
			if(trazeniBroj>=1 && trazeniBroj<=100) {
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Broj mora biti izmeðu 1 i 100, ukljuèujuæi te brojeve");
		}
			
		JOptionPane.showInternalMessageDialog(null, "Sada je red na drugog igraèa");
		
		for(;;) {
			brojDrugogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izmeðu 1 i 100. Pokušaj pogoditi koji se broj traži")
					);
			
			if(brojDrugogIgraca==trazeniBroj) {
				break;
			}else {
				if(brojDrugogIgraca<trazeniBroj) {
					JOptionPane.showInternalMessageDialog(null, "Traženi broj je veæi od " + brojDrugogIgraca);
				}else {
					JOptionPane.showInternalMessageDialog(null, "Traženi broj je manji od " + brojDrugogIgraca);
				}
			}
			
					
		}
				
		JOptionPane.showInternalMessageDialog(null, "Bravo! Traženi broj je " + trazeniBroj);

	}

}
