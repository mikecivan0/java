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
 		
			
			// zadatak 2
			// korisnik unosi dva cijela broja koji æe definirati velièinu matrice
			// korisnik unosi vijednost za svaki element matrice
			// a èija je janveæa dopuštena vrijednost 9999
 			// matrica se ispisuje
			
			int x, y;
			
			JOptionPane.showInternalMessageDialog(null, "Ovaj program ispisuje matricu.\n"
					+ "Trebaš upisati koliko æe redova imati matrica,\n"
					+ "i koliko æe elemenata biti u svakome redu.\n"
					+ "Za svaki element æeš trebati unijeti vrijednost manju od 10000");
			
			for(;;) {
				x = Integer.parseInt(
						JOptionPane.showInputDialog("Koliko redova æe imati matrica?")
					);
				if(x>0) {
					break;
				}
				
				JOptionPane.showInternalMessageDialog(null, "Unesi broj veæi o 0 za definiranje broja redova");
			}
			
			
			for(;;) {
				y = Integer.parseInt(
						JOptionPane.showInputDialog("Koliko elemenata æe biti u svakom redu?")
					);
				if(y>0) {
					break;
				}
				
				JOptionPane.showInternalMessageDialog(null, "Unesi broj veæi o 0 za definiranje broja elemenata u redu");
			}
			
			int niz[][] = new int[x][y];
			
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					for(;;) {
						niz[i][j] = Integer.parseInt(
								JOptionPane.showInputDialog("Unesi vrijednost za " + (j+1) + ". element u " + (i+1) + ". redu.\n"
										+ "Najveæa dopuštena vriejdnost je 9999")
							);
						
						if(niz[i][j]<=9999) {
							break;
						}
						
						JOptionPane.showInternalMessageDialog(null, "Unesi broj manji od 10000");
					}
					
				}
			}
			
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					if(niz[i][j]<10000 && niz[i][j]>999) {
						System.out.print(niz[i][j] + " ");
					}else if(niz[i][j]<1000 && niz[i][j]>99){
						System.out.print(niz[i][j] + "  ");
					}else if(niz[i][j]<100 && niz[i][j]>9){
						System.out.print(niz[i][j] + "   ");
					}else{
						System.out.print(niz[i][j] + "    ");
					}					
				}
				System.out.println();
			}
			
			
			
			// korisnik unosi 10 brojeva koji se spremaju u niz
			// korisnik zatim unosi 1 ako želi ispis neparnih brojeva
			// ili unosi 2 ako želi ispis parnih brojeva
			
			int niz2[] = new int[10];
			int filter = 1;
			
			for(int i=0;i<niz2.length;i++) {
				niz2[i] = Integer.parseInt(
						JOptionPane.showInputDialog("Unesi " + (i+1) + ". broj")
						);
			}
			
			for(;;) {
				
				filter = Integer.parseInt(
						JOptionPane.showInputDialog("Unesi 1 za prikaz unešenih neparnih brojeva, ili 2 za prikaz unešenih parnih brojeva")
						);
				
				
				if(filter==1 || filter==2) {
					break;
				}
				
				JOptionPane.showInternalMessageDialog(null, "Nevaljani unos");
			}
			
			if(filter==1) {
				System.out.println("Unešeni neparni brojevi su");
				for(int i=0;i<niz2.length;i++) {
					if(niz2[i]%2!=0) {
						System.out.print(niz2[i] + " ");
					}
				}
			}else if(filter==2) {
				System.out.println("Unešeni parni brojevi su");
				for(int i=0;i<niz2.length;i++) {
					if(niz2[i]%2==0) {
						System.out.print(niz2[i] + " ");
					}
				}
			}
			
			
	}
}
