
public class Biestable implements EstadoDispositivo {
	
	private EstadoBiestable estado;
	
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

	protected void setEstado(EstadoBiestable estado) {
		this.estado = estado;
	}

	@Override
	public void cambio(Dispositivo dispositivo) {
		dispositivo.setDispositivo(new Triestable(this));	
	}

}
