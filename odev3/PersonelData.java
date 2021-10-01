package odev3;
import java.time.LocalDate;
public class PersonelData {
	
	private LocalDate birtDate;
	private String address;
	private long ssn;
	
	public PersonelData(LocalDate birtDate, long ssn) {
		super();
		
		this.birtDate=birtDate;
		this.ssn=ssn;
	}
	
	public PersonelData(int year,int mount, int day,long ssn ) {
		super();
		this.birtDate=LocalDate.of(year, mount, day);
		this.ssn=ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirtDate() {
		return birtDate;
	}

	public long getSsn() {
		return ssn;
	}
	
}
