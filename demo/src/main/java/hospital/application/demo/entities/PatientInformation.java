package hospital.application.demo.entities;

import java.time.LocalDate;

public class PatientInformation {

	private int id;
	private String firstName;
	private String lastName;
	private long nationalyId;
	private LocalDate birthOfDate;
	
	public PatientInformation() {
		super();
	}

	public PatientInformation(int id, String firstName, String lastName, long nationalyId, LocalDate birthOfDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalyId = nationalyId;
		this.birthOfDate = birthOfDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(long nationalyId) {
		this.nationalyId = nationalyId;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	
}
