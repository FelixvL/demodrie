package voorbeeldpackage;

import voorbeeldpackagetwee.Bal;
import voorbeeldpackagetwee.subpackage.Scheidsrechter;

class Demo{
	public static void main(String[] args) {
		Bal deBal = new Bal();
//		VoetbalSpeler vb = new VoetbalSpeler();
		Scheidsrechter sr = new Scheidsrechter();
		deBal.schieten();
		deBal.schieten();
		deBal.schieten();
	}
}
