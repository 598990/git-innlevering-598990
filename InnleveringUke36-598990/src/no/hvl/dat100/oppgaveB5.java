package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgaveB5 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			String poengTxt = showInputDialog("Poeng: ");
			int poeng = parseInt(poengTxt);
			if(poeng >= 0 && poeng < 40) {
				System.out.println(poeng + " poeng gir karakter F");
			}
			else if(poeng >= 40 && poeng < 50) {
				System.out.println(poeng + " poeng gir karakter E");
			}
			else if(poeng >= 50 && poeng < 60) {
				System.out.println(poeng + " poeng gir karakter D");
			}
			else if(poeng >= 60 && poeng < 80) {
				System.out.println(poeng + " poeng gir karakter C");
			}
			else if(poeng >= 80 && poeng < 90) {
				System.out.println(poeng + " poeng gir karakter B");
			}
			else if(poeng >= 90 && poeng <= 100) {
				System.out.println(poeng + " poeng gir karakter A");
			}
			else {
				showMessageDialog(null, "Ugyldig poengsum, vennligst skriv på nytt");
				i--;
			}
		}
	}
}
