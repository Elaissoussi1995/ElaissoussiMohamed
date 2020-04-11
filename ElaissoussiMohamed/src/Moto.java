import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Moto extends Vehicule {
	private int nombreCylindres;
	

	public int getNombreCylindres() {
		return nombreCylindres;
	}


	public void setNombreCylindres(int nombreCylindres) {
		this.nombreCylindres = nombreCylindres;
	}


	public Moto (String m, int num, int nb, int nC) throws IOException {
		super (m, num, nb);
		this.nombreCylindres = nC;
		
		JSONObject jsonob = new JSONObject ();
		jsonob.put ("marque", m);
		jsonob.put ("NumImmatriculation", num);
		jsonob.put ("Nbplaces", nb);
		jsonob.put("NombreCylindres",  nombreCylindres);
		
		FileWriter file = new FileWriter(m+".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
	}
}