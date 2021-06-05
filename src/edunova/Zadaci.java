package edunova;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {
		// zadatak 1
		// deklarirajte varijablu za pohranu tjelesne
		// temperature èovjeka kao int i dodjelite
		// vrijednost 36

		int tjelesnaTemperatura = 36;
		System.out.println(tjelesnaTemperatura);

		// zadatak 2
		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite
		// vrijednost -9. Ispišite deklariranu vrijednost

		int temperaturaMjesta = -9;
		System.out.println(temperaturaMjesta);

		// zadakat3
		// Korisnik uèitava dva cijela broja
		// prpgram ispisuje njivog zbroj

		int prviBroj, drugiBroj, zbroj;

		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Upišite prvi broj"));

		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Upišite drugi broj"));

		zbroj = prviBroj + drugiBroj;

		System.out.println("Zbroj upisanih brojeva je " + zbroj);

		// zadatak 4
		// Program od korisnika uèitava tri broja
		// program ispisuje zbroj prvog i treæeg
		// podjeljen s drugim unesenim brojem

		int brojJedan, brojDva, brojTri;

		brojJedan = Integer.parseInt(JOptionPane.showInputDialog("Upišite prvi broj"));

		brojDva = Integer.parseInt(JOptionPane.showInputDialog("Upišite drugi broj"));

		brojTri = Integer.parseInt(JOptionPane.showInputDialog("Upišite treæi broj"));

		float zbroj2 = (float) (brojJedan + brojTri) / brojDva;

		System.out.println("Zbroj prvog i treæeg broja podijeljen sa drugim brojem je " + zbroj2);

		// zadatak 5
		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku
		
		int broj;
		
		broj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite dvoznamenkasti broj")
				);
		
		System.out.println("Prva znamenka unešenog broja je " + (broj/10));
		
		//samostalni zadatak 1
		//korisnik unosi cijenu jabuka
		//nakon toga korisnik unosi kolièinu kupljenih jabuka
		//program ispisuje iznos za naplatu podijeljen na kune i lipe
		//lipe se zaokružuju na vrijednost bližu nuli
		
		float cijena, kolicina, iznos;
		
		cijena = Float.parseFloat(
				JOptionPane.showInputDialog("Unesite cijenu kilograma jabuka.\nNpr. 4.45")
				);
		
		kolicina = Float.parseFloat(
				JOptionPane.showInputDialog("Unesite kolièinu.\nNpr. 1.564")
				);
		
		iznos = cijena*kolicina;
		
		int iznosZaDijeljenjeNaKuneILipe = (int) (iznos*100);
		int kuna = iznosZaDijeljenjeNaKuneILipe/100;
		int lipa = iznosZaDijeljenjeNaKuneILipe%100;
	
		System.out.println("Iznos za naplatu " + kolicina + " kg jabuka\npo cijeni od " +
						cijena + " kn/kg je\n" + kuna + " kuna i " + lipa + " lipa");

		//samostalni zadatak 2
		//od korisnika se traži da unese svoje ime
		//program ga pozdravlja navodeæi upisano ime
		//korisnik upisuje svoje godine
		//program mu daje odgovor
		
		String ime = JOptionPane.showInputDialog("Molim upiši svoje ime");
		
		int godine = Integer.parseInt(
				JOptionPane.showInputDialog(ime + 
						" je jako lijepo ime. A koliko godina imaš?")
				);
		JOptionPane.showInternalMessageDialog(null, "Kada osoba ima " + godine + 
				" to je super doba života, "
				+ "ali kada napuniš " + (godine+1) + " bit æe još bolje.\nPozdrav!");

		// samostalni zadatak 2
		// korisnik upisuje broj
		// program daje informaciju je li broj paran ili ne

		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		String poruka = (broj2 % 2 == 0) ? "Broj je paran" : "Broj je neparan";
		
		JOptionPane.showInternalMessageDialog(null, poruka);

		// samostalni zadatak 3
		// korisnik upisuje prvi a zatim i drugi broj
		// korisnik upisuje želi li da se ta dva broja zbroje,
		// oduzmu, podijele ili pomnože
		// program daje rezultat		

		float rezultat = 0;
		float brojJedan3 = Float.parseFloat(JOptionPane.showInputDialog("Upiši prvi broj"));
		float brojDva3 = Float.parseFloat(JOptionPane.showInputDialog("Upiši drugi broj"));

		String operator = JOptionPane
				.showInputDialog("Unesi +, -, * ili /, ovisno što " 
								+ "želiš da se primjeni na ta dva broja");

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
