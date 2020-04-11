import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionParc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionParc window = new GestionParc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionParc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("Location de Vehicules");
		  frame.setSize(700, 700);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
		
		JLabel lblGestionDuParc = new JLabel("Gestion du Parc");
		lblGestionDuParc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGestionDuParc.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDuParc.setBounds(150, 26, 164, 49);
		frame.getContentPane().add(lblGestionDuParc);
		
		JButton btnAjouterVoiture = new JButton("Ajouter une nouvelle voiture");
		btnAjouterVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AjouterVoiture(); 
			}
		});
		btnAjouterVoiture.setBounds(130, 100, 210, 33);
		frame.getContentPane().add(btnAjouterVoiture);
		
		JButton btnAjouterQuad = new JButton("Ajouter un nouveau quad");
		btnAjouterQuad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AjouterQuad(); 
			}
		});
		btnAjouterQuad.setBounds(130, 175, 210, 33);
		frame.getContentPane().add(btnAjouterQuad);
		
		JButton btnAjouterMoto = new JButton("Ajouter une nouvelle moto");
		btnAjouterMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AjouterMoto(); 
			}
		});
		btnAjouterMoto.setBounds(130, 250, 210, 37);
		frame.getContentPane().add(btnAjouterMoto);
	}

}
