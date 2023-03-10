package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " ? " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "? " + texte + "?");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Druide panoramix;
		panoramix = new Druide()
	}
}
