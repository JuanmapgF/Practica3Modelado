
public class Rojo implements Estado {
	
	private static Rojo instance;
	
	private Rojo() {
		Rojo.instance = new Rojo();
	}
	
	public static Rojo getInstance() {
		if(Rojo.instance == null) {
			Rojo.instance = new Rojo();
		}
		return instance;
	}

	@Override
	public void abrir(Biestable biestable) {
		biestable.setEstado(Verde.getInstance());
	}

	@Override
	public void cerrar(Biestable biestable) {}

	@Override
	public String estado() {
		return "cerrado";
	}

}