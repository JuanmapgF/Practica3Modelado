
public class Verde implements Estado {
	
	private static Verde instance;
	
	private Verde() {
		Verde.instance = new Verde();
	}
	
	public static Verde getInstance() {
		if(Verde.instance == null) {
			Verde.instance = new Verde();
		}
		return instance;
	}

	@Override
	public void abrir(Biestable biestable) {}

	@Override
	public void cerrar(Biestable biestable) {
		biestable.setEstado(Rojo.getInstance());
	}

	@Override
	public String estado() {
		return "abierto";
	}

}
