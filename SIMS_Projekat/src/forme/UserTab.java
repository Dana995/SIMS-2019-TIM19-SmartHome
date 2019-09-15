package forme;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
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
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserTab extends JPanel {

	private final JPanel contentPanel = new JPanel();
	private User noviKorisnik;
	private String ime, prezime, kIme, lozinka;
	private String novoIme, novoPrezime, novoKIme, novaLozinka;
	private final JDialog dialogAddUser = new JDialog();
	private final JDialog dialogEditUser= new JDialog();
	private JButton dodajKorisnika;
	private JButton izmeniKorisnika;
	private JButton dodajUredjaj;
	private JButton btnMenjajStanjeUredjaja;

	private String tekstIzPretrage;
	private static User pronadjenUser = null;

	public void dodajKorisnika() throws IOException {

		JTextField unosImena, unosPrezimena, unosKoriImena, unosLozinke;
		JRadioButton adminRadioDugme = new JRadioButton("Admin");
		JRadioButton rRadioDugme = new JRadioButton("rUser");
		JRadioButton rwRadioDugme = new JRadioButton("rwUser");

		dialogAddUser.setBounds(100, 100, 347, 349);
		dialogAddUser.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		dialogAddUser.getContentPane().add(contentPanel, BorderLayout.CENTER);
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

		rwRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rwRadioDugme.isSelected()) {
					rRadioDugme.setSelected(false);
					adminRadioDugme.setSelected(false);
					noviKorisnik = new UserReadWrite();
					System.out.println(noviKorisnik);
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
				}
			}
		});
		unosPrezimena.setBounds(107, 68, 164, 20);
		contentPanel.add(unosPrezimena);
		unosPrezimena.setColumns(10);

		unosKoriImena = new JTextField();
		unosKoriImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (unosKoriImena.getText() != null) {
					kIme = unosKoriImena.getText();
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
			dialogAddUser.getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (ime != null && prezime != null && kIme != null && lozinka != null) {
							if (unosImena.getText().isEmpty() || unosPrezimena.getText().isEmpty()
									|| unosKoriImena.getText().isEmpty() || unosLozinke.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Ostavili ste neko od polja prazno!");

							} else if (adminRadioDugme.isSelected() == false && rRadioDugme.isSelected() == false
									&& rwRadioDugme.isSelected() == false) {

								JOptionPane.showMessageDialog(null, "Niste cekirali dugme!");

							} else {
								System.out.println(noviKorisnik);
								noviKorisnik.setIme(ime);
								noviKorisnik.setPrezime(prezime);
								noviKorisnik.setKorisnickoIme(kIme);
								noviKorisnik.setLozinka(lozinka);
								Main.listaKorisnika.add(noviKorisnik);
								unosImena.setText(null);
								unosPrezimena.setText(null);
								unosKoriImena.setText(null);
								unosLozinke.setText(null);
								adminRadioDugme.setSelected(false);
								rRadioDugme.setSelected(false);
								rwRadioDugme.setSelected(false);
								try {
									User.upisiKorisnike();
								} catch (IOException e1) {
									System.out.println("Ne mogu da upisem korisnike iz UserTaba!");
								}
								dialogAddUser.dispose();
								contentPanel.removeAll();
								contentPanel.updateUI();
							}

						} else {
							JOptionPane.showMessageDialog(null,
									"Niste uneli u polje ili niste pritisnuli enter nakon unosa");

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
						izmeniKorisnika.setEnabled(true);
						dodajUredjaj.setEnabled(true);
						btnMenjajStanjeUredjaja.setEnabled(true);
						// jd.dispose();
						unosImena.setText(null);
						unosPrezimena.setText(null);
						unosKoriImena.setText(null);
						unosLozinke.setText(null);
						adminRadioDugme.setSelected(false);
						rRadioDugme.setSelected(false);
						rwRadioDugme.setSelected(false);
						// jd.disable();
						dialogAddUser.setVisible(false);
						contentPanel.removeAll();
						contentPanel.updateUI();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		dialogAddUser.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		dialogAddUser.setVisible(true);
		

	}

//================================================================================================

	public void editUser() {
		JTextField pretraga;
		JTextField unosImena, unosPrezimena, unosKoriImena, unosLozinke;

		dialogEditUser.setBounds(100, 100, 347, 419);
		dialogEditUser.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		dialogEditUser.getContentPane().add(contentPanel, BorderLayout.CENTER);
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
		JRadioButton rwRadioDugme = new JRadioButton("ReadWrte Korisnik");
		JRadioButton rRadioDugme = new JRadioButton("Read Korisnik");
		JRadioButton adminRadioDugme = new JRadioButton("Admin");
		adminRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (adminRadioDugme.isSelected()) {
					rRadioDugme.setSelected(false);
					rwRadioDugme.setSelected(false);

				}
			}
		});
		adminRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		adminRadioDugme.setBounds(10, 281, 71, 23);
		contentPanel.add(adminRadioDugme);

		rwRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rwRadioDugme.isSelected()) {
					rRadioDugme.setSelected(false);
					adminRadioDugme.setSelected(false);

				}
			}
		});
		rwRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rwRadioDugme.setBounds(197, 281, 128, 23);
		contentPanel.add(rwRadioDugme);

		rRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rRadioDugme.isSelected()) {
					rwRadioDugme.setSelected(false);
					adminRadioDugme.setSelected(false);

				}
			}
		});
		rRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rRadioDugme.setBounds(88, 281, 91, 23);
		contentPanel.add(rRadioDugme);

		unosImena = new JTextField();
		unosImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoIme = unosImena.getText();
			}
		});
		unosImena.setBounds(107, 71, 164, 20);
		contentPanel.add(unosImena);
		unosImena.setColumns(10);

		unosPrezimena = new JTextField();
		unosPrezimena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoPrezime = unosPrezimena.getText();
			}
		});
		unosPrezimena.setBounds(107, 126, 164, 20);
		contentPanel.add(unosPrezimena);
		unosPrezimena.setColumns(10);

		unosKoriImena = new JTextField();
		unosKoriImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoKIme = unosKoriImena.getText();
			}
		});
		unosKoriImena.setBounds(107, 182, 164, 20);
		contentPanel.add(unosKoriImena);
		unosKoriImena.setColumns(10);

		unosLozinke = new JTextField();
		unosLozinke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novaLozinka = unosLozinke.getText();
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
				tekstIzPretrage = pretraga.getText();
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

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			dialogEditUser.getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (novoIme != null && novoPrezime != null && novoKIme != null && novaLozinka != null) {
							if (novoIme.isEmpty() || novoPrezime.isEmpty() || novoKIme.isEmpty()
									|| novaLozinka.isEmpty()) {
								JOptionPane.showMessageDialog(null, "Ostavili ste neko od polja prazno!");

							} else if (adminRadioDugme.isSelected() == false && rRadioDugme.isSelected() == false
									&& rwRadioDugme.isSelected() == false) {

								JOptionPane.showMessageDialog(null, "Niste cekirali dugme!");

							} else {
								Main.listaKorisnika.remove(pronadjenUser);
								if (adminRadioDugme.isSelected()) {
									Admin novi = new Admin(novoIme, novoPrezime, novoKIme, novaLozinka);
									Main.listaKorisnika.add(novi);
								} else if (rRadioDugme.isSelected()) {
									UserRead novi = new UserRead(novoIme, novoPrezime, novoKIme, novaLozinka);
									Main.listaKorisnika.add(novi);
								} else {
									UserReadWrite novi = new UserReadWrite(novoIme, novoPrezime, novoKIme, novaLozinka);
									Main.listaKorisnika.add(novi);
								}

								try {
									User.upisiKorisnike();
								} catch (IOException e1) {
									System.out.println("Ne mogu da upisem korisnike iz UserTaba-EditUser!");
								}
								dialogEditUser.dispose();
								contentPanel.removeAll();
								contentPanel.updateUI();
							}

						} else {
							JOptionPane.showMessageDialog(null,
									"Niste uneli u polje ili niste pritisnuli enter nakon unosa");

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

						dialogEditUser.setVisible(false);
						dodajKorisnika.setEnabled(true);
						dodajUredjaj.setEnabled(true);
						btnMenjajStanjeUredjaja.setEnabled(true);
						contentPanel.removeAll();
						contentPanel.updateUI();
						// jd.disable();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		unosImena.setEnabled(false);
		unosPrezimena.setEnabled(false);
		unosKoriImena.setEnabled(false);
		unosLozinke.setEnabled(false);
		adminRadioDugme.setSelected(false);
		rRadioDugme.setSelected(false);
		rwRadioDugme.setSelected(false);

		JButton pretraziDugme = new JButton("ok");
		pretraziDugme.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (tekstIzPretrage == null || tekstIzPretrage.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Polje za pretragu je prazno ili niste pritisnuli enter!");
					;
				} else {

					findUser(tekstIzPretrage);
					unosImena.setEnabled(true);
					unosPrezimena.setEnabled(true);
					unosKoriImena.setEnabled(true);
					unosLozinke.setEnabled(true);
					adminRadioDugme.setSelected(false);
					rRadioDugme.setSelected(false);
					rwRadioDugme.setSelected(false);
					unosImena.setText(pronadjenUser.getIme());
					unosPrezimena.setText(pronadjenUser.getPrezime());
					unosKoriImena.setText(pronadjenUser.getKorisnickoIme());
					unosLozinke.setText(pronadjenUser.getLozinka());
					if (pronadjenUser instanceof Admin) {
						adminRadioDugme.setSelected(true);
					} else if (pronadjenUser instanceof UserRead) {
						rRadioDugme.setSelected(true);
					} else {
						rwRadioDugme.setSelected(true);
					}
					pretraga.setText(null);

				}
			}

		});
		pretraziDugme.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pretraziDugme.setBounds(281, 13, 38, 23);
		contentPanel.add(pretraziDugme);

		dialogEditUser.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		dialogEditUser.setVisible(true);


	};
