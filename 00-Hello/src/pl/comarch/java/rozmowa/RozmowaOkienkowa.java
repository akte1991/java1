package pl.comarch.java.rozmowa;

import javax.swing.JOptionPane;

public class RozmowaOkienkowa {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imi�?");
		String powitanie = "Witaj " + imie + "!";
		JOptionPane.showMessageDialog(null, powitanie);
	}

}
