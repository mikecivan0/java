package edunova;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {
		// zadatak 1
		// deklarirajte varijablu za pohranu tjelesne
		// temperature �ovjeka kao int i dodjelite
		// vrijednost 36

		int tjelesnaTemperatura = 36;
		System.out.println(tjelesnaTemperatura);

		// zadatak 2
		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite
		// vrijednost -9. Ispi�ite deklariranu vrijednost

		int temperaturaMjesta = -9;
		System.out.println(temperaturaMjesta);

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
		
		//samostalni zadatak 1
		//korisnik unosi cijenu jabuka
		//nakon toga korisnik unosi koli�inu kupljenih jabuka
		//program ispisuje iznos za naplatu podijeljen na kune i lipe
		//lipe se zaokru�uju na vrijednost bli�u nuli
		
		float cijena, kolicina, iznos;
		
		cijena = Float.parseFloat(
				JOptionPane.showInputDialog("Unesite cijenu kilograma jabuka.\nNpr. 4.45")
				);
		
		kolicina = Float.parseFloat(
				JOptionPane.showInputDialog("Unesite koli�inu.\nNpr. 1.564")
				);
		
		iznos = cijena*kolicina;
		
		int iznosZaDijeljenjeNaKuneILipe = (int) (iznos*100);
		int kuna = iznosZaDijeljenjeNaKuneILipe/100;
		int lipa = iznosZaDijeljenjeNaKuneILipe%100;
	
		System.out.println("Iznos za naplatu " + kolicina + " kg jabuka\npo cijeni od " +
						cijena + " kn/kg je\n" + kuna + " kuna i " + lipa + " lipa");

		//samostalni zadatak 2
		//od korisnika se tra�i da unese svoje ime
		//program ga pozdravlja navode�i upisano ime
		//korisnik upisuje svoje godine
		//program mu daje odgovor
		
		String ime = JOptionPane.showInputDialog("Molim upi�i svoje ime");
		
		int godine = Integer.parseInt(
				JOptionPane.showInputDialog(ime + 
						" je jako lijepo ime. A koliko godina ima�?")
				);
		JOptionPane.showInternalMessageDialog(null, "Kada osoba ima " + godine + 
				" to je super doba �ivota, "
				+ "ali kada napuni� " + (godine+1) + " bit �e jo� bolje.\nPozdrav!");

		// samostalni zadatak 2
		// korisnik upisuje broj
		// program daje informaciju je li broj paran ili ne

		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upi�i broj"));

		String poruka = (broj2 % 2 == 0) ? "Broj je paran" : "Broj je neparan";
		
		JOptionPane.showInternalMessageDialog(null, poruka);

		// samostalni zadatak 3
		// korisnik upisuje prvi a zatim i drugi broj
		// korisnik upisuje �eli li da se ta dva broja zbroje,
		// oduzmu, podijele ili pomno�e
		// program daje rezultat		

		float rezultat = 0;
		float brojJedan3 = Float.parseFloat(JOptionPane.showInputDialog("Upi�i prvi broj"));
		float brojDva3 = Float.parseFloat(JOptionPane.showInputDialog("Upi�i drugi broj"));

		String operator = JOptionPane
				.showInputDialog("Unesi +, -, * ili /, ovisno �to " 
								+ "�eli� da se primjeni na ta dva broja");

		switch (operator) {

		case "+":
			rezultat = brojJedan3 + brojDva3;
			break;

		case "-":
			rezultat = brojJedan3 - brojDva3;
			break;

		case "*":
			rezultat = brojJedan3 * brojDva3;
			break;

		case "/":
			rezultat = (brojJedan3 / brojDva3);
		}
		
		
		DecimalFormat df = new DecimalFormat("0.####");
		
		JOptionPane.showInternalMessageDialog(null, df.format(brojJedan3) + " " + operator 
				+ " " + df.format(brojDva3) + " = " + df.format(rezultat));

	}
}
