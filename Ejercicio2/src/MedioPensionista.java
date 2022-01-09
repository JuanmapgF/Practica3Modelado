
public class MedioPensionista extends Trabajador{
	
	private Activo activo;
	private Pensionista pensionista;
	
	public MedioPensionista(String nombre, String numeroSeguridadSocial, double salarioActivo, double salarioPensionista) {
		super(nombre, numeroSeguridadSocial, salarioActivo + salarioPensionista);

		this.activo = new Activo(nombre, numeroSeguridadSocial, salarioActivo);
		this.pensionista = new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista);
	}

	@Override
	protected void incrementar() {
		this.activo.incrementar();
		this.pensionista.incrementar();
		super.salario = this.activo.nomina() + this.pensionista.nomina();
	}

}
