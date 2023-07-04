package hospital.application.demo.entities;

public class Verify extends PatientInformation{
	
	private int password;
	private int rePassword;
	
	public Verify() {
		super();
	}

	public Verify(int password, int rePassword) {
		super();
		this.password = password;
		this.rePassword = rePassword;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getRePassword() {
		return rePassword;
	}

	public void setRePassword(int rePassword) {
		this.rePassword = rePassword;
	}

}
