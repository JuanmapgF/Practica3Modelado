import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

public class Bandeja {
	private int capacidad;
	private List<Pieza> piezas;
	private Estado estado;
	
	public Bandeja(int capacidad) {
		if(capacidad < 1)	
			throw new MartilloException("La capacidad tiene que ser positiva");
		
		this.capacidad = capacidad;
		this.piezas = new ArrayList<>();
		this.estado = Empty.getInstance();
	}
	
	public void put(Pieza pieza) {
		if(pieza.getBandeja() != null)
			throw new MartilloException("La pieza ya est� en una bandeja");
		estado.put(pieza, this);
		pieza.setBandeja(this);
	}
	
	public Pieza get() {
		return estado.get(this);
	}
	
	public int size() {
		return capacidad;
	}

	protected void setEstado(Estado estado) {
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
