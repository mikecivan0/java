package edunova;

public class Zadaci2106 {

	public static void main(String[] args) {

		// zadatak 1
		// pomoæu while petlje ispisati sve parne brojeve
		// od 3 do 22
		// osim 8 i 10 koje ne treba ispisati

		int i = 3;

		while (i <= 22) {

			if (i % 2 == 0 && i != 8 && i != 22) {
				System.out.println(i);
			}

			i++;
		}

		
		
		
		// zadatak 2
		// s pomoæu do while zbrojiti prvih 100 brojeva
		// ispisati rezultat

		int j = 1, zbroj = 0;

		do {
			zbroj += j++;
		} while (j <= 100);

		System.out.println(zbroj);

		
		
		
		// zadatak 3
		// ulaz u program je niz znakova koj isadrži
		// imena gradova razdvojeno zarezom
		// program ispisuje naziv grada koji
		// u sebi ima najmanje znakova

		// primjer: "Osijek,Zagrab,Varaždin,Sinj,Donji Miholjac"

		String ulaz = "Osijek, Zagrab, Varaždin, Sinj, Donji Miholjac";
		String[] gradovi = ulaz.split(",");

		int najmanji = Integer.MAX_VALUE;
		int index = 0, duzinaImena = 0;
		

		for (int k = 0; k < gradovi.length; k++) {
			
			duzinaImena = gradovi[k].trim().length();
			
			if (duzinaImena < najmanji) {
				najmanji = duzinaImena;
				index = k;
			}
		}

		for (String grad : gradovi) {
			if (grad.trim().length() == najmanji) {
				System.out.println(grad.trim());
			}
		}

		
		
		
		// zadatak 4
		// ulaz je ime i prezime
		// izlaz je email adresa u edunovi sa prvim slovom imena + prezime

		String ime = "Ivan Mikec";
		String[] imeIprezime = ime.split(" ");
		String email = "";

		email = imeIprezime[0].substring(0, 1).toLowerCase() + imeIprezime[1].toLowerCase();
		System.out.println(email + "@edunova.hr");
		
		
		
		
		// zadatak 5
		// ulaz je ime i prezime
		// izlaz je email adresa u edunovi sa cijelim imenom i prezimenom
		
		String ime2 = "Ivan Mikec";
		String[] imeIprezime2 = ime2.split(" ");
		String domena = "@edunova.hr";
		String email2 = "";

		for(String ip: imeIprezime2) {
			email2 += ip.toLowerCase();
		}
		
		email2 +=domena;
		System.out.println(email2);

	}

}
