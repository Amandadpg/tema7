package diapositiva5;

	public class Persona extends Object {
		
		//atributos
		private String nombre;
		private int edad;
		private double estatura;
		
		//constructores
		public Persona(String nombre, int edad, double estatura) {
			this.nombre = nombre;
			this.edad = edad;
			this.estatura = estatura;
		}

		//get/set
		public String getNombre() {
			return this.nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return this.edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public double getEstatura() {
			return this.estatura;
		}

		public void setEstatura(double estatura) {
			this.estatura = estatura;
		}	
		
		//métodos
		public void mostrarInfo() {
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Edad: " + this.edad);
			System.out.println("Estatura: " + this.estatura);
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + ", estatura=" 
		+ this.estatura + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj == null) {
				return false;
			}
			if(!this.getClass().equals(obj.getClass())) {
				return false;
			}
			
			boolean iguales = false;
			Persona otra = (Persona) obj;
			
			if(this.nombre.equals(otra.nombre) &&
				this.edad == otra.edad &&
				this.estatura == otra.estatura) {
				iguales = true;
			}
			
			return iguales;
		}
		
		

		
		
	}

