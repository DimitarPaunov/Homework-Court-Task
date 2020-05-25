package court;

import java.util.HashSet;

import court.citizens.Accuser;
import court.citizens.Defendant;
import court.citizens.Witness;
import court.jurists.Judge;
import court.jurists.Jury;
import court.jurists.Lawyer;

public class CivilCase extends Case {

	public CivilCase(Judge judge, HashSet<Jury> jury, Accuser accuser, HashSet<Witness> witnesses,
			Defendant defendant) {
		
		super(judge, jury, accuser, witnesses, defendant);
		
	}

	@Override
	protected void askQuetions() {
		
		this.judge.askQuestion();
		
		for(Jury j : jury) {
			j.askQuestion();
		}
		
		for(Lawyer i : ((Accuser) accuser).getLawyers()) {
			i.askQuestion();
		}
    
	}
	
	
}
