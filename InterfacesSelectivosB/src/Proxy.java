
public class Proxy implements Service {
	private Object object;
	private Service service;
	
	public Proxy(Object object) {
		this.object = object;
		service = new X();
	}

	@Override
	public void rutina1() {
		service.rutina1();		
	}

	@Override
	public void rutina2(Double y) {
		if(object instanceof A || object instanceof B) {
			service.rutina2(y);
		} else {
			throw new ProxyException("ERROR: no tienes permisos para realizar la rutina2");
		}
	}

	@Override
	public Boolean rutina3(Integer i) {
		if(object instanceof A || object instanceof C) {
			return service.rutina3(i);
		} else {
			throw new ProxyException("ERROR: no tienes permisos para realizar la rutina3");
		}
	}

	@Override
	public Integer rutina4() {
		throw new ProxyException("ERROR: no tienes permisos para realizar la rutina4");
	}

}
