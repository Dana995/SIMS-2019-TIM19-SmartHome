package aplikacija;

/***********************************************************************
 * Module:  User.java
 * Author:  Nadja
 * Purpose: Defines the Class User
 ***********************************************************************/
import stanje.State;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import mein.Main;

/** @pdOid 307ea71c-1ecd-4ca2-958e-6244e7b8f593 */
public abstract class User {
	/** @pdOid 3423ce75-c77f-4440-8f11-3b7f8adb53b5 */
	public String korisnickoIme;
	public String lozinka;
	public String ime;
	public String prezime;

	@Override
	public String toString() {
		return "User " + "  korisnickoIme=" + korisnickoIme + ", lozinka=" + lozinka + ", ime=" + ime + ", prezime="
				+ prezime + "]";
	}
	
	

	public User(String ime, String prezime, String korisnickoIme, String lozinka) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
	}



	public User() {

	}

	public static void ucitajKorisnike() throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("korisnici.txt"));
		String linija;
		while ((linija = bf.readLine()) != null) {
			String[] niz = linija.split("\\|");
			if (niz[0].equalsIgnoreCase("admin")) {
				Admin a = new Admin();
				a.setKorisnickoIme(niz[1]);
				a.setLozinka(niz[2]);
				a.setIme(niz[3]);
				a.setPrezime(niz[4]);
				Main.listaKorisnika.add(a);
			} else if (niz[0].equalsIgnoreCase("r")) {
				UserRead ur = new UserRead();
				ur.setKorisnickoIme(niz[1]);
				ur.setLozinka(niz[2]);
				ur.setIme(niz[3]);
				ur.setPrezime(niz[4]);
				Main.listaKorisnika.add(ur);
			} else if (niz[0].equalsIgnoreCase("rw")) {
				UserReadWrite urw = new UserReadWrite();
				urw.setKorisnickoIme(niz[1]);
				urw.setLozinka(niz[2]);
				urw.setIme(niz[3]);
				urw.setPrezime(niz[4]);
				Main.listaKorisnika.add(urw);
			}

		}
		bf.close();

	}

	public static void upisiKorisnike() throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter("korisnici.txt"));
		String linija = null;
		for(User k : Main.listaKorisnika) {
			System.out.println(k);
		}
		for (User k : Main.listaKorisnika) {
			if (k instanceof Admin) {
				linija = String.format("%s|%s|%s|%s|%s", "admin", k.getKorisnickoIme(), k.getLozinka(), k.getIme(),
						k.getPrezime());
				pr.append(linija);
				pr.append("\n");
			} else if (k instanceof UserRead) {
				linija = String.format("%s|%s|%s|%s|%s", "r", k.getKorisnickoIme(), k.getLozinka(), k.getIme(),
						k.getPrezime());
				pr.append(linija);
				pr.append("\n");
			} else {
				linija = String.format("%s|%s|%s|%s|%s", "rw", k.getKorisnickoIme(), k.getLozinka(), k.getIme(),
						k.getPrezime());
				pr.append(linija);
				pr.append("\n");
			}
		}
		pr.close();
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}