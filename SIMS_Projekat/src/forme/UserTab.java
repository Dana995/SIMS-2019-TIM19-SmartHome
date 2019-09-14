package forme;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import aplikacija.Admin;
import aplikacija.User;
import aplikacija.UserRead;
import aplikacija.UserReadWrite;
import mein.Main;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class UserTab extends JPanel {

	/**
	 * Create the panel.
	 */
	private final JPanel contentPanel = new JPanel();
	private JTextField unosImena;
	private JTextField unosPrezimena;
	private JTextField unosKoriImena;
	private JTextField unosLozinke;
	private User noviKorisnik;
	private JRadioButton adminRadioDugme;
	private JRadioButton rRadioDugme;
	private JRadioButton rwRadioDugme;
	private String ime, prezime, kIme, lozinka;

	public void dodajKorisnika() {

		JDialog jd = new JDialog();
		jd.setBounds(100, 100, 347, 349);
		jd.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		jd.getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblUnesiIme = new JLabel("Unesi Ime: ");
		lblUnesiIme.setBounds(10, 11, 128, 25);
		contentPanel.add(lblUnesiIme);

		JLabel lblPrezime = new JLabel("Prezime: ");
		lblPrezime.setBounds(10, 71, 71, 14);
		contentPanel.add(lblPrezime);

		JLabel lblKorisnickoIme = new JLabel("Korisnicko Ime: ");
		lblKorisnickoIme.setBounds(10, 127, 87, 14);
		contentPanel.add(lblKorisnickoIme);

		JLabel lblLozinka = new JLabel("Lozinka: ");
		lblLozinka.setBounds(10, 179, 71, 14);
		contentPanel.add(lblLozinka);
		
		
		JLabel lblPritisniteEnterNakon = new JLabel("Pritisnite ENTER nakon unosa u svako od polja!");
		lblPritisniteEnterNakon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblPritisniteEnterNakon.setBounds(10, 252, 282, 14);
		contentPanel.add(lblPritisniteEnterNakon);

		adminRadioDugme = new JRadioButton("Admin");
		adminRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (adminRadioDugme.isSelected()) {
					rRadioDugme.setSelected(false);
					rwRadioDugme.setSelected(false);
					noviKorisnik = new Admin();
				}
			}
		});
		adminRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 10));
		adminRadioDugme.setBounds(10, 223, 71, 23);
		contentPanel.add(adminRadioDugme);

		rRadioDugme = new JRadioButton("Read Korisnik");
		rRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rRadioDugme.isSelected()) {
					adminRadioDugme.setSelected(false);
					rwRadioDugme.setSelected(false);
					noviKorisnik = new UserRead();
				}
			}
		});
		rRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rRadioDugme.setBounds(88, 223, 91, 23);
		contentPanel.add(rRadioDugme);

		rwRadioDugme = new JRadioButton("ReadWrite Korisnik");
		rwRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rwRadioDugme.isSelected()) {
					rRadioDugme.setSelected(false);
					adminRadioDugme.setSelected(false);
					noviKorisnik = new UserReadWrite();
				}
			}
		});
		rwRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rwRadioDugme.setBounds(197, 223, 128, 23);
		contentPanel.add(rwRadioDugme);

		unosImena = new JTextField();
		unosImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (unosImena.getText() != null) {
					ime = unosImena.getText();
				} else {
					JOptionPane.showMessageDialog(null,
							"Polje je prazno ili niste pritisnuli enter nakon unosa u polje za ime!");
				}
			}
		});
		unosImena.setBounds(107, 13, 164, 20);
		contentPanel.add(unosImena);
		unosImena.setColumns(10);

		unosPrezimena = new JTextField();
		unosPrezimena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (unosPrezimena.getText() != null) {
					prezime = unosPrezimena.getText();
				} else {
					JOptionPane.showMessageDialog(null,
							"Polje je prazno ili niste pritisnuli enter nakon unosa u polje za prezime!");
				}
			}
		});
		unosPrezimena.setBounds(107, 68, 164, 20);
		contentPanel.add(unosPrezimena);
		unosPrezimena.setColumns(10);

		unosKoriImena = new JTextField();
		unosKoriImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dodati proveru da li vec postoji
				if (unosKoriImena.getText() != null) {
					kIme = unosKoriImena.getText();
				} else {
					JOptionPane.showMessageDialog(null,
							"Polje je prazno ili niste pritisnuli enter nakon unosa u polje za kor ime!");
				}
			}
		});
		unosKoriImena.setBounds(107, 124, 164, 20);
		contentPanel.add(unosKoriImena);
		unosKoriImena.setColumns(10);

		unosLozinke = new JTextField();
		unosLozinke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (unosLozinke.getText() != null) {
					lozinka = unosLozinke.getText();
				} else {
					JOptionPane.showMessageDialog(null,
							"Polje je prazno ili niste pritisnuli enter nakon unosa u polje za lozniku!");
				}
			}
		});
		unosLozinke.setBounds(107, 176, 164, 20);
		contentPanel.add(unosLozinke);
		unosLozinke.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			jd.getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jd.dispose();
						// dodati proeveru da li je korisnik null i da li je sve uneto
						if (ime != null && prezime != null && kIme != null && lozinka != null) {
							if (!adminRadioDugme.isSelected() && !rRadioDugme.isSelected()
									&& !rwRadioDugme.isSelected()) {

								noviKorisnik.setIme(ime);
								noviKorisnik.setPrezime(prezime);
								noviKorisnik.setKorisnickoIme(kIme);
								noviKorisnik.setLozinka(lozinka);
								Main.listaKorisnika.add(noviKorisnik);
							}
						} else {
							JOptionPane.showMessageDialog(null,
									"Niste uneli u polje ili niste pritisnuli enter nakon unosa");

							dodajKorisnika();
						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jd.dispose();

					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		jd.setVisible(true);

	}

	public UserTab() {
		setLayout(null);
		setSize(405, 432);

		JButton btnNewButton = new JButton("Dodaj korisnika");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dodajKorisnika();
			}
		});
		btnNewButton.setBounds(34, 33, 160, 36);
		add(btnNewButton);

		JButton btnMenjajStanjeUredjaja = new JButton("Menjaj stanje uredjaja");
		btnMenjajStanjeUredjaja.setBounds(34, 114, 160, 36);
		add(btnMenjajStanjeUredjaja);

		JButton btnNewButton_1 = new JButton("Dodaj uredjaj");
		btnNewButton_1.setBounds(34, 201, 160, 36);
		add(btnNewButton_1);

	}

}
