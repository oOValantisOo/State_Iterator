package iterator;

import java.util.ArrayList;

import model.Applicant;

public class ApplicantIterator implements Iterator{
	protected ArrayList<Applicant> applicants;
	protected Integer index;
	
	
	public ApplicantIterator(ArrayList<Applicant> applicants) {
		super();
		this.applicants = applicants;
		index = 0;
	}

	@Override
	public Applicant getNext() {
		if(hasNext()) {
			Applicant applicant = applicants.get(index++);
			return applicant;
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return index < applicants.size();
	}

}
