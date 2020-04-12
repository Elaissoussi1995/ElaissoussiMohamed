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
		  frame.setSize(537, 413);
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
		btnAjouterVoiture.setBounds(166, 289, 174, 35);
		frame.getContentPane().add(btnAjouterVoiture);
		
		JLabel lblGestionDesVoitures = new JLabel("Gestion des voitures");
		lblGestionDesVoitures.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesVoitures.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGestionDesVoitures.setBounds(142, 23, 227, 41);
		frame.getContentPane().add(lblGestionDesVoitures);
		
		JLabel lblNewLabel = new JLabel("Marque");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(85, 103, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNombreDePlaces = new JLabel("Nombre de places");
		lblNombreDePlaces.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDePlaces.setBounds(85, 150, 134, 14);
		frame.getContentPane().add(lblNombreDePlaces);
		
		JLabel lblNewLabel_1 = new JLabel("Numéro d'immatriculation");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(85, 193, 183, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Couleur");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(85, 231, 144, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		marque = new JTextField();
		marque.setBounds(300, 100, 168, 20);
		frame.getContentPane().add(marque);
		marque.setColumns(10);
		
		Nbplaces = new JTextField();
		Nbplaces.setBounds(300, 150, 168, 20);
		frame.getContentPane().add(Nbplaces);
		Nbplaces.setColumns(10);
		
		NumImmatriculation = new JTextField();
		NumImmatriculation.setBounds(300, 190, 168, 20);
		frame.getContentPane().add(NumImmatriculation);
		NumImmatriculation.setColumns(10);
		
		couleur = new JTextField();
		couleur.setBounds(300, 228, 168, 20);
		frame.getContentPane().add(couleur);
		couleur.setColumns(10);
	}

}

		
				
	
		