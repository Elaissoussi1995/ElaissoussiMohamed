import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Quad extends Vehicule {
	
	private String categorie; 
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public Quad (String m, int num, int nb, String cat) throws IOException {
		super (m, num, nb);
		this.categorie = cat;
		
		JSONObject jsonob = new JSONObject ();
		jsonob.put ("marque", m);
		jsonob.put ("NumImmatriculation", num);
		jsonob.put ("Nbplaces", nb);
		jsonob.put("Categorie",  categorie);
		
		FileWriter file = new FileWriter(m+".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
	}
}