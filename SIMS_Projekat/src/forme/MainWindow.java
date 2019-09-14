package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aplikacija.Admin;
import mein.Main;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		// Ovde ucitama korisnike za labelu u kojoj pise ko je trenutno aktivan, kasnije nee biti potrebno!
		try {
			LoginScreen.ucitajKorisnike();
		} catch (IOException e2) {
		
			System.out.println("ne mogu da iscitam korisnike iz MainWindows konstruktora!");
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		JMenu menu, submenu;
		JMenuItem i1, i2, i3, i4, i5;
		menu = new JMenu("Menu");
		menuBar.add(menu);
		JMenuItem prvi, drugi, treci;
		prvi = new JMenuItem("Informacije");
		drugi = new JMenuItem("Pregled Stanja");
		treci = new JMenuItem("Log out");
		treci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.aktivanKorisnik = null;
				System.out.println("Privremeno ubacena za metoda ucitavanje dok ne sklopim u main....");
				try {
					LoginScreen.ucitajKorisnike();
				} catch (IOException e1) {
					
					System.out.println("Ucitaj korisnike!");
				}
				LoginScreen lg = new LoginScreen();
				setVisible(false);
				lg.setVisible(true);
			}
		});
		menu.add(prvi);
		menu.add(drugi);
		menu.add(treci);
		String tip;
		if(Main.aktivanKorisnik instanceof Admin) {
			tip = "Admin";
		}else {
			tip = "Korisnik";
		}
		
		//JLabel imeKorisnika = new JLabel("                                   "+  tip +":" + Main.aktivanKorisnik.getIme()+ " "+ Main.aktivanKorisnik.getPrezime());
		//menuBar.add(imeKorisnika);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 21, 405, 432);
		contentPane.add(tabbedPane);
		UserTab ut = new UserTab();
		tabbedPane.add("UsersTab",ut);
		AppliancesTab ap = new AppliancesTab();
		tabbedPane.add("AppliancesTab",ap);
		EnergyTypeTab en = new EnergyTypeTab();
		tabbedPane.add("EnergyTypeTab", en);
		SensorsTab s = new SensorsTab();
		tabbedPane.add("SensorsTab",s);

	}
}
