package state;

import model.Applicant;

public class InterviewState extends State {

	public InterviewState(Applicant applicant) {
		super(applicant);
		applicant.setCurrentPhase("Ongoing interview");
	}

	@Override
	public void changeState() {
		applicant.setState(new TestingState(applicant));
		
	}

}
