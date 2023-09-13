package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//PRENDO I DATI CHE MI SERVONO
		System.out.print("crea ora la tua password poco sicura, cominciamo: \nscrivi qui il tuo nome: ");
		String nome = sc.nextLine();
		
		System.out.print("scrivi qui il tuo cognome: ");
		String cognome = sc.nextLine();
		
		System.out.print("scrivi qui il tuo colore preferito: ");
		String favColor = sc.nextLine();
		
		System.out.print("scrivi qui il giorno di nascita: ");
		short giorno = sc.nextShort();
		
		System.out.print("scrivi qui il mese di nascita: ");
		short mese = sc.nextShort();
		
		System.out.print("scrivi qui il anno di nascita: ");
		short anno = sc.nextShort();
		
		//SOMMO LA DATA
		int sumAgeOfBirth = giorno + mese + anno;
		
		//RESTITUISCO LA PW
		System.out.println("La tua password è: " + nome + "-" + cognome + "-" + favColor + "-" + sumAgeOfBirth);
		
		//CHIUDO LO SCANNER
		sc.close();


	}
}
