package diapositiva32;

import diapositiva31.Hora;

public class Main {

	public static void main(String[] args) {

		HoraExacta h1 = new HoraExacta(10, 0, 0);
		Hora h2 = new Hora(10, 0);
				
		System.out.println(h2.equals(h1));

	}

}
