package main;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Number {

	private int value; // Integer Wert der Zahl
	ArrayList<String> validDivisors; // ArrayList implementiert eine Collection
	                                 // flexibler Größe für passende Divisoren
	private String displayLabel; // Assoziierter String zur Darstellung im GUI

	public Number(int value, int[] divisors) { // Divisoren können in 
											   // gewünschter Reihenfolge
		                                       // im String übergeben werden

		this.value = value;
		this.validDivisors = new ArrayList<String>(); // Initialisiere ArrayList
		this.displayLabel = Integer.toString(this.value);
		for (int iteration = 0; iteration < divisors.length; iteration++) {
			// Ermittelt Teilbarkeit des Wertes gegeben gewünschten Divisioren 
			if (this.value % divisors[iteration] == 0) { 
				this.validDivisors.add(String.valueOf(divisors[iteration]));
			}
		}
		if (!this.validDivisors.isEmpty()) {
			// Baue den String auf, falls es Divisoren gibt
			this.displayLabel = this.validDivisors.stream()
					.collect(Collectors.joining("und")) + "teilbar";
		}
	}

	public int getValue() {
		return this.value;
	}

	public String getDisplayLabel() {
		return this.displayLabel;
	}
}
