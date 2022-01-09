
public class Pensionista extends Trabajador{
	
	public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
		super(nombre, numeroSeguridadSocial, salario);
	}

	@Override
	protected void incrementar() {
		super.salario *= 1.04;
	}
}
