import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Vehicule {
	private String marque;
	private int NumImmatriculation;
	private int Nbplaces;
	
	public Vehicule (String m, int num, int nb) throws IOException {
	this.marque=m;
	this.NumImmatriculation=num;
	this.Nbplaces=nb;
	
	JSONObject jsonob = new JSONObject ();
	jsonob.put ("marque", m);
	jsonob.put ("NumImmatriculation", num);
	jsonob.put ("Nbplaces", nb);
	
	FileWriter file = new FileWriter(m+".json");
	file.write(jsonob.toString());
	file.flush();
	file.close();
	System.out.println(jsonob);
}
	
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getNumImmatriculation() {
		return NumImmatriculation;
	}
	public void setNumImmatriculation(int numImmatriculation) {
		NumImmatriculation = numImmatriculation;
	}
	public int getNbplaces() {
		return Nbplaces;
	}
	public void setNbplaces(int nbplaces) {
		Nbplaces = nbplaces;
	}
	
}
