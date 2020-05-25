package court.citizens;

import java.util.HashSet;

import court.IAccuser;
import court.jurists.Lawyer;

public class Accuser extends LawyerClient implements IAccuser {

	public Accuser(String names, int age, String address, HashSet<Lawyer> lawyers) {
		
		super(names, age, address, lawyers);
		
	}

	@Override
	public void askQuestions() {
		
		for(Lawyer i : lawyers) {
			i.askQuestion();
		}
		
	}

}
