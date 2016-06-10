package szkolenie.podstawy;

import javax.swing.JOptionPane;

public class SumaLiczb {

	public static void main(String[] args) {
		int ileRazy = 3;
		int suma = 0;
		for(int i = 1; i <= ileRazy; i++){
		String napis = JOptionPane.showInputDialog("Podaj następną liczbę");
		int liczba = Integer.parseInt(napis);
		suma = suma + liczba;
		}
		System.out.println("Suma podanych liczb wynosi: " + suma);
	}

}
