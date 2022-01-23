
public class Biestable {
	
	private Estado estado;
	
	public Biestable() {
		estado = Rojo.getInstance();
	}
	
	public void abrir() {
		estado.abrir(this);
	}
	
	public void cerrar() {
		estado.cerrar(this);
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
