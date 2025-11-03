package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import es1.Es1;
import es2.Es2;
import es3.Es3;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("La somma è: " + somma()); //Esercizio 1
		System.out.println("Il numero casuale è: " + random());//Esercizio 2
		
		//Esercizio 3
		int a = 5, b = 10;
		
		Es3 es3 = new Es3(a, b);
		System.out.println("La somma di " + a + " e " + b + " è: " + es3.somma());
		// Fine esercizio 3
		
		//Esercizio 4
		short shortVar = 200;
		int intVar = 38_000;
		int longVar = 3_200_000_00;
		float floatVar = 3_200_000_000.55f;
		String stringVar = "10/12/2035";
		//Fine esercizio 4
		
		//Esercizio 5
		
		System.out.println("Inserisci un orario:");
		scanner.nextLine(); // consumiamo la linea vuota rimasta nel buffer
		String data = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
		int secondsToMiddnight = 24 * 3600 - (dateTime.getHour() * 3600 + dateTime.getMinute() * 60 + dateTime.getSecond());
		System.out.println("Secondi mancanti a mezzanotte: " + secondsToMiddnight);
		//Fine esercizio 5
		
	}
	
	public static int random() {
		Es2 es2 = new Es2();
		return es2.random();
	}
	
	public static int somma() {
		
		
		System.out.println("Inserisci il primo numero:");
		int a = scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero:");
		int b = scanner.nextInt();
		
		Es1 es1 = new Es1(a, b);
		
		
		return es1.somma();
		
	}
	
	

}
