import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AjouterVoiture {

	private JFrame frame;
	private JTextField marque;
	private JTextField Nbplaces;
	private JTextField NumImmatriculation;
	private JTextField couleur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterVoiture window = new AjouterVoiture();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AjouterVoiture() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		  frame.setTitle("Location de Vehicules");
		  frame.setSize(1000, 700);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
	
		
		  JButton btnAjouterVoiture = new JButton("Ajouter une voiture");
			btnAjouterVoiture.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Voiture voiture = new Voiture (marque.getText(), Integer.parseInt(Nbplaces.getText()), Integer.parseInt(NumImmatriculation.getText()), couleur.getText());
					} catch (NumberFormatException e1) {
						
						e1.printStackTrace();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					} 
				}
			});
		  
		btnAjouterVoiture.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAjouterVoiture.setBounds(153, 197, 174, 35);
		frame.getContentPane().add(btnAjouterVoiture);
		
		JLabel lblGestionDesVoitures = new JLabel("Gestion des voitures");
		lblGestionDesVoitures.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesVoitures.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionDesVoitures.setBounds(153, 23, 158, 24);
		frame.getContentPane().add(lblGestionDesVoitures);
		
		JLabel lblNewLabel = new JLabel("Marque");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 66, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNombreDePlaces = new JLabel("Nombre de places");
		lblNombreDePlaces.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDePlaces.setBounds(95, 91, 134, 14);
		frame.getContentPane().add(lblNombreDePlaces);
		
		JLabel lblNewLabel_1 = new JLabel("Numéro d'immatriculation");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(85, 127, 144, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Couleur");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(85, 162, 144, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		marque = new JTextField();
		marque.setBounds(271, 63, 86, 20);
		frame.getContentPane().add(marque);
		marque.setColumns(10);
		
		Nbplaces = new JTextField();
		Nbplaces.setBounds(271, 88, 86, 20);
		frame.getContentPane().add(Nbplaces);
		Nbplaces.setColumns(10);
		
		NumImmatriculation = new JTextField();
		NumImmatriculation.setBounds(271, 124, 86, 20);
		frame.getContentPane().add(NumImmatriculation);
		NumImmatriculation.setColumns(10);
		
		couleur = new JTextField();
		couleur.setBounds(271, 159, 86, 20);
		frame.getContentPane().add(couleur);
		couleur.setColumns(10);
	}

}

		
				
	
		