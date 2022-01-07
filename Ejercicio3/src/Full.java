
public class Full implements Estado {

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		throw new RuntimeException("No se puede añadir una pieza a una bandeja llena.");
	}

	@Override
	public Pieza get(Bandeja bandeja) {
		Pieza pieza = bandeja.getFirstPieza();

		if(bandeja.size() == 1) {
			bandeja.setEstado(new Empty());
		}else {
			bandeja.setEstado(new Normal());
		}
		
		bandeja.removeFirstPieza();
		
		return pieza;
	}

}
