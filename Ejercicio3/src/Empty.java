
public class Empty implements Estado{

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		if(bandeja.size() > 1) {
			bandeja.setEstado(new Normal());
		}else if(bandeja.size() == 1) {
			bandeja.setEstado(new Full());
		}
		
		bandeja.addPieza(pieza);;
	}
	
	@Override
	public Pieza get(Bandeja bandeja) {
		throw new RuntimeException("No se puede coger una pieza de una bandeja vacia.");
	}
}
