package diapositiva41;

import java.util.ArrayList;
import java.util.List;

public abstract class Instrumento {
	
	private List<Nota> melodia;
	
	public Instrumento() {
		this.melodia = new ArrayList<Nota>();
	}
	
	public List<Nota> getMelodia() {
		return melodia;
	}

	public void setMelodia(List<Nota> melodia) {
		this.melodia = melodia;
	}
	
	public void add(Nota nota) {
		this.melodia.add(nota);
	}
	
	public abstract void interpretar(); //no hace nada, ya que no tiene corche y no añade una implementacion
	
	
	
	
    
}
