
public class Triestable implements EstadoDispositivo {
	private Biestable biestable;
	private Estado estado;
	
	public Triestable() {
		biestable = new Biestable();
		estado = biestable.getEstado();
	}
	
	public Triestable(Biestable biestable) {
		this.biestable = biestable;
		this.estado = this.biestable.getEstado();
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

	@Override
	public void cambio(Dispositivo dispositivo) {
		if(estado instanceof Amarillo) {
			dispositivo.setCambio(true);
		} else {
			dispositivo.setDispositivo(this.biestable);
		}
	}

}
