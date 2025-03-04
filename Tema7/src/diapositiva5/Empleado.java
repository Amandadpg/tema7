package diapositiva5;

	public class Empleado extends Persona {
		
		private double salario;
		
		public Empleado(String nombre, int edad, double estatura, double salario) {
			super(nombre, edad, estatura);
			this.salario = salario;
		}

		public double getSalario() {
			return this.salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}	
		
		@Override
		public String toString() {
			return "Empleado [nombre=" + this.getNombre() + ", edad=" + this.getEdad() 
			+ ", estatura=" + this.getEstatura() + ", salario=" + this.salario + "]";
		}

		@Override
		public void mostrarInfo() {
			super.mostrarInfo();
			//Añadir el salario
			System.out.println("Salario: " + this.salario);
		}
		
		
		
}
