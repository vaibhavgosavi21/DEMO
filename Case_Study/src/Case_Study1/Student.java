package Case_Study1;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private Date dateofbirth;
	public Student(int id, String name, Date dateofbirth) {
		
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	

}
