package DeHsMannheimSS17TPEGrp01Übung2;

public class Rentenpapier extends Vermögensgegenstand {
//	protected final String name; // <-- Abtract rein...
//	protected final long kaufpreis; // <-- Abtract rein...
//	protected final String kaufdatum; // <-- Abtract rein...
	protected final long zeit;
	protected final long zinssatz = 5; // <-- Fest
	protected long kurs;
	protected long betrag =0 ;
		
	// protected final long anzahl;

	public Rentenpapier(String name, long kaufpreis, String kaufdatum, long zeit, long kurs) {
		super(kaufdatum, kurs, kaufdatum);
//		this.name = name;
//		this.kaufpreis = kaufpreis;
//		this.kaufdatum = kaufdatum;
		this.zeit = zeit;
		this.kurs = kurs;
	}

	public long zins() {
		return ((long) (kaufpreis * (Math.pow(zeit, (1 + (zinssatz / 100))))));
	}

	public void auskunft() {
		System.out.println(zins());
	}
	// Selbe wie Festgeld auser handelbar
	// Börse Handelbar...
}
