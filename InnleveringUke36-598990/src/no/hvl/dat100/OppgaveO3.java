package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		int n = 0;
		long produkt = 1;
		do {
			String tallTxt = JOptionPane.showInputDialog("Skriv et positivt tall");
			n = Integer.parseInt(tallTxt);
		} while (n <= 0);
		for(int i = 1; i <= n; i++) {
			produkt = produkt*i;
		}
		JOptionPane.showMessageDialog(null, "n! = " + produkt);
	}

}
