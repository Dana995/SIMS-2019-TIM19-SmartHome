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

public class DodajKorisnika extends JDialog {

	//Klasa za testiranje guija
	private final JPanel contentPanel = new JPanel();
	private JTextField unosImena;
	private JTextField unosPrezimena;
	private JTextField unosKoriImena;
	private JTextField unosLozinke;

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
		setBounds(100, 100, 347, 349);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
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
		
		JRadioButton adminRadioDugme = new JRadioButton("Admin");
		adminRadioDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		adminRadioDugme.setBounds(10, 223, 71, 23);
		contentPanel.add(adminRadioDugme);
		
		JRadioButton rRadioDugme = new JRadioButton("Read Korisnik");
		rRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rRadioDugme.setBounds(88, 223, 91, 23);
		contentPanel.add(rRadioDugme);
		
		JRadioButton rwRadioDugme = new JRadioButton("ReadWrte Korisnik");
		rwRadioDugme.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rwRadioDugme.setBounds(197, 223, 128, 23);
		contentPanel.add(rwRadioDugme);
		
		unosImena = new JTextField();
		unosImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosImena.setBounds(107, 13, 164, 20);
		contentPanel.add(unosImena);
		unosImena.setColumns(10);
		
		unosPrezimena = new JTextField();
		unosPrezimena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosPrezimena.setBounds(107, 68, 164, 20);
		contentPanel.add(unosPrezimena);
		unosPrezimena.setColumns(10);
		
		unosKoriImena = new JTextField();
		unosKoriImena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosKoriImena.setBounds(107, 124, 164, 20);
		contentPanel.add(unosKoriImena);
		unosKoriImena.setColumns(10);
		
		unosLozinke = new JTextField();
		unosLozinke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		unosLozinke.setBounds(107, 176, 164, 20);
		contentPanel.add(unosLozinke);
		unosLozinke.setColumns(10);
		
		JLabel lblPritisniteEnterNakon = new JLabel("Pritisnite ENTER nakon unosa u svako od polja!");
		lblPritisniteEnterNakon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblPritisniteEnterNakon.setBounds(10, 252, 289, 14);
		contentPanel.add(lblPritisniteEnterNakon);
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
