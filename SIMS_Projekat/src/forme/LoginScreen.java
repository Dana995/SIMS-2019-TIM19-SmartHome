package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aplikacija.Admin;
import aplikacija.User;
import aplikacija.UserRead;
import aplikacija.UserReadWrite;
import mein.Main;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

@SuppressWarnings({ "serial", "unused" })
public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField korisnickoIme;
	private JPasswordField lozinka;

	public static String korisnickoImeTekst;
	public static String sifraTekst;

	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		User.ucitajKorisnike();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		korisnickoIme = new JTextField();
		korisnickoIme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				korisnickoImeTekst = korisnickoIme.getText();

			}
		});

		korisnickoIme.setBounds(10, 51, 144, 20);
		contentPane.add(korisnickoIme);
		korisnickoIme.setColumns(10);

		lozinka = new JPasswordField();
		lozinka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sifraTekst = String.copyValueOf(lozinka.getPassword());

			}
		});
		lozinka.setBounds(10, 102, 144, 20);
		contentPane.add(lozinka);

		JButton prihvati = new JButton("Prihvati");
		prihvati.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if ((korisnickoImeTekst == null) || (sifraTekst == null)) {
					JOptionPane.showMessageDialog(null,
							"Polje je prazno ili niste pritisnuli enter nakon unosa u polje!");
				} else {

					ulogujSe();
					System.out.println(flag);
					if (flag == true) {
						System.out.println("Uspesno!");
						MainWindow frame = new MainWindow();
						frame.setVisible(true);
			
					} else {
						JOptionPane.showMessageDialog(null, "Pogresan unos!");
					}
				}

			}
		});
		prihvati.setBounds(183, 51, 89, 71);
		contentPane.add(prihvati);

		JLabel lblKorisnickoIme = new JLabel("Korisnicko Ime: ");
		lblKorisnickoIme.setBounds(10, 26, 144, 14);
		contentPane.add(lblKorisnickoIme);

		JLabel lblSifra = new JLabel("Sifra: ");
		lblSifra.setBounds(10, 84, 48, 14);
		contentPane.add(lblSifra);
	}

	public static boolean flag;


	public static boolean ulogujSe() {
		System.out.println("Funkcija pozvana!");
		boolean flag1 = false;
		for (User k : Main.listaKorisnika) {
			System.out.println("Usao u petlju");
			if (k.getKorisnickoIme().equalsIgnoreCase(LoginScreen.korisnickoImeTekst)
					&& (k.getLozinka().equals(LoginScreen.sifraTekst))) {
				Main.aktivanKorisnik = k;
				flag1 = true;
				System.out.println("Flag unutar funkcije" + flag1);
				break;
			}
		}
		if (flag1 == false) {
			flag = flag1;

		} else {
			flag = true;
		}
		return flag;

	}
}
