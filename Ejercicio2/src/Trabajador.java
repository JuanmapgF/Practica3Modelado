
public abstract class Trabajador {
	private String nombre;
	private String numeroSeguridadSocial;
	protected double salario;

	public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
		this.nombre = nombre;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public double nomina() {
		return salario;
	}
	
	public abstract void incrementar();
	
}
