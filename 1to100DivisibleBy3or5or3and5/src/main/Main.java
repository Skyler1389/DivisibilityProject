package main;

public class Main {
	
	/* Projektvorgaben: 
	
	Gebe auf dem Bildschirm die Zahlen 1 bis 100 aus.
	 
	Wenn die Zahl durch 3 teilbar ist, dann statt der Zahl bitte 3teilbar
	ausgeben. Wenn die Zahl durch 5 teilbar ist, dann statt der Zahl bitte
	5teilbar ausgeben. Wenn die Zahl durch 3 UND 5 teilbar ist, dann statt
    der Zahl 3und5teilbar ausgeben.
	
	Die Bildschirmausgabe sollte also wie folgt aussehen.
	
	1
	2
	3teilbar
	4
	5teilbar
	3teilbar
	7
	8
	3teilbar
	5teilbar
	11
	3teilbar
	13
	14
	3und5teilbar
	16
	..
	
	Bis 100
	
	Notizen:
	
	"Bildschirmausgabe" habe ich als eine grafische Ausgabe interpretiert
	und dafür Java Swing in diesem Projekt verwendet. */

	public static void main(String[] args) {
		int[] divisors = new int[] {3, 5}; // Divisoren
		Number[] numbers = new Number[100]; // Höchstzahl
		for (int iteration = 1; iteration <= numbers.length; iteration++) {
			numbers[iteration - 1] = new Number(iteration, divisors);
		}
		new GUI(numbers);
	}
}
