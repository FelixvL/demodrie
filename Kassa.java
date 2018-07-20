import java.util.ArrayList;
import java.util.Scanner;

public class Kassa {
	int geldhoeveelheid;
	ArrayList<Broodje> verkochtBroodjes = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	
	int verkopen() {
		System.out.println("Welk broodje wilt u kopen");
		String invoer = scanner.nextLine();
		int getal = Integer.parseInt(invoer);
		return getal;
	}
	void afrekenen(Broodje broodje) {
		geldhoeveelheid += broodje.prijs;
		System.out.println("mijn geld is nu"+ geldhoeveelheid);
	}
}
