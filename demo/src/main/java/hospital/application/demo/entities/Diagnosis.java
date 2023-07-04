package hospital.application.demo.entities;

import java.time.LocalDate;

public class Diagnosis extends PatientInformation{

	private int diagnosisId;
	private String diagnosis;
	private String diagnosticDetails;
	private LocalDate diagnosticHistory;
	
	public Diagnosis() {
		super();
	}

	public Diagnosis(int diagnosisId, String diagnosis, String diagnosticDetails, LocalDate diagnosticHistory) {
		super();
		this.diagnosisId = diagnosisId;
		this.diagnosis = diagnosis;
		this.diagnosticDetails = diagnosticDetails;
		this.diagnosticHistory = diagnosticHistory;
	}

	public int getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(int diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosticDetails() {
		return diagnosticDetails;
	}

	public void setDiagnosticDetails(String diagnosticDetails) {
		this.diagnosticDetails = diagnosticDetails;
	}

	public LocalDate getDiagnosticHistory() {
		return diagnosticHistory;
	}

	public void setDiagnosticHistory(LocalDate diagnosticHistory) {
		this.diagnosticHistory = diagnosticHistory;
	}
	
	
	
}
