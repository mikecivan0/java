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

		broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite dvoznamenkasti broj"));

		System.out.println("Prva znamenka unešenog broja je " + (broj / 10));

		// samoinicijativni zadatak 1
		// korisnik unosi cijenu jabuka
		// nakon toga korisnik unosi kolièinu kupljenih jabuka
		// program ispisuje iznos za naplatu podijeljen na kune i lipe
		// lipe se zaokružuju na vrijednost bližu nuli

		float cijena, kolicina, iznos;

		cijena = Float.parseFloat(JOptionPane.showInputDialog("Unesite cijenu kilograma jabuka.\nNpr. 4.45"));

		kolicina = Float.parseFloat(JOptionPane.showInputDialog("Unesite kolièinu.\nNpr. 1.564"));

		iznos = cijena * kolicina;

		int iznosZaDijeljenjeNaKuneILipe = (int) (iznos * 100);
		int kuna = iznosZaDijeljenjeNaKuneILipe / 100;
		int lipa = iznosZaDijeljenjeNaKuneILipe % 100;

		System.out.println("Iznos za naplatu " + kolicina + " kg jabuka\npo cijeni od " + cijena + " kn/kg je\n" + kuna
				+ " kuna i " + lipa + " lipa");

		// samoinicijativni zadatak 2
		// od korisnika se traži da unese svoje ime
		// program ga pozdravlja navodeæi upisano ime
		// korisnik upisuje svoje godine
		// program mu izbacuje poruku

		String ime = JOptionPane.showInputDialog("Molim upiši svoje ime");

		int godine = Integer.parseInt(JOptionPane.showInputDialog(ime + " je jako lijepo ime. A koliko godina imaš?"));
		JOptionPane.showInternalMessageDialog(null, "Kada osoba ima " + godine + " to je super doba života, "
				+ "ali kada napuniš " + (godine + 1) + " bit æe još bolje.\nPozdrav!");

		// samoinicijativni zadatak 2
		// korisnik upisuje broj
		// program daje informaciju je li broj paran ili ne

		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		String poruka = (broj2 % 2 == 0) ? "Broj je paran" : "Broj je neparan";

		JOptionPane.showInternalMessageDialog(null, poruka);

		// samoinicijativni zadatak 3
		// korisnik upisuje prvi a zatim i drugi broj
		// korisnik upisuje želi li da se ta dva broja zbroje,
		// oduzmu, podijele ili pomnože
		// program daje rezultat

		float rezultat = 0;
		float brojJedan3 = Float.parseFloat(JOptionPane.showInputDialog("Upiši prvi broj"));
		float brojDva3 = Float.parseFloat(JOptionPane.showInputDialog("Upiši drugi broj"));

		String operator = JOptionPane
				.showInputDialog("Unesi +, -, * ili /, ovisno što " + "želiš da se primjeni na ta dva broja");

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

		JOptionPane.showInternalMessageDialog(null,
				df.format(brojJedan3) + " " + operator + " " + df.format(brojDva3) + " = " + df.format(rezultat));

		// samoinicijativni zadatak 4
		// korinik unosi dva broja
		// aplikacija javlja koji broj je veæi ili jesu li brojevi jednaki

		String poruka4 = "Brojevi su jednaki";

		float brojJedan4 = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));

		float brojDva4 = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (brojJedan4 > brojDva4)
			poruka4 = "Prvi broj je veæi od drugoga";
		if (brojJedan4 < brojDva4)
			poruka4 = "Drugi broj je veæi od prvoga";

		JOptionPane.showInternalMessageDialog(null, poruka4);

		// samoinicijativni zadatak 5
		// korisnik unosi prvi broj
		// korisnik unosi drugi broj
		// program javlja je li prvi broj cjelobrojno djeljiv sa drugim brojem

		float prviBroj5 = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));

		float drugiBroj5 = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));

		String poruka5 = (prviBroj5 % drugiBroj5 == 0) ? "Prvi broj je cjelobrojno djeljiv sa drugim brojem bez ostatka"
				: "Prvi broj nije cjelobrojno djeljiv sa drugim bez ostatka";

		JOptionPane.showInternalMessageDialog(null, poruka5);

		// samoinicijativni zadatak 6
		// korisnik unosi tekst
		// program javlja koja je dužina unešenog teksta

		String tekst = JOptionPane.showInputDialog("Unesi tekst");

		JOptionPane.showInternalMessageDialog(null, "Dužina unešenog teksta je " + tekst.length());
		

		// samoinicijativni zadatak 7
		// korisnik unosi tri cijela broja virijednosti iznad 0
		// aplikacija ispisuje srednju vrijednost ta tri broja
		// onoliko puta koliko iznosi najmanji upisani broj
		// ukoliko je srednja vrijednost cijeli broj onda se decimale ne prikazuju

		int prviBroj6, drugiBroj6, treciBroj6, i6, najmanjiBroj6;
		float srednjaVrijednost6;

		prviBroj6 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));

		drugiBroj6 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		treciBroj6 = Integer.parseInt(JOptionPane.showInputDialog("Unesi treæi broj"));

		// provjera jesu li svi brojevi veæi od 0
		if (prviBroj6 < 0 || drugiBroj6 < 0 || treciBroj6 < 0) {

			System.out.println("Svi brojevi moraju biti iznad 0");

		} else {

			// traženje najmanjeg broja
			if (prviBroj6 <= drugiBroj6 && prviBroj6 <= treciBroj6) {
				najmanjiBroj6 = prviBroj6;
			} else if (drugiBroj6 <= prviBroj6 && drugiBroj6 <= treciBroj6) {
				najmanjiBroj6 = drugiBroj6;
			} else {
				najmanjiBroj6 = treciBroj6;
			}

			// raèunanje srednje vrijednosti
			srednjaVrijednost6 = (float) (prviBroj6 + drugiBroj6 + treciBroj6) / 3;

			// ispis solucije kako bi se lakše pratio rad programa
			System.out.println("Upisani brojevi su: " + prviBroj6 + ", " + drugiBroj6 + " i " + treciBroj6);
			System.out.println("Srednja vrijednost je " + srednjaVrijednost6);
			System.out.println("Vrijednost æe se ispisati " + najmanjiBroj6 + " puta");

			// oduzimanje .0 ako je srednja vrijednost cijeli broj
			// i ispis rezultata
			if (srednjaVrijednost6 % 1 == 0) {

				int srednjaVrijednostInt6 = (int) srednjaVrijednost6;

				for (i6 = 0; i6 < najmanjiBroj6; i6++) {
					System.out.println((i6 + 1) + ". " + srednjaVrijednostInt6);
				}

			} else {
				
				for (i6 = 0; i6 < najmanjiBroj6; i6++) {
					System.out.println((i6 + 1) + ". " + srednjaVrijednost6);
				}
			}

		}
		
		// zadatak 8
		// 10 igraèa igra igru i igra kreæe od prvoga prema desetome i tako u krug
		// svaki redom izgovara po jedan broj poèevši od 1 pa sve do 100
		// ako se izgovori broj koji je cjelobrojno djeljiv sa 7 smjer igre se mijenja
		// ako se izgovori broj koji je cjelobrojno djeljiv sa 13 preskaèe se iduæi
		// igraè
		// ispisati koji igraè izgovara koji broj

		int igrac = 1, igracZaPrikazKodPreskakanja = 1, broj7;
		boolean smjerIgre = true; // true = igrac++, false = igrac--

		for (broj7 = 1; broj7 <= 100; broj7++) {

			// obrni smjer igre ako je izgovoreni broj cjelobrojno djeljiv sa 7
			if (broj7 % 7 == 0) {

				smjerIgre = (smjerIgre) ? false : true;

			}

			// ukoliko se premaši broj 10 postavi igraèa na onu poziciju
			// za koliko je broj 10 premašen
			// kako bise postigla igra u krug
			if (igrac > 10) {

				igrac -= 10;

				// ukoliko je broj trenutnog igraèa manji od 1 postavi igraèa na onu poziciju
				// koja je razlika izmeðu trenutnog broja igraèa i 10
				// kako bi se postigla igra u krug
			} else if (igrac <= 0) {

				igrac += 10;

			}

			// ispis tko što izgovara
			System.out.println("Igraè " + igrac + " izgovara broj " + broj7);

			// prikaz poruke u sluèaju promjene smjera radi boljeg praæenja
			if (broj7 % 7 == 0) {

				System.out.println("\nMijenja se smjer igre\n");

				// prikaz poruke u sluèaju da se preskaèe iduæi igraè
			} else if (broj7 % 13 == 0) {

				// preskakanje igraèa
				if (smjerIgre) {
					igrac++;
				} else {
					igrac--;
				}

				// postavljanje broja igraèa za prikaz, jer se u suprotnom prikazuju i 0 i 10
				if (igrac > 10) {

					igracZaPrikazKodPreskakanja = igrac - 10;

				} else if (igrac <= 0) {

					igracZaPrikazKodPreskakanja = igrac + 10;

				}

				System.out.println("\nPreskaèe se igraè broj " + igracZaPrikazKodPreskakanja + "\n");

			}

			// inkremencija ili dekremencija na iduæeg igraèa
			if (smjerIgre) {
				igrac++;
			} else {
				igrac--;
			}

		}
		
		//zadatak 9
		//korisnik unosi 5 brojeva koji se spremaju u niz
		//prikazuje se prvi i zadji uneseni broj
		int[] niz = new int[5];
		
		niz[0] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		niz[1] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		niz[2] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi treæi broj"));
		niz[3] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi èetvrti broj"));
		niz[4] = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi peti broj"));
		
		System.out.println("Prvi broj je " + niz[0] + " a zanji je " + niz[4]);
		
		//zadatak 10
		//korisnik unosi broj i toliko puta se ispisuje broj 7
		int broj10 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj"));
		
		for(int i=0; i<broj10; i++) {
			System.out.println(7);
		}
		
		//zadatak 11
		//program ispisuje sve parne brojeve od 1 do 55
		for(int i=1; i<=55; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//zadatak 12
		//zbrojiti prvih 100 brojeva
		
		int zbroj12 = 0;
		for(int i = 1; i<=100; i++) {
			zbroj12+=i;
		}
		System.out.println(zbroj12);

		//zadatak 13
		//tablica množenja do 10
		String broj13ZaPrikaz;
		int umnozak;
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				umnozak = i*j;
				if(umnozak<10) {
					broj13ZaPrikaz = " " + String.valueOf(umnozak);
				}else {
					broj13ZaPrikaz = String.valueOf(umnozak);
				}
				System.out.print(broj13ZaPrikaz + " ");
			}
			
			System.out.println();
		}
		
		//zadatak 14
		// korisnik unosi 5 cijelih brojeva u niz
		// program ispisuje najveæi broj
		int[] niz14 = new int[5];
		int tmp, duzinaNiza14 = niz14.length;

		for (int i = 0; i < duzinaNiza14; i++) {
			int brojZaPrikaz14 = i + 1; //da se ne bi prikazivala nula
			niz14[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + brojZaPrikaz14 + ". broj"));
		}

		for (int i = 0; i < duzinaNiza14; i++) {
			for (int j = i + 1; j < duzinaNiza14; j++) {
				if (niz14[i] > niz14[j]) { //guranje najveæeg broja na kraj niza
					tmp = niz14[i];
					niz14[i] = niz14[j];
					niz14[j] = tmp;
				}
			}
		}
		System.out.println("Najveæi broj je " + niz14[duzinaNiza14 - 1]);

		//zadatak 15
		//increment - decrement zadatak 1
		int a15 = 10;
		int b15 = ++a15; //a=11 b=11
		a15 = 5 * b15--; //a=55 b=11(-1)
		b15 = --b15 + a15++; //a=56 b=64
		System.out.println(--a15 + ++b15); //a=55 b=65 rezultat 120 
		
		//zadatak 16
		//increment - decrement zadatak 2
		int a16 = 5; 
		int b16 = 2 + a16++; //a=5(+1) b=7
		a16 = b16-- + ++a16; //a=14 b=7(-1)
		b16 = --b16 + 2 - --a16; //a=13 b=-6
		System.out.println(b16++ - --a16 * 2); //a=12 b=-6(+1) rezultat -30
		
		//zadatak 17
		//increment - decrement zadatak 3
		int a17 = 12;
		int b17 = 8 + a17++; //a=12(+1) b=20
		b17 = 5 - ++a17; //a=14 b=-9
		b17 = b17-- + 2*b17-- - a17; //a=14 b=-41(-2)
		System.out.println(--a17 - ++b17); //a=13 b=-42 rezultat 55
		
		//zadatak 18
		//increment - decrement zadatak 3
		int a18 = 4;
		int b18 = 9 / --a18; //a=3 b=3
		a18 += b18++; //a=6 b=3(+1)
		b18 = --b18 + a18++; //a=6(+1) b=9
		System.out.println(++a18 - b18++); //a=8 b=9(+1) rezultat -1	
		
		//zadatak 19
		//increment - decrement zadatak 4
		int a19 = 0;
		int b19 = 1;
		a19 = a19++ + ++a19; //a=1(+1) b=1
		b19 = b19 + a19++ + ++b19; //a=2(+1) b=4(+1)
		a19 += --a19 + --b19; //a=9 b=4
		System.out.println(++a19 * b19--); //a=10 b=4(-1) rezultat 40
		
		//zadatak 20
		//increment - decrement zadatak 5
		int a20 = 1;
		int b20 = 2;		
		b20 = b20-- - --a20 + ++b20 - b20++; //a=0 b=2
		a20 += b20++ + b20 - a20-- + 2*b20; //a=11 b=3
		System.out.println(a20-- + b20++); //a=11 b=3 rezultat 14
		
		//zadatak 21
		//increment - decrement zadatak 6
		int a21 = 1;
		int b21 = 2; 
		int c21 = 3;
		a21 = a21-- + ++b21 + --c21; //a=6 b=3 c=2
		b21 = ++a21 - b21++ + c21++; //a=7 b=6 c=2(+1)
		c21 = a21++ + ++b21 + c21++; //a=7(+1) b=7 c=17
		
		System.out.println(++a21 - --b21 - c21++); //a=9 b=6 c=17 rezultat -14
		
		//zadatak 22
		//increment - decrement zadatak 7
		int a22 = 0;
		int b22 = 1; 
		int c22 = 2;
		a22 = a22++ + ++a22 * --a22 - a22--; //a=1 b=1 c=2
		b22 = --b22 - ++a22 + ++b22 - --a22; //a=1 b=-2 c=2
		c22 = a22 + b22 + a22++ + b22++ + ++a22 + ++b22; //a=2(+1) b=-1(+1) c=1
		System.out.println(a22++ + ++b22 * c22--); // a=3 b=1 c=1 rezultat 4
	}
}
