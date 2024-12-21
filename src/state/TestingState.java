package state;

import model.Applicant;

public class TestingState extends State {

	public TestingState(Applicant applicant) {
		super(applicant);
		if(applicant.getJobPreference().equals("Frontend Dev")) {
			applicant.setCurrentPhase("Designing UI/UX");
		} else {
			applicant.setCurrentPhase("Solving algorithm problems");
		}
	}

	@Override
	public void changeState() {
		applicant.setState(new FinishState(applicant));
		
	}

}
