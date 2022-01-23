
public class B {
	private Service service;
	
	public B(Service service) {
		this.service = service;
	}

	public void rutina1() {
		service.rutina1();		
	}

	public void rutina2(Double y) {
		service.rutina2(y);
	}

	public Boolean rutina3(Integer i) {
		return service.rutina3(i);
	}

	public Integer rutina4() {
		return service.rutina4();
	}
}
