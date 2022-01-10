
public class Normal implements Estado {
	
	private static Normal instance;
	
	private Normal() {};
	
	public static Normal getInstance() {
		if(instance == null) {
			instance = new Normal();
		}
		return instance;
	}

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		if(bandeja.sizePiezas() == bandeja.size() - 1) {
			bandeja.setEstado(Full.getInstance());
		}
		bandeja.addPieza(pieza);
	}

	@Override
	public Pieza get(Bandeja bandeja) {
		Pieza pieza = bandeja.getFirstPieza();
		pieza.setBandeja(null);
		if(bandeja.sizePiezas() == 1) {
			bandeja.setEstado(Empty.getInstance());
		}
		bandeja.removeFirstPieza();
		return pieza;
	}

}
