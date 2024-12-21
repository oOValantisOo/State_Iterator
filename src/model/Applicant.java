package model;

import state.State;
import state.SubmissionState;

public class Applicant {
	private String ApplicantName;
	private String ApplicantCode;
	private String JobPreference;
	private String CurrentPhase;
	private State state;
	private Integer JobExperience;
	
	public Applicant(String applicantName, String applicantCode, String jobPreference, Integer jobExperience) {
		super();
		ApplicantName = applicantName;
		ApplicantCode = applicantCode;
		JobPreference = jobPreference;
		this.state = new SubmissionState(this);
		JobExperience = jobExperience;
	}

	public String getApplicantName() {
		return ApplicantName;
	}

	public void setApplicantName(String applicantName) {
		ApplicantName = applicantName;
	}

	public String getApplicantCode() {
		return ApplicantCode;
	}

	public void setApplicantCode(String applicantCode) {
		ApplicantCode = applicantCode;
	}

	public String getJobPreference() {
		return JobPreference;
	}

	public void setJobPreference(String jobPreference) {
		JobPreference = jobPreference;
	}

	public String getCurrentPhase() {
		return CurrentPhase;
	}

	public void setCurrentPhase(String currentPhase) {
		CurrentPhase = currentPhase;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getJobExperience() {
		return JobExperience;
	}

	public void setJobExperience(Integer jobExperience) {
		JobExperience = jobExperience;
	}
	
	public void displayInformation() {
		System.out.println("Code: " + this.ApplicantCode);
		System.out.println("Name: " + this.ApplicantName);
		System.out.println("Experience: " + this.JobExperience);
		System.out.println("Preference: " + this.JobPreference);
		System.out.println("Current Phase: " + this.CurrentPhase);
	}
	
}
