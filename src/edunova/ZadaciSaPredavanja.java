package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ZadaciSaPredavanja {

	public static void main(String[] args) {

		// zadatak 1
		// program unosi dva broja i prikazuje zbroj tih brojeva
		int prviBroj, drugiBroj;

		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		System.out.println(prviBroj + drugiBroj);

		
		
		// zadatak 2
		// program unosi dva broja i ispisuje veæi broj
		float prviBroj2, drugiBroj2;

		prviBroj2 = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
		drugiBroj2 = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));
		if (prviBroj2 > drugiBroj2) {
			System.out.println(prviBroj2);
		} else {
			System.out.println(drugiBroj2);
		}

		
		
		// zadatak 3
		// program ispisuje brojeve od 100 do 21 odvojene zarezom
		int a = 100;
		int b = 21;

		// verzija bez zareza na kraju ispisa
		System.out.print(a);
		for (int i = --a; i >= b; i--) {
			System.out.print(", " + i);
		}
		
		System.out.println();
		
		// verzija sa zarezom na kraju ispisa
		for (int i = --a; i >= b; i--) {
			System.out.print(i + ",");
		}
		
		
		
		// zadatak 4
		//program uèirava cijele brojeve od korisnika 
		//sve dok se ne uèita broj 0. Tada se program prekida
				
		int broj;
		for(;;) {
			broj = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj")
					);
			
			if(broj==0) {
				break;
			}
		}
		
		
		
		// zadatak 5
		//program unosi dva parna broja
		//program ispisuje njihov zbroj
		int a1, b1;
		
		for(;;) {
			a1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi parni broj"));
			if(a1%2==0) {
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Nije unešen prani broj");
		}
				
		for(;;) {
			b1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi parni broj"));
			if(b1%2==0) {
				break;
			}
			JOptionPane.showInternalMessageDialog(null, "Nije unešen prani broj");
		}
				
		System.out.println(a1+b1);
		
		
		
		
		// zadatak 6
		//unosi se 10 brojeva u niz i ispisuje sve komponente niza
		int niz[] = new int[10];

		for (int i = 0; i < 10; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i+1) + ". broj"));
		}

		System.out.println(Arrays.toString(niz));

		
		
		
		// zadatak 7
		//za uneseni broj x ispisite da li je prim broj
			
		int a2 = 27353;
		boolean primBroj = true;
		
		for(int i=2;i<(a2/2);i++) {
			
			if(a2%i==0) {
				primBroj = false;
				System.out.println("Broj " + a2 + " je cjelobrojno djeljiv sa " + i);
				break;
			}			
			
		}
				
		if(primBroj) {
			System.out.println("Broj " + a2 + " je prim broj");
		}else {
			System.out.println("Broj " + a2 + " nije prim broj");
		}
		
		
		
		
		// zadatak 8
		//Program ispisuje matricu 15 x 15
		//tako da je svaki element matrice broj 0
		
		int a3=5, b3=5;
		
		for(int i=1;i<=a3;i++) {
			for(int j=1;j<=b3;j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		
		
		
		
		// zadatak 9
		// program od korisnika unosi brojeve dok se ne unese 0
		// program ispisuje zbroj svih unešenih brojeva

		int broj2, zbroj = 0;

		for (;;) {
			broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

			if (broj2 == 0) {
				break;
			}

			zbroj += broj2;
		}

		System.out.println(zbroj);
		
		
		
		
		// zadatak 10
		//ispiši sve parne brojeve od 3 do 47
		
		for(int i = 3; i<=47; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		
		
		// zadatak 11
		// za dva dana broja ispišite decimalni dio rezultata
		// dijeljenja

		double a4 = 3, b4 = 2;
		double rez = a4/b4;
		
		int r = (int) rez;
		
		System.out.println(rez -r);
		
		
		
		
		// zadatak 12 
		// ispis stringa "Edunova", sa navodnicima
		System.out.println("\"Edunova\"");

	}

}
