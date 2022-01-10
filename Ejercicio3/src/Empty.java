
public class Empty implements Estado{
	
	private static Empty instance;
	
	private Empty() {}
	
	public static Empty getInstance() {
		if(instance == null) {
			instance = new Empty();
		}
		return instance;
	}

	@Override
	public void put(Pieza pieza, Bandeja bandeja) {
		if(bandeja.size() > 1) {
			bandeja.setEstado(Normal.getInstance());
		}else if(bandeja.size() == 1) {
			bandeja.setEstado(Full.getInstance());
		}
		bandeja.addPieza(pieza);
	}
	
	@Override
	public Pieza get(Bandeja bandeja) {
		throw new MartilloException("No se puede coger una pieza de una bandeja vacia.");
	}
}
