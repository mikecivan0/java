package edunova;

import javax.swing.JOptionPane;

public class IgraTrazenjaBroja {

	public static void main(String[] args) {
		
		// ovo je igra za dva igra�a
		// prvi igra� unosi broj izme�i 1 i 100
		// drugi igra� poku�ava pogoditi une�eni broj
				
		int trazeniBroj, brojDrugogIgraca;
		
		JOptionPane.showInternalMessageDialog(null, "Prvi igra� unosi broj izme�u 1 i 100.\n"
													+ "Drugi igra� �e poku�ati pogodi taj broj. ");
				
		for(;;) {
			trazeniBroj = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izme�u 1 i 100 koji �e drugi igra� poku�ati pogoditi")
					);
					
			if(trazeniBroj>=1 && trazeniBroj<=100) {
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Broj mora biti izme�u 1 i 100, uklju�uju�i te brojeve");
		}
			
		JOptionPane.showInternalMessageDialog(null, "Sada je red na drugog igra�a");
		
		for(;;) {
			brojDrugogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj izme�u 1 i 100. Poku�aj pogoditi koji se broj tra�i")
					);
			
			if(brojDrugogIgraca==trazeniBroj) {
				break;
			}else {
				if(brojDrugogIgraca<trazeniBroj) {
					JOptionPane.showInternalMessageDialog(null, "Tra�eni broj je ve�i od " + brojDrugogIgraca);
				}else {
					JOptionPane.showInternalMessageDialog(null, "Tra�eni broj je manji od " + brojDrugogIgraca);
				}
			}
			
					
		}
				
		JOptionPane.showInternalMessageDialog(null, "Bravo! Tra�eni broj je " + trazeniBroj);

	}

}
