package DeHsMannheimSS17TPEGrp01Übung2;

public class Festgeld extends Vermögensgegenstand {

//	protected final String name; // <-- Abtract rein...
//	protected final long kaufpreis; // <-- Abtract rein...
//	protected final String kaufdatum; // <-- Abtract rein...
	protected final long laufzeit = 10;
	protected final float zinssatz = 5; // <-- ist Fest der 5 Prozent habe ich
										// improvisiert
	private long betrag;
//
	public Festgeld(String name, long kaufpreis, String kaufdatum) {
		super(name, kaufpreis, kaufdatum);
	}
//	public Festgeld(String name, long kaufpreis, String kaufdatum) {
//		super();
//		this.name = name;
//		this.kaufpreis = kaufpreis;
//		this.kaufdatum = kaufdatum;
////		this.laufzeit = zeit;
//	}

	public long zins() {
		betrag = (long) (kaufpreis * (Math.pow(1+(zinssatz/100), laufzeit)));
		return betrag;
	}

	public void auskunft() {
		System.out.println(zins());
	}
}