//============================================================================================================

	public static void findUser(String userString) {

		for (User u : Main.listaKorisnika) {
			// System.out.println("Uneti sting je:" + userString);
			// System.out.println("Iz liste: "+ u.getKorisnickoIme());
			if (userString.equalsIgnoreCase(u.getKorisnickoIme())) {
				pronadjenUser = u;
				break;
			}
		}
		// System.out.println("Korisnik: " + user);
	}

	public UserTab() {
		setLayout(null);
		setSize(405, 432);
		dodajKorisnika = new JButton("Dodaj korisnika");
		dodajKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dodajKorisnika();
					izmeniKorisnika.setEnabled(false);
					dodajUredjaj.setEnabled(false);
					btnMenjajStanjeUredjaja.setEnabled(false);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		dodajKorisnika.setBounds(110, 33, 160, 36);
		add(dodajKorisnika);

		izmeniKorisnika = new JButton("Izmeni Korisnika");
		izmeniKorisnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editUser();
				dodajKorisnika.setEnabled(false);
				dodajUredjaj.setEnabled(false);
				btnMenjajStanjeUredjaja.setEnabled(false);
			}
		});
		izmeniKorisnika.setBounds(110, 114, 160, 36);
		add(izmeniKorisnika);

		btnMenjajStanjeUredjaja = new JButton("Menjaj stanje uredjaja");
		btnMenjajStanjeUredjaja.setBounds(110, 201, 160, 36);
		add(btnMenjajStanjeUredjaja);

		dodajUredjaj = new JButton("Dodaj uredjaj");
		dodajUredjaj.setBounds(110, 288, 160, 36);
		add(dodajUredjaj);

	}

}
