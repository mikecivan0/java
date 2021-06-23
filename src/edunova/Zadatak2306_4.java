package edunova;

public class Zadatak2306_4 {
	// kreirajte metodu aritmetickaSredina tipa float
	// metoda prima niz cijelih brojeva
	// petoda vraæa arit. sredinu svih primljenih brojeva

	private static float aritmetickaSredina(int[] niz) {
		int zbroj = 0;

		for (int i = 0; i < niz.length; i++) {
			zbroj += niz[i];
		}

		return (float) zbroj / niz.length;
	}

	public static void main(String[] args) {

		int[] pocetniNiz = { 5, 4, 2, 5, 8, 3, 5, 42 };
		System.out.println(aritmetickaSredina(pocetniNiz));
	}
}
