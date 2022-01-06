
public class Activo extends Trabajador{

	public Activo(String nombre, String numeroSeguridadSocial, double salario) {
		super(nombre, numeroSeguridadSocial, salario);
	}

	public void incrementar() {
		super.salario = super.salario*1.02;
	}
	
}
