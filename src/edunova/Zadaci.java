package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {
		// zadatak 1
		// deklarirajte varijablu za pohranu tjelesne
		// temperature �ovjeka kao int i dodjelite
		// vrijednost 36

		int tjelesnaTemperatura = 36;

		// zadatak 2
		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite
		// vrijednost -9. Ispi�ite deklariranu vrijednost

		int temperaturaMjesta = -9;

		// zadakat3
		// Korisnik u�itava dva cijela broja
		// prpgram ispisuje njivog zbroj

		int prviBroj, drugiBroj, zbroj;

		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite prvi broj"));

		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite drugi broj"));

		zbroj = prviBroj + drugiBroj;

		System.out.println("Zbroj upisanih brojeva je " + zbroj);

		// zadatak 4
		// Program od korisnika u�itava tri broja
		// program ispisuje zbroj prvog i tre�eg
		// podjeljen s drugim unesenim brojem

		int brojJedan, brojDva, brojTri;

		brojJedan = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite prvi broj"));

		brojDva = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite drugi broj"));

		brojTri = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite tre�i broj"));

		float zbroj2 = (float) (brojJedan + brojTri) / brojDva;

		System.out.println("Zbroj prvog i tre�eg broja podijeljen sa drugim brojem je " + zbroj2);

		// zadatak 5
		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku
		
		int broj;
		
		broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite dvoznamenkasti broj")
				);
		
		System.out.println("Prva znamenka une�enog broja je " + (broj/10));
	}
}
