package state;

import model.Applicant;

public class SubmissionState extends State{

	public SubmissionState(Applicant applicant) {
		super(applicant);
		applicant.setCurrentPhase("Gathering paperwork");
	}

	@Override
	public void changeState() {
		applicant.setState(new InterviewState(applicant));
		
	}

}
