package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class GUI {

	private Number[] numberObjects;
	private JFrame frame; // Applikationsfenster
	private JPanel numberPanel; // Zahlenpanel
	private JScrollPane numberScrollPane; // Scrollpane zur vertikalen
	                                      // Anzeige aller Zahlen
	private GridLayout numberLayout; // Raster Layout für die
	                                 // Anzeige der Zahlen in
	                                 // JLabels
	private String windowTitle;
	private Color colorSkyBlue;
	private Color colorAquamarineCyan; // RGB Farbpallete
	private Color colorCeladonGreen;
	private Color colorLightGray;
	private Dimension minWindowSize;
	
	public GUI(Number[] numberObjects) {
		
		// Initialisiere Objekte ///
		
		this.windowTitle = "Teilbarkeit";
		this.colorSkyBlue = new Color(135, 206, 235);
		this.colorAquamarineCyan = new Color(127, 255, 212);
		this.colorCeladonGreen = new Color(175, 225, 175);
		this.colorLightGray = new Color(240, 240, 240);
		this.minWindowSize = new Dimension(245, 200);
		this.numberObjects = numberObjects;
		
		/// Initialisiere Layout /// 
		this.numberLayout = new GridLayout(numberObjects.length, 1); // 1 Spalte
		                                                             // n Zeilen
	    
		/// Initialisiere Swing Komponenten ///
		this.frame = new JFrame(this.windowTitle);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* Terminiere
		Prozess beim schließen den Fensters */             
		this.numberPanel = new JPanel();
		this.frame.setMinimumSize(new Dimension(this.minWindowSize));
		this.numberPanel.setLayout(this.numberLayout);
		
		/// Generiere und formatiere JPanel für jede Nummer ///
		for (Number number : this.numberObjects) {
			JPanel panel = new JPanel();
			JLabel label = new JLabel(number.getDisplayLabel());
			panel.setLayout(new GridBagLayout()); // GridBagLayout erlaubt
			                                      // Zentrierung des
			                                      // JLabels auf das
			                                      // JPanel
			if (label.getText()
					.equals(DivisibleStrings.DIVISBLE_BY_3_AND_5.toString())) {
				panel.setBackground(this.colorAquamarineCyan);
				label.setForeground(Color.WHITE);
			} else if (label.getText()
					.equals(DivisibleStrings.DIVISIBLE_BY_5.toString())) {
				panel.setBackground(this.colorSkyBlue);
				label.setForeground(Color.WHITE);
			} else if (label.getText()
					.equals(DivisibleStrings.DIVSIBLE_BY_3.toString())) {
				panel.setBackground(this.colorCeladonGreen);
				label.setForeground(Color.WHITE);
			} else {
				panel.setBackground(this.colorLightGray);
			}
			panel.add(label);
			this.numberPanel.add(panel);
		}
		
		/// Füge das Panel aus Panels einem Scroll Pane hinzu ///
		this.numberScrollPane = new JScrollPane(this.numberPanel);
		
		/// Füge das ScrollPane dem Applikationsfenster hinzu ///
		this.frame.add(this.numberScrollPane);
		
		/// Zeige das Fenster an ///
		this.frame.setVisible(true);
	}
}
