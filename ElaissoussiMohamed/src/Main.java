import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Parking p;
		p = new Parking();
		
		Voiture v1, v2, v3;
		v1 = new Voiture ("Mercedes", 145828,5);
		v2 = new Voiture ("Audi",582242,4);
		v3 = new Voiture ("Mazerati", 185285,5);
		
		Moto m1,m2;
		m1 = new Moto ("Kawazaki",258425,2);
		m2 = new Moto ("Honda", 858542, 3);
		
		Quad q1,q2;
		q1 = new Quad ("Yamaha", 852412, 4);
		q2 = new Quad ("Azzoro", 823512, 4);
		
		p.ajouterVehicule (v1);
		p.ajouterVehicule (v2);
		p.ajouterVehicule (v3);
		p.ajouterVehicule (m1);
		p.ajouterVehicule (m2);
		p.ajouterVehicule (q1);
		p.ajouterVehicule (q2);


	}


}
