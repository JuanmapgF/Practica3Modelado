import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Profesional {
	private List<Acceso> accesos;
	
	public Profesional() {
		accesos = new ArrayList<>();
	}
	
	protected void addAcceso(Acceso acceso) {
		accesos.add(acceso);
	}
	
	public Enumeration<Acceso> getAcceso() {
		return java.util.Collections.enumeration(accesos);
	}
	
}
