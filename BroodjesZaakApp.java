import java.util.ArrayList;

class BroodjesZaakApp{
	public static void main(String[] args){
		BroodjesZaak bz = new BroodjesZaak();
		bz.starten();
	}
}
class BroodjesZaak{
	ArrayList<Broodje> broodjes = new ArrayList();
	ArrayList<Koffie> koffie = new ArrayList();
	Kassa kassa = new Kassa();
	KortingsFestival kortingsFestival = new KortingsFestival();
	
	BroodjesZaak(){
		broodjes.add(new Broodje("Kaas",125));
		broodjes.add(new Broodje("Worst",150));
		broodjes.add(new Broodje("Eiersalade",225));
		broodjes.add(new Broodje("Boterhammenworst",30));
	}
	
	void starten() {
		System.out.println("Dit is ons assortiment");
		for(Broodje b : broodjes) {
			System.out.println(b);
		}
		startVerkoop();
	}
	void startVerkoop() {
		int keuze = kassa.verkopen();
		Broodje broodje = broodjes.get(keuze);
		System.out.println("U heeft gekozen voor een "+broodje);
	}
}

