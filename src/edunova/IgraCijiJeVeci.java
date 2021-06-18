package edunova;

import javax.swing.JOptionPane;

public class IgraCijiJeVeci {

	public static void main(String[] args) {
		
		// igra za dva igra�a
		// svatko od igra�a unosi broj
		// program javlja koji igra� je unio najve�i broj
		// ukoliko je nerije�eno onda se igra ponavlja
		
		int brojPrvogIgraca, brojDrugogIgraca;
		
		for(;;) {
			brojPrvogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Prvi igra� unosi broj")
					);
			
			brojDrugogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Drugi igra� unosi broj")
					);
			
			if(brojPrvogIgraca>brojDrugogIgraca) {
				JOptionPane.showInternalMessageDialog(null, "Broj prvog igra�a "
						+ "(" + brojPrvogIgraca + ") je ve�i od "
						+ "broja drugog igra�a (" + brojDrugogIgraca + ")");
				break;
			}else if(brojDrugogIgraca>brojPrvogIgraca) {
				JOptionPane.showInternalMessageDialog(null, "Broj drugog igra�a "
						+ "(" + brojDrugogIgraca + ") je ve�i od "
						+ "broja prvog igra�a (" + brojPrvogIgraca + ")");
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Rezultat je nerije�en. Igra se ponovo");
		}

	}

}
