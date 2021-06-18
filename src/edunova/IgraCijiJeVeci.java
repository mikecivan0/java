package edunova;

import javax.swing.JOptionPane;

public class IgraCijiJeVeci {

	public static void main(String[] args) {
		
		// igra za dva igraèa
		// svatko od igraèa unosi broj
		// program javlja koji igraè je unio najveæi broj
		// ukoliko je neriješeno onda se igra ponavlja
		
		int brojPrvogIgraca, brojDrugogIgraca;
		
		for(;;) {
			brojPrvogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Prvi igraè unosi broj")
					);
			
			brojDrugogIgraca = Integer.parseInt(
					JOptionPane.showInputDialog("Drugi igraè unosi broj")
					);
			
			if(brojPrvogIgraca>brojDrugogIgraca) {
				JOptionPane.showInternalMessageDialog(null, "Broj prvog igraèa "
						+ "(" + brojPrvogIgraca + ") je veæi od "
						+ "broja drugog igraèa (" + brojDrugogIgraca + ")");
				break;
			}else if(brojDrugogIgraca>brojPrvogIgraca) {
				JOptionPane.showInternalMessageDialog(null, "Broj drugog igraèa "
						+ "(" + brojDrugogIgraca + ") je veæi od "
						+ "broja prvog igraèa (" + brojPrvogIgraca + ")");
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Rezultat je neriješen. Igra se ponovo");
		}

	}

}
