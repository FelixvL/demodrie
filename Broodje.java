public abstract class Broodje {
	String naam;
	int prijs;
	
	Broodje(String naam, int prijs){
		this.naam = naam;
		this.prijs = prijs;
	}
	
	public String toString() {
		return "Broodje: " + naam + " kost " + prijs;
	}
}
