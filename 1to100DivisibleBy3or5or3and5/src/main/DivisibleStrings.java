package main;

public enum DivisibleStrings { // Enumeration im Sinne 
							   // der Anpassbarkeit & Lokalisation
	                           // von Strings.
	
	DIVSIBLE_BY_3("3teilbar"),
	DIVISIBLE_BY_5("5teilbar"),
	DIVISBLE_BY_3_AND_5("3und5teilbar");
	
	private final String displayLabel;
		
	private DivisibleStrings(String displayLabel) {
		this.displayLabel = displayLabel;
	}
	
	@Override
	public String toString() {
		return this.displayLabel;
	}
}
