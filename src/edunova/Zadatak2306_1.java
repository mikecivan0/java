package edunova;

public class Zadatak2306_1 {
	// kreirati metodu tipa int suma
	// koja prima niz cijelih brojeva
	// metoda vraæa sumu svih brojeva u nizu

	// metodu pozvati iz main metode

	public static void main(String[] args) {
		Integer[] niz = { 5, 3, 8, 5, 4, 7, 5, 8, 9 };

		System.out.println(suma(niz));
	}

	private static int suma(Integer[] niz) {
		int suma = 0;

		for (int broj : niz) {
			suma += broj;
		}
		return suma;
	}
}
