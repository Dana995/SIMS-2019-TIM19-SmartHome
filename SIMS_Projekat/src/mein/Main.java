package mein;

import java.io.IOException;
import java.util.ArrayList;


import aplikacija.User;
import forme.LoginScreen;


public class Main {

	public static ArrayList<User> listaKorisnika = new ArrayList<User>();
	public static User aktivanKorisnik;

	public static void main(String[] args) throws IOException {
		
		User.ucitajKorisnike();
		for(User k : listaKorisnika) {
			System.out.println(k);
		}
	}

}
