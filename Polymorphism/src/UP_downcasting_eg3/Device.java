package UP_downcasting_eg3;

public class Device {
	private String dname;
	private String dtype;
	
	public Device(String dname, String dtype) {
//		super();
		this.dname = dname;
		this.dtype = dtype;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
	

}
