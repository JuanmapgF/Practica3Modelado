import java.util.Date;

public class Acceso {
	private Profesional profesional;
	private Expediente expediente;
	private Date fecha;
	private TipoAcceso tipo;
	
	public Acceso(Profesional profesional, Expediente expediente, Date fecha, TipoAcceso tipo) {		
		this.profesional = profesional;
		this.expediente = expediente;
		this.fecha = fecha;
		this.tipo = tipo;
		profesional.addAcceso(this);
		expediente.addAcceso(this);
	}
	
	public Profesional getProfesional() {
		return profesional;
	}
	public Expediente getExpediente() {
		return expediente;
	}
	public Date getFecha() {
		return fecha;
	}
	public TipoAcceso getTipo() {
		return tipo;
	}
	private boolean noFechasFuturas(Date fecha) {
		return fecha.compareTo(new Date()) <= 0;
	}
}
