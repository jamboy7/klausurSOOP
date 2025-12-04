package klausur;

public class Mautgebuehren {

	public static void main(String[] args) {

		System.out.println(berechneMaut(100, 20, 3));

	}

	public static String berechneMaut(double entfernung, double mautProKilometer, int achsenAnzahl) {

		double gebuehr = 0.0;

		if (achsenAnzahl < 2) {

			gebuehr = -1;

		} else if (achsenAnzahl == 2) {

			gebuehr = entfernung * mautProKilometer;

		} else if (achsenAnzahl == 3) {

			gebuehr = entfernung * mautProKilometer * 1.2;

		} else {

			gebuehr = entfernung * mautProKilometer * 1.5;

		}

		return entfernung + " km" + ", " + mautProKilometer + " €/km, " + achsenAnzahl + " Achsen: " + gebuehr;

	}

}
