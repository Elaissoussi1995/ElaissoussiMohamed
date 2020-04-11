
import java.util.ArrayList;

public class Parking {

	private ArrayList <Vehicule> vehicules = new ArrayList <Vehicule>() ;

	public ArrayList<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(ArrayList<Vehicule> Vehicules) {
		this.vehicules = vehicules;
	} 
		
	public void affichervehiculesParking() { 
		System.out.println ("les vehicules du parking : ");
		for (int i = 0 ; i<this.getVehicules().size() ; i++) { 
			System.out.println(this.getVehicules().get(i).toString()) ; 
		}
	}

	public void ajouterVehicule(Vehicule v){
	 
		this.vehicules.add(v);
		}
	// design pattern singleton
    static Parking p = new Parking();
    private Parking () {
    }
    public static Parking getInstance() {
    		return p;
    }
	}