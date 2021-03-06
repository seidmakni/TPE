package DeHsMannheimSS17TPEGrp01Übung2;

public class Immobilien extends Vermögensgegenstand {
	// protected final String name; // <-- Abtract rein...
	// protected long kaufpreis; // <-- Abtract rein...
	// protected final String kaufdatum; // <-- Abtract rein...
	private final long zeit;
	private final long anzahl;
	private final long konstatanteSenkungDesKaufpreisBisMaxNull = 1000;
	private long aktuellerPreis;

	public Immobilien(String name, long kaufpreis, String kaufdatum, long zeit, long anzahl) {
		super(name, kaufpreis, kaufdatum);
		// this.name = name;
		// this.kaufpreis = kaufpreis;
		// this.kaufdatum = kaufdatum;
		this.zeit = zeit;
		if (anzahl > 1) {
			this.anzahl = 1;
		} else if (anzahl < 0) {
			this.anzahl = 0;
		} else {
			this.anzahl = anzahl;
		}
	}

	public void wertSinkung() {
		if (kaufpreis < (konstatanteSenkungDesKaufpreisBisMaxNull * zeit)) {
			aktuellerPreis = 0;
		}
		aktuellerPreis = kaufpreis - (zeit * konstatanteSenkungDesKaufpreisBisMaxNull);
	}

	public long getZeit() {
		return zeit;
	}

	public long getAnzahl() {
		return anzahl;
	}

	public long getAktuellerPreis() {
		return aktuellerPreis;
	}
	
}
