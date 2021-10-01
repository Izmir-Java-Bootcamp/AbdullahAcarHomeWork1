package odev3;

public class Student {
	private String name;
	private long id;
	private double gpa;
	private PersonelData p;
	
	public Student(String name, long id, double gpa, PersonelData p) {
		super();
		this.name=name;
		this.id=id;
		this.gpa=gpa;
		this.p=p;
	}

	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", id=" + this.getId() + ", gpa=" + this.getGpa() + ", p=" + this.p + "]";
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	public PersonelData getP() {
		return p;
	}
	
}
