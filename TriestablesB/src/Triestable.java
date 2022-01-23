
public class Triestable {
	private Biestable biestable;
	private Estado estado;
	
	public Triestable() {
		biestable = new Biestable();
		estado = biestable.getEstado();
	}
	
	public void abrir() {
		if(estado instanceof Rojo) {
			this.setEstado(Amarillo.getInstance());
		} else {
			estado.abrir(biestable);
			this.setEstado(biestable.getEstado());
		}
	}
	
	public void cerrar() {
		if(estado instanceof Verde) {
			this.setEstado(Amarillo.getInstance());
		} else {
			estado.cerrar(biestable);
			this.setEstado(biestable.getEstado());
		}
	}
	
	public String estado() {
		return estado.estado();
	}

	public Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

}
