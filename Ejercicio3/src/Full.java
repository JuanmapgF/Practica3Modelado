
public class Full implements Estado {
	
	private static Full instance;
	
	private Full() {}
	
	public static Full getInstance() {
		if(instance == null) {
			instance = new Full();
		}
		return instance;
	}

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		throw new MartilloException("No se puede añadir una pieza a una bandeja llena.");
	}

	@Override
	public Pieza get(Bandeja bandeja) {
		Pieza pieza = bandeja.getFirstPieza();
		pieza.setBandeja(null);
		if(bandeja.size() == 1) {
			bandeja.setEstado(Empty.getInstance());
		}else {
			bandeja.setEstado(Normal.getInstance());
		}
		bandeja.removeFirstPieza();
		return pieza;
	}

}
