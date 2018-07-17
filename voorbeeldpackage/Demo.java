package voorbeeldpackage;

import voorbeeldpackagetwee.*;
import voorbeeldpackagetwee.subpackage.Scheidsrechter;
import static voorbeeldpackagetwee.Bal.*;
//import static voorbeeldpackagetwee.VoetbalSpeler.*;
//static import

class Demo{
	public static void main(String[] args) {
		Bal deBal = new Bal();
//		VoetbalSpeler vb = new VoetbalSpeler();
		voorbeeldpackagetwee.subpackage.Scheidsrechter sr = new voorbeeldpackagetwee.subpackage.Scheidsrechter();
		deBal.schieten();
		diameter = 38;
		go = 4.0;
		packagedrie.VolleyBal vb = new packagedrie.VolleyBal();
		Scheidsrechter sr2 = new Scheidsrechter();
//		sr2.shirtkleur = "oranje";   // is protected kan alleen via erfrelatie
		sr2.landVanHerkomst = "Belgie"; // is public kan overal
//		sr2.fluitKleur = "Rood";  // is default ALLEEN binnen package
//		sr2.onderbroekKleur = "Groen";  // is private kan alleen binnen klasse
		
		HockeyScheidsrechter hs = new HockeyScheidsrechter();
//		hs.shirtkleur = "zwart"; // is protected kan alleen VIA erfrelatie. Dit is NIET langs de erfrelatie
		
		 new voorbeeldpackagetwee.VoetbalSpeler().wedstrijdSpelen();
	
	}
}

class HockeyScheidsrechter extends Scheidsrechter{
	void voorstellen() {
	//	voorbeeldpackagetwee.VoetbalSpeler.wedstrijdSpelen();
		landVanHerkomst = "Nederland";
		shirtkleur = "Roze"; // Dit is WEL via de erfrelatie
//		fluitKleur = "Rood";// is default
//		onderbroekKleur = "Paars"; // is private
	}
}