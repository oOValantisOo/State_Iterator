package state;

import model.Applicant;

public class FinishState extends State{

	public FinishState(Applicant applicant) {
		super(applicant);
		applicant.setCurrentPhase("Done");
	}

	@Override
	public void changeState() {
		applicant.setState(null);
	}

}
