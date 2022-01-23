
public interface EstadoDispositivo {
	public abstract void abrir();
	
	public abstract void cerrar();
	
	public abstract String estado();
	
	public abstract void cambio(Dispositivo dispositivo);
}
