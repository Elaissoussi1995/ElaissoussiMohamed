import java.io.IOException;

import junit.framework.TestCase;

public class ParkingTest extends TestCase {
	Parking p = Parking.getInstance();

	public void testaffichervehiculesParking() throws IOException {
		Vehicule ve = new Vehicule ("Wolkswagen", 158565, 4);
		int pre = p.getVehicules().size();
		p.ajouterVehicule(ve);
		assertEquals (pre+1, p.getVehicules().size());
	}
}
