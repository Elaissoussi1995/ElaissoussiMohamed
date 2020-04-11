import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Voiture extends Vehicule {
	private String couleur; 

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public Voiture (String m, int num, int nb, String couleur) throws IOException {
		super (m, num, nb);
		this.setCouleur(couleur);
		
		JSONObject jsonob = new JSONObject ();
		jsonob.put ("marque", m);
		jsonob.put ("NumImmatriculation", num);
		jsonob.put ("Nbplaces", nb);
		jsonob.put("Couleur",  couleur);
		
		FileWriter file = new FileWriter(m+".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
	}
	
}
