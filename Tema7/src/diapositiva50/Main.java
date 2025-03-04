package diapositiva50;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Dime un numero: ");
			numero = sca.nextInt();
			
			l.encolar(numero);
			
		}
		while(numero >= 0);
		
		while(l.desencolar > 0) {
			System.out.println(l.desencolar());
		}

	}

}
