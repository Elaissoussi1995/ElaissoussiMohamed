import java.io.FileWriter;
import java.io.IOException;


public class Vehicule {
	private String marque;
	private int NumImmatriculation;
	private int Nbplaces;
	
	public Vehicule (String marque, int numImmatriculation, int nbplaces) throws IOException {
		try {
			controle (nbplaces);
		} catch (ErreurException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	this.marque=marque;
	this.NumImmatriculation=numImmatriculation;
	this.Nbplaces=nbplaces;
	
	
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
		try {
			controle(nbplaces);
		} catch (ErreurException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (nbplaces<=6){
	}
	this.Nbplaces=nbplaces;
}
	public static void controle (int nbplaces) throws ErreurException{
		if(nbplaces>=6) {
			throw new ErreurException("Nombre de place incorrect");
		}
	}
}
