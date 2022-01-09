
public abstract class Trabajador {
	private static final int LENG_SEG_SOCIAL = 12; // En España la longitud del numero es 12
	private String nombre;
	private String numeroSeguridadSocial;
	protected double salario;

	public Trabajador(String nombre, String numeroSeguridadSocial, double salario) throws AssertionError {
		
		assert(salario>0); // Salario siempre positivo
		assert(numeroSeguridadSocial.length() == LENG_SEG_SOCIAL); // La longitud del numero de la seguridad social es igual al indicado por la constante
		
		this.nombre = nombre;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public double nomina() {
		return salario;
	}
	
	protected abstract void incrementar();
	
}
