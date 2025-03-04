package diapositiva50;

import java.util.Arrays;

public class ListaNumeros implements Cola, Pila, ColaDoble{

	    Integer[] tabla;

	    public ListaNumeros() {
	        tabla = new Integer[0];
	    }

	    void insertarPrincipio(Integer nuevo) {
	        tabla = Arrays.copyOf(tabla, tabla.length + 1);
	        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
	        tabla[0] = nuevo;
	    }

	    void insertarFinal(Integer nuevo) {
	        tabla = Arrays.copyOf(tabla, tabla.length + 1);
	        tabla[tabla.length - 1] = nuevo;
	    }

	    void insertarFinal(ListaNumeros otraLista) {
	        int tamIni = tabla.length;//tamaño inicial tabla
	        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
	        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	    }

	    void insertar(int posicion, Integer nuevo) {
	        tabla = Arrays.copyOf(tabla, tabla.length + 1);
	        System.arraycopy(tabla, posicion, tabla, posicion + 1,
	                tabla.length - posicion - 1);
	        tabla[posicion] = nuevo;
	    }

	    Integer eliminar(int indice) {
	        Integer eliminado = null;
	        if (indice >= 0 && indice < tabla.length) {
	            eliminado = tabla[indice];
	            for (int i = indice + 1; i < tabla.length; i++) {
	                tabla[i - 1] = tabla[i];
	            }
	            tabla = Arrays.copyOf(tabla, tabla.length - 1);
	        }
	        return eliminado;
	    }

	    Integer get(int indice) {
	        Integer resultado = null;
	        if (indice >= 0 && indice < tabla.length) {//índice válido
	            resultado = tabla[indice];
	        }
	        return resultado;
	    }

	    int buscar(Integer claveBusqueda) {
	        int indice = -1;
	        for (int i = 0; i < tabla.length && indice == -1; i++) {
	            if (tabla[i].equals(claveBusqueda)) {//no vale tabla[i]==claveBusqueda
	                indice = i;
	            }
	        }
	        return indice;
	    }

	    public int numeroElementos() {
	        return tabla.length;
	    }

	    @Override
	    public void encolar(int nuevo) {
	        this.insertarFinal(nuevo); //encola al final de la lista
	    }

	    @Override
	    public int desencolar() {
	    	int elemento = this.get(0);
	    	
	    	this.eliminar(0);
	    	
	        return elemento; //desencola del principio de la lista
	    }
	    
	    @Override
	    public void apilar(int l) {
	        insertarFinal(l);
	    }

	    @Override
	    public int desapilar() { //se extrae el último elemento
	        return eliminar(tabla.length - 1);//null si pila vacía
	    }

	    @Override
	    public String toString() {
	        return Arrays.toString(tabla);
	    }

		@Override
		public void encolarCabeza(int nuevo) {
			this.insertarPrincipio(nuevo);
			
		}

		@Override
		public int desencolarFinal() {
			int elemento = this.get(this.numeroElementos() - 1);
			
			this.eliminar(this.numeroElementos() - 1);
			return elemento;
		}

		
}
