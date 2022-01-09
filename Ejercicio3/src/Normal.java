
public class Normal implements Estado {

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		if(bandeja.sizePiezas() == bandeja.size() - 1) {
			bandeja.setEstado(new Full());
		}
		
		bandeja.addPieza(pieza);
	}

	@Override
	public Pieza get(Bandeja bandeja) {
		Pieza pieza = bandeja.getFirstPieza();
		
		if(bandeja.sizePiezas() == 1) {
			bandeja.setEstado(new Empty());
		}
		bandeja.removeFirstPieza();
		
		return pieza;
	}

}
