package pl.comarch.java.rozmowa;

import java.util.Scanner;

public class RozmowaKonsolowa {

	public static void main(String[] args) {
		System.out.println("Jak masz na imi�?");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		System.out.println("Twoje imi� ma " + imie.length() + " liter.");
		scanner.close();
	}

}
