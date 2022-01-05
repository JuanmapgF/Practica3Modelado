import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Paciente {
	private List<Expediente> expedientes;
	private Expediente expedienteAbierto;
	
	public Paciente() {
		expedientes = new ArrayList<>();
	}
	
	public Expediente getExpedienteAbierto() {
		return expedienteAbierto;
	}
	
	public void setExpedienteAbierto(Expediente expedienteAbierto) {
		assert(expendientesContiene(expedienteAbierto));
		this.expedienteAbierto = expedienteAbierto;
	}

	protected void addExpediente(Expediente e) {
		expedientes.add(e);
	}
	
	public Enumeration<Expediente> getExpedientes() {
		return java.util.Collections.enumeration(expedientes);
	}
	
	private boolean expendientesContiene(Expediente e) {
		Enumeration<Expediente> it = this.getExpedientes();
		while(it.hasMoreElements()) {
			if(it.nextElement().equals(e)) {
				return true;
			}
		}
		return false;
	}

}
