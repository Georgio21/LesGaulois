package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Ast�rix", 8, 1);
		
		Romain minus;
		minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU� UN GAUGAU�");
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(asterix.getForce());
	}

}
