package es2;

import java.util.Random;

public class Es2 {
	Random random;
	public Es2() {	
		random = new Random();
	}
	
	public int random() {
		return random.nextInt(100); // Ritorna un numero casuale tra 0 e 99
	}
}
