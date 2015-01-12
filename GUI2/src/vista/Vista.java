package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDNI;
	private JTextField textFieldNom;
	private JTextField textFieldCognom1;
	private JTextField textFieldCognom2;
	private JTextField textFieldEdat;
	private JLabel lbLabelLlistat = new JLabel("New label");
	private JButton btnNou = new JButton("Nou");
	private JButton btnEditar = new JButton("Editar");
	private JButton btnEsborrar = new JButton("Esborrar");
	private JButton btnPrimer = new JButton("Primer");
	private JButton btnUltim = new JButton("Ultim");
	private JButton btnAnterior = new JButton("Anterior");
	private JButton btnNext = new JButton("Seguent");
	private JButton btnSave = new JButton("Guardar");
	private JButton btnCancel = new JButton("Cancel\u00B7lar");

	/**
	 * Launch the application.
	 */

					
			

	/**
	 * Create the frame.
	 */
	public Vista() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 476, 70);
		contentPane.add(panel);

		panel.add(btnNou);

		panel.add(btnEditar);

		panel.add(btnEsborrar);

		panel.add(btnPrimer);

		panel.add(btnUltim);

		panel.add(btnAnterior);

		panel.add(btnNext);

		btnSave.setEnabled(false);
		panel.add(btnSave);
		btnCancel.setEnabled(false);
		panel.add(btnCancel);

		
		panel.add(lbLabelLlistat);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 92, 476, 141);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(11, 11, 62, 14);
		panel_1.add(lblDni);

		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setBounds(11, 36, 62, 14);
		panel_1.add(lblNom);

		JLabel lblercognom = new JLabel("1erCognom: ");
		lblercognom.setBounds(11, 61, 84, 14);
		panel_1.add(lblercognom);

		JLabel lbloncognom = new JLabel("2onCognom: ");
		lbloncognom.setBounds(11, 86, 84, 14);
		panel_1.add(lbloncognom);

		JLabel lblNewLabel = new JLabel("Edat: ");
		lblNewLabel.setBounds(11, 111, 62, 14);
		panel_1.add(lblNewLabel);

		textFieldDNI = new JTextField();
		textFieldDNI.setEditable(false);
		textFieldDNI.setBounds(114, 8, 316, 20);
		panel_1.add(textFieldDNI);
		textFieldDNI.setColumns(10);

		textFieldNom = new JTextField();
		textFieldNom.setEditable(false);
		textFieldNom.setBounds(114, 33, 316, 20);
		panel_1.add(textFieldNom);
		textFieldNom.setColumns(10);

		textFieldCognom1 = new JTextField();
		textFieldCognom1.setEditable(false);
		textFieldCognom1.setBounds(114, 58, 316, 20);
		panel_1.add(textFieldCognom1);
		textFieldCognom1.setColumns(10);

		textFieldCognom2 = new JTextField();
		textFieldCognom2.setEditable(false);
		textFieldCognom2.setBounds(114, 83, 316, 20);
		panel_1.add(textFieldCognom2);
		textFieldCognom2.setColumns(10);

		textFieldEdat = new JTextField();
		textFieldEdat.setEditable(false);
		textFieldEdat.setBounds(114, 108, 316, 20);
		panel_1.add(textFieldEdat);
		textFieldEdat.setColumns(10);
	}

	public JLabel getLbLabelLlistat() {
		return lbLabelLlistat;
	}

	public JButton getButtonNou() {
		return btnNou;
	}

	public JButton getButtonEditar() {
		return btnEditar;
	}

	public JButton getButtonEsborrar() {
		return btnEsborrar;
	}

	public JButton getButtonAnterior() {
		return btnAnterior;
	}

	public JButton getButtonNext() {
		return btnNext;
	}

	public JButton getButtonPrimer() {
		return btnPrimer;
	}

	public JButton getButtonLast() {
		return btnUltim;
	}

	public JButton getButtonSave() {
		return btnSave;
	}

	public JButton getButtonCancel() {
		return btnCancel;
	}

	public JTextField getTextFieldDNI() {
		return textFieldDNI;
	}

	public JTextField getTextFieldNom() {
		return textFieldNom;
	}

	public JTextField getTextFieldCognom1() {
		return textFieldCognom1;
	}

	public JTextField getTextFieldCognom2() {
		return textFieldCognom2;
	}

	public JTextField getTextFieldEdat() {
		return textFieldEdat;
	}
	
}
