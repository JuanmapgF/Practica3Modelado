
public class Activo extends Trabajador{

	public Activo(String nombre, String numeroSeguridadSocial, double salario) {
		super(nombre, numeroSeguridadSocial, salario);
	}

	@Override
	protected void incrementar() {
		super.salario *= 1.02;
	}
	
}
