import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

public class Bandeja {
	private int capacidad;
	private List<Pieza> piezas;
	private Estado estado;
	
	public Bandeja(int capacidad) {
		if(capacidad < 1)
			throw new RuntimeException("No se puede crear una bandeja con capacidad cero o negativa.");
		
		this.capacidad = capacidad;
		this.piezas = new ArrayList<>();
		this.estado = new Empty();
	}
	
	public void put(Pieza pieza) {
		estado.put(pieza, this);
	}
	
	public Pieza get() {
		return estado.get(this);
	}
	
	public int size() {
		return capacidad;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Enumeration<Pieza> getPiezas() {
		return java.util.Collections.enumeration(piezas);
	}
	
	protected void addPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	protected Pieza getFirstPieza() {
		return piezas.get(0);
	}
	
	protected void removeFirstPieza() {
		piezas.remove(0);
	}
	
	protected int sizePiezas() {
	   	return piezas.size();
	}

}
