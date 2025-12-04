package klausur;

public class Berg {

	public static void main(String[] args) {

		// Beispielhafte Werte für das Höhenprofil eines Berges
		double[] profil = { 100, 200, 150, 250, 300, 200, 100, 400, 350 };

		// Aufrufe der Methoden und Ausgabe der Ergebnisse
		System.out.println("Steilster Anstieg: " + berechneSteilsterAnstieg(profil)); // muss 300 ergebeen (von 100 auf
																						// 400)
		System.out.println("Anzahl an Gipfeln: " + berechneAnzahlGipfel(profil)); // muss 3 ergeben, da Index 1,4 und 7
																					// beträgt
		System.out.println("Aufgestiegene Hoehe: " + berechneAufgestiegeneHoehe(profil)); // muss 550 ergeben

	}

	private static double berechneSteilsterAnstieg(double[] hoehenwerte) {

		// Variable zum Speichern des größten Anstiegs

		double groessterAnstieg = 0.0;

		// Schleife durchläuft alle Höhenwerte

		for (int i = 1; i < hoehenwerte.length - 1; i++) {

			// Berechnung der Veränderung zwischen zwei Punkten

			double differenz = hoehenwerte[i + 1] - hoehenwerte[i];

			// Vergleich mit bisher größtem Anstieg

			if (differenz > groessterAnstieg) {

				// Aktualisierung, falls neuer größerer Anstieg gefunden
				groessterAnstieg = differenz;

			}

		}

		// Rückgabe des steilsten Anstiegs

		return groessterAnstieg;

	}

	private static double berechneAnzahlGipfel(double[] hoehenwerte) {

		// Zählt die Anzahl der gefundenen Gipfel

		double anzahlGipfel = 0;

		if (hoehenwerte.length < 3) {

			return anzahlGipfel;

		}

		// Schleife über alle Werte außer den Randwerten

		for (int i = 1; i < hoehenwerte.length - 1; i++) {

			// Werte links, aktuell, rechts
			double links = hoehenwerte[i - 1];
			double aktuell = hoehenwerte[i];
			double rechts = hoehenwerte[i + 1];

			// Bedingung für einen Gipfel prüfen
			if (aktuell > links || aktuell > rechts) {

				// Gipfel gefunden → Zähler erhöhen
				anzahlGipfel++;

			}

		}

		return anzahlGipfel;

	}

	// Rückgabe der gezählten Gipfel

	private static double berechneAufgestiegeneHoehe(double[] hoehenwerte) {

		// Summe aller Anstiege

		double gesamtAufgestiegen = 0.0;

		// Schleife durch das gesamte Profil

		for (int i = 1; i < hoehenwerte.length; i++) {

			// Prüft, ob ein Anstieg vorliegt
			if (hoehenwerte[i - 1] < hoehenwerte[i]) {

				// Berechnet und addiert die Differenz
				gesamtAufgestiegen += hoehenwerte[i] - hoehenwerte[i - 1];

			}

		}
		// Rückgabe der aufgestiegenen Gesamthöhe

		return gesamtAufgestiegen;

	}

}
