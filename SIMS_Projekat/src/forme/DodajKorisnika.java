package forme;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;

public class DodajKorisnika extends JDialog {

	//Klasa za testiranje guija
	private final JPanel contentPanel = new JPanel();
	private JTextField unosImena;
	private JTextField unosPrezimena;
	private JTextField unosKoriImena;
	private JTextField unosLozinke;
	private JTextField pretraga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DodajKorisnika dialog = new DodajKorisnika();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DodajKorisnika() {
		setBounds(100, 100, 347, 419);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUnesiIme = new JLabel("Unesi Ime: ");
		lblUnesiIme.setBounds(10, 69, 128, 25);
		contentPanel.add(lblUnesiIme);
		
		JLabel lblPrezime = new JLabel("Prezime: ");
		lblPrezime.setBounds(10, 129, 71, 14);
		contentPanel.add(lblPrezime);
		
		JLabel lblKorisnickoIme = new JLabel("Korisnicko Ime: ");
		lblKorisnickoIme.setBounds(10, 185, 87, 14);
		contentPanel.add(lblKorisnickoIme);
		
		JLabel lblLozinka = new JLabel("Lozinka: ");
		lblLozinka.setBounds(10, 237, 71, 14);
		contentPanel.add(lblLozinka);
		
		JRadioButton adminRadioDugme = new JRadioButton("Admin");
		adminRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		adminRadioDugme.setBounds(10, 281, 71, 23);
		contentPanel.add(adminRadioDugme);
		
		JRadioButton rRadioDugme = new JRadioButton("Read Korisnik");
		rRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rRadioDugme.setBounds(88, 281, 91, 23);
		contentPanel.add(rRadioDugme);
		
		JRadioButton rwRadioDugme = new JRadioButton("ReadWrte Korisnik");
		rwRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rwRadioDugme.setBounds(197, 281, 128, 23);
		contentPanel.add(rwRadioDugme);
		
		unosImena = new JTextField();
		unosImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosImena.setBounds(107, 71, 164, 20);
		contentPanel.add(unosImena);
		unosImena.setColumns(10);
		
		unosPrezimena = new JTextField();
		unosPrezimena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosPrezimena.setBounds(107, 126, 164, 20);
		contentPanel.add(unosPrezimena);
		unosPrezimena.setColumns(10);
		
		unosKoriImena = new JTextField();
		unosKoriImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosKoriImena.setBounds(107, 182, 164, 20);
		contentPanel.add(unosKoriImena);
		unosKoriImena.setColumns(10);
		
		unosLozinke = new JTextField();
		unosLozinke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosLozinke.setBounds(107, 234, 164, 20);
		contentPanel.add(unosLozinke);
		unosLozinke.setColumns(10);
		
		JLabel lblPritisniteEnterNakon = new JLabel("Pritisnite ENTER nakon unosa u svako od polja!");
		lblPritisniteEnterNakon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblPritisniteEnterNakon.setBounds(10, 310, 289, 14);
		contentPanel.add(lblPritisniteEnterNakon);
		
		pretraga = new JTextField();
		pretraga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pretraga.setBounds(107, 14, 164, 20);
		contentPanel.add(pretraga);
		pretraga.setColumns(10);
		
		JLabel lblUnesiteKime = new JLabel("Unesite kIme: ");
		lblUnesiteKime.setBounds(10, 17, 87, 14);
		contentPanel.add(lblUnesiteKime);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 45, 331, 13);
		contentPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-6, 346, 331, 1);
		contentPanel.add(separator_1);
		
		JButton pretraziDugme = new JButton("ok");
		pretraziDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		pretraziDugme.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pretraziDugme.setBounds(281, 13, 38, 23);
		contentPanel.add(pretraziDugme);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
