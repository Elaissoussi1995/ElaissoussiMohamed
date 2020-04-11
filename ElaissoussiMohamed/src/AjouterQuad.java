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

public class AjouterQuad {

	private JFrame frame;
	private JTextField marque;
	private JTextField Nbplaces;
	private JTextField NumImmatriculation;
	private JTextField categorie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterQuad window = new AjouterQuad();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AjouterQuad() {
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
	
		
		JButton btnNewButton = new JButton("Ajouter un Quad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Quad quad = new Quad (marque.getText(), Integer.parseInt(Nbplaces.getText()), Integer.parseInt(NumImmatriculation.getText()), categorie.getText());
				} catch (NumberFormatException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} 

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(153, 197, 174, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblGestionDesQuads = new JLabel("Gestion des Quads");
		lblGestionDesQuads.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesQuads.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionDesQuads.setBounds(153, 23, 158, 24);
		frame.getContentPane().add(lblGestionDesQuads);
		
		JLabel lblNewLabel = new JLabel("Marque");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 66, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNombreDePlaces = new JLabel("Nombre de places");
		lblNombreDePlaces.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDePlaces.setBounds(95, 91, 99, 14);
		frame.getContentPane().add(lblNombreDePlaces);
		
		JLabel lblNewLabel_1 = new JLabel("Num\u00E9ro d'immatriculation");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(85, 127, 119, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cat\u00E9gorie");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(85, 162, 119, 14);
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
		
		categorie = new JTextField();
		categorie.setBounds(271, 159, 86, 20);
		frame.getContentPane().add(categorie);
		categorie.setColumns(10);
	}

}
