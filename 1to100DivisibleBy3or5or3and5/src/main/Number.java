package main;

public class Number {

	private int value; // Integer Wert der Zahl
	private String displayLabel; // Assoziierter String zur Darstellung im GUI

	public Number(int value) {

		this.value = value;
		if (this.value % 15 == 0) { // Gegeben zwei Teilerfremden Zahlen als
									// Divisoren lässt sich die Teilbarkeit des
									// Dividenden mit dem Produkt beider
									// Divisioren ermitteln.
			                        // -> Spart eine if-Abfrage
									
			this.displayLabel = DivisibleStrings.DIVISBLE_BY_3_AND_5.toString();
		} else if (this.value % 5 == 0) {
			this.displayLabel = DivisibleStrings.DIVISIBLE_BY_5.toString();
		} else if (this.value % 3 == 0) {
			this.displayLabel = DivisibleStrings.DIVSIBLE_BY_3.toString();
		} else {
			this.displayLabel = Integer.toString(this.value);
		} 
		
		// Ermittelt Teilbarkeit des Ganzzahlwertes nach Anforderung und 
		// initialisiert das passende String Objekt zur Darstellung.
	}

	public int getValue() {
		return this.value;
	}

	public String getDisplayLabel() {
		return this.displayLabel;
	}
}
