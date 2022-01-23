
public class Dispositivo {
	
	private EstadoDispositivo dispositivo;
	private boolean cambio;
	
	public Dispositivo(EstadoDispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public void abrir() {
		dispositivo.abrir();
		if(this.getCambio()) {
			dispositivo.cambio(this);
			this.setCambio(false);
		}
	}

	public void cerrar() {
		dispositivo.cerrar();
		if(this.getCambio()) {
			dispositivo.cambio(this);
			this.setCambio(false);
		}
	}

	public String estado() {
		return dispositivo.estado();
	}

	public void cambio() {
		dispositivo.cambio(this);
	}

	public EstadoDispositivo getDispositivo() {
		return dispositivo;
	}

	protected void setDispositivo(EstadoDispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public boolean getCambio() {
		return cambio;
	}

	protected void setCambio(boolean cambio) {
		this.cambio = cambio;
	}	

}
