package iterator;

import model.Applicant;

public interface Iterator {
	public Applicant getNext();
	public boolean hasNext();
}
