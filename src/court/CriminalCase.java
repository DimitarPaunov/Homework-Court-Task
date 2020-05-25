package court;

import java.util.HashSet;

import court.citizens.Defendant;
import court.citizens.Witness;
import court.jurists.Judge;
import court.jurists.Jury;
import court.jurists.Lawyer;
import court.jurists.Procecutor;

public class CriminalCase extends Case {

	public CriminalCase(Judge judge, HashSet<Jury> jury, Procecutor accuser, HashSet<Witness> witnesses,
			Defendant defendant) {
		
		super(judge, jury, accuser, witnesses, defendant);
		
	}
	@Override
	protected void increaseXP() {
		
		super.increaseXP();
		((Procecutor)this.accuser).increaseCases();
		
	}
	
	@Override
	protected void askQuetions() {
		
		this.judge.askQuestion();
		
		for(Jury j : jury) {
			j.askQuestion();
		}
		
		this.accuser.askQuestions();
		
	}
	

}
