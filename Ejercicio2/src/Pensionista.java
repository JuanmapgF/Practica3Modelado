
public class Pensionista extends Trabajador{
	
	public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
		super(nombre, numeroSeguridadSocial, salario);
	}

	public void incrementar() {
		super.salario = super.salario*1.04;
	}
}
