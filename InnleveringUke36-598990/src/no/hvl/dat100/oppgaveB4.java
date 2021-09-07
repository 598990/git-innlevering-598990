package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgaveB4 {

	public static void main(String[] args) {
		String inntektTxt = showInputDialog("Inntekt: ");
		long inntekt = parseInt(inntektTxt);
		if(inntekt < 184800) {
			System.out.println("Ingen trinnskatt");
		} 
		else if(inntekt >= 184800 && inntekt < 260100) {
			double trinnskatt = inntekt - inntekt/1.017;
			System.out.println("Trinn 1 Trinnskatt: " + trinnskatt);
		}
		else if(inntekt >= 260100 && inntekt < 651250) {
			double trinnskatt = inntekt - inntekt/1.04;
			System.out.println("Trinn 2 Trinnskatt: " + trinnskatt);
		}
		else if(inntekt >= 651250 && inntekt < 1021550) {
			double trinnskatt = inntekt - inntekt/1.132;
			System.out.println("Trinn 3 Trinnskatt: " + trinnskatt);
		}
		else {
			double trinnskatt = inntekt - inntekt/1.162;
			System.out.println("Trinn 4 Trinnskatt: " + trinnskatt);
		}
	}

}
