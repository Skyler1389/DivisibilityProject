package main;

public class NumberFactory1toN {

	private Number[] numberObjects; // Array von Number-Objekten

	public NumberFactory1toN(int n)
			throws IllegalArgumentException {

		if (n <= 0) { 
			throw new IllegalArgumentException(
					"Only positive and greater than 0 values may be passed!");
		} // Unterbindet Übergabe von negativer Höchstzahl und 0 Höchstzahl
		this.numberObjects = new Number[n];

		for (int iteration = 0; iteration < n; iteration++) {
			int numberValue = iteration + 1; // Erstellt aus der 0-Index
			                                 // Iteration des Arrays 
			                                 // die passende Ganzzahl
			this.numberObjects[iteration] = new Number(numberValue);
		}
	}

	public Number getNumber(int value) throws IllegalArgumentException {
		if (value > this.numberObjects.length) {
			throw new IllegalArgumentException(
					"This number has not been defined!");
		} // Unterbindet "out of bounds" Abfrage der Number-Matrix
		int numberIndex = value - 1; // Erstellt aus der gewünschten
		                             // Ganzzahl den passenden
		                             // 0-Index des Arrays
		return this.numberObjects[numberIndex];
	}

	public Number[] getNumberObjects() {
		return this.numberObjects;
	}
}
