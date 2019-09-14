package mein;

import java.util.ArrayList;


import aplikacija.User;
import forme.LoginScreen;


public class Main {

	public static ArrayList<User> listaKorisnika = new ArrayList<User>();
	public static User aktivanKorisnik;

	public static void main(String[] args) {

		LoginScreen lg = new LoginScreen();
		lg.setVisible(true);
	}

}
