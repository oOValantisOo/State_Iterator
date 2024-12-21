package state;

import model.Applicant;

public abstract class State {
	protected Applicant applicant;
	
	public State(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	public abstract void changeState();
}
