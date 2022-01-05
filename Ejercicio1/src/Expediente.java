import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Expediente {
	private List<Acceso> accesos;
	private Paciente paciente;
	
	public Expediente(Paciente paciente) {
		this.paciente = paciente;
		accesos = new ArrayList<>();
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	protected void addAcceso(Acceso acceso) {
		accesos.add(acceso);
	}
	
	public Enumeration<Acceso> getAcceso() {
		return java.util.Collections.enumeration(accesos);
	}
}
