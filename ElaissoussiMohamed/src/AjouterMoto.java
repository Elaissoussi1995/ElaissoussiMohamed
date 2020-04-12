import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AjouterMoto {

	private JFrame frame;
	private JTextField marque;
	private JTextField Nbplaces;
	private JTextField NumImmatriculation;
	private JTextField nombreCylindres;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterMoto window = new AjouterMoto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AjouterMoto() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("Location de Vehicules");
		  frame.setSize(534, 353);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
		
		JButton btnAjouterUneMoto = new JButton("Ajouter une Moto");
		btnAjouterUneMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Moto moto = new Moto (marque.getText(), Integer.parseInt(Nbplaces.getText()), Integer.parseInt(NumImmatriculation.getText()), Integer.parseInt(nombreCylindres.getText()));
				} catch (NumberFormatException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} 

			}
		});
		btnAjouterUneMoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAjouterUneMoto.setBounds(144, 197, 159, 36);
		frame.getContentPane().add(btnAjouterUneMoto);
		
		JLabel lblGestionDesMotos = new JLabel("Gestion des Motos");
		lblGestionDesMotos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGestionDesMotos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesMotos.setBounds(118, 11, 197, 43);
		frame.getContentPane().add(lblGestionDesMotos);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarque.setBounds(56, 81, 167, 14);
		frame.getContentPane().add(lblMarque);
		
		JLabel lblNombreDePlaces = new JLabel("Nombre de places");
		lblNombreDePlaces.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDePlaces.setBounds(56, 106, 192, 14);
		frame.getContentPane().add(lblNombreDePlaces);
		
		JLabel lblNumroDommatriculation = new JLabel("Num\u00E9ro d'immatriculation");
		lblNumroDommatriculation.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumroDommatriculation.setBounds(56, 129, 192, 14);
		frame.getContentPane().add(lblNumroDommatriculation);
		
		JLabel lblNombreDeCylindres = new JLabel("Nombre de cylindres");
		lblNombreDeCylindres.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDeCylindres.setBounds(56, 154, 192, 14);
		frame.getContentPane().add(lblNombreDeCylindres);
		
		marque = new JTextField();
		marque.setBounds(292, 78, 138, 20);
		frame.getContentPane().add(marque);
		marque.setColumns(10);
		
		Nbplaces = new JTextField();
		Nbplaces.setBounds(292, 103, 138, 20);
		frame.getContentPane().add(Nbplaces);
		Nbplaces.setColumns(10);
		
		NumImmatriculation = new JTextField();
		NumImmatriculation.setBounds(292, 126, 138, 20);
		frame.getContentPane().add(NumImmatriculation);
		NumImmatriculation.setColumns(10);
		
		nombreCylindres = new JTextField();
		nombreCylindres.setBounds(292, 151, 138, 20);
		frame.getContentPane().add(nombreCylindres);
		nombreCylindres.setColumns(10);
	}

}
