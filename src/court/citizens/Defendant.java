package court.citizens;

import java.util.HashSet;

import court.IAccuser;
import court.jurists.Lawyer;

public class Defendant extends LawyerClient  {

	public Defendant(String names, int age, String address, HashSet<Lawyer> lawyers) {
		
		super(names, age, address, lawyers);
		
	}

		
}
	
