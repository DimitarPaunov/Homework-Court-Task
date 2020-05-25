package court.citizens;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import court.jurists.Lawyer;

public abstract class LawyerClient extends Citizen {

	protected HashSet<Lawyer> lawyers;
	
	public LawyerClient(String names, int age, String address, HashSet<Lawyer> lawyers) {
		
		super(names, age, address);
		this.lawyers = lawyers;
		
	}
	
	public Set<Lawyer> getLawyers() {
		return Collections.unmodifiableSet(lawyers);
	}

}
