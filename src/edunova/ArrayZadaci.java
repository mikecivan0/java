package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayZadaci {

	public static void main(String[] args) {

		// zadatak 1
		// program uèitava broj od korisnika
		// kreira se int array sa onoliko elemenata koji je broj korisnik unio
		// za svaki element korisnik treba unijeti vrijednost
		// ako je broj elemenata niza paran, program ispisuje dvije vrijednosti
		// koje se nalaze u sredini niza
		// ako je broj elemenata niza neparan, program ispisuje jednu vrijednost
		// koja se nalazi u sredini niza
		// ima se max 5 pokušaja

		int pozicijaZaPrikaz, brojElemenataNiza1 = 0, moguciPokusaji1 = 5, preostaliPokusaji1 = 5;		

			for (int i=moguciPokusaji1;i>0;i--) {
				
				brojElemenataNiza1 = Integer.parseInt(JOptionPane
						.showInputDialog("Program æe kreirati niz.\n" + "Koliko želiš da niz ima elemenata?\n"
								+ "Unesi broj, a zatim za svaki element niza unesi vrijednost.\n"
								+ "(Oprez! Što veæi broj elemenata postaviš - više æeš vrijednosti morati unijeti)\n"
								+ "Imaš " + i + "/" + moguciPokusaji1 + " pokušaja!"));
				if (brojElemenataNiza1>0) {
					break;
				}else {
					--preostaliPokusaji1;
				}
				
				if(i>1) {
					JOptionPane.showInternalMessageDialog(null, "Molim, unesi broj veæi od 1");					
				}
				
			}
			
			if(preostaliPokusaji1>0) {
				int niz1[] = new int[brojElemenataNiza1];

				for (int i = 0; i < brojElemenataNiza1; i++) {
					niz1[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Unesi vijednost za " + (i + 1) + ". element niza"));
				}

				pozicijaZaPrikaz = (brojElemenataNiza1 / 2);

				System.out.println("Cijeli niz od " + niz1.length + " elemenata izgleda ovako " + Arrays.toString(niz1));

				if (brojElemenataNiza1 % 2 == 0) {
					System.out.println("Vriejdnosti elemenata u sredini niza su " + niz1[(pozicijaZaPrikaz-1)] + " i "
							+ niz1[pozicijaZaPrikaz]);
				} else {
					System.out.println("Vrijednost elementa u sredini niza je " + niz1[pozicijaZaPrikaz]);
				}
			}else {
				JOptionPane.showInternalMessageDialog(null, "Ispucao si sve pokušaje. Vidimo se opet drugi puta!");
			}
		
	}
}
