
public class Pistolet extends Broodje implements Korting{
	Pistolet(String naam, int prijs){
		super(naam, prijs);
	}
	public void kortingKrijgen() {
		System.out.println("Er is korting");
	}
}
