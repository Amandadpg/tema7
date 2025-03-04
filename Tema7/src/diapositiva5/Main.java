package diapositiva5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("pepe", 34, 1.76);
		Empleado e1 = new Empleado("manoli", 26, 1.80, 2500.0);
				
		System.out.println(p1);
		System.out.println(e1);
		
		
		List<Persona> personas = Arrays.asList(p1,e1);
		
		for(Persona p : personas) {
			p.mostrarInfo();

	}

}
}
