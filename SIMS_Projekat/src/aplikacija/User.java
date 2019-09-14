package aplikacija;

/***********************************************************************
 * Module:  User.java
 * Author:  Nadja
 * Purpose: Defines the Class User
 ***********************************************************************/
import stanje.State;
import java.util.*;

/** @pdOid 307ea71c-1ecd-4ca2-958e-6244e7b8f593 */
public abstract class User {
	/** @pdOid 3423ce75-c77f-4440-8f11-3b7f8adb53b5 */
	private State state;
	public String korisnickoIme;
	public String lozinka;
	public String ime;
	public String prezime;
	
	public User() {
		
	}

	public User(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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