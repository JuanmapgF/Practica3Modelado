
public class Amarillo implements Estado {
	
	private static Amarillo instance;
	
	private Amarillo() {
		Amarillo.instance = new Amarillo();
	}
	
	public static Amarillo getInstance() {
		if(Amarillo.instance == null) {
			Amarillo.instance = new Amarillo();
		}
		return instance;
	}

	@Override
	public void abrir(Biestable biestable) {
		biestable.abrir();
	}

	@Override
	public void cerrar(Biestable biestable) {
		biestable.cerrar();
	}

	@Override
	public String estado() {
		return "precaucion";
	}

}
