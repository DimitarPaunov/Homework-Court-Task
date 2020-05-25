package court;

import java.util.HashSet;
import java.util.Random;

import court.citizens.Accuser;
import court.citizens.Defendant;
import court.citizens.Witness;
import court.jurists.Judge;
import court.jurists.Jury;
import court.jurists.Lawyer;

public abstract class Case {

	protected Judge judge;
	protected HashSet<Jury> jury;
	protected IAccuser accuser;
	protected HashSet<Witness> witnesses;
	protected Defendant defendant;

	public Case(Judge judge, HashSet<Jury> jury, IAccuser accuser, HashSet<Witness> witnesses, Defendant defendant) {

		this.judge = judge;
		this.jury = jury;
		this.accuser = accuser;
		this.witnesses = witnesses;
		this.defendant = defendant;
		
	}

	public void execute() {
		
		increaseXP();
		askQuetions();
		
		for(Lawyer j : defendant.getLawyers()) {
			
			System.out.println("He wasn't there at that time ! He was watching football at home !");
			
		}
		
		makeDecision();
		
	}

	private void makeDecision() {
		
		int guilty = 0;
		
		for(Jury i : jury) {
			
			if(new Random().nextBoolean()) {
				guilty++;
			}
			
		}
		
		if(guilty > jury.size() / 2) {
			makeVerdict();
		}else {
			System.out.println("\nThe Defendant is INNOCENT !");
		}
		
	}

	private void makeVerdict() {
		System.out.println("\nYou are locked in prison for " + (new Random().nextInt(37)+3) + " years !");
		
	}

	protected abstract void askQuetions();

	protected void increaseXP() {
		
		judge.increaseCases();
		
		for (Jury j : jury) {
			j.increaseCases();
		}
		for(Lawyer i : defendant.getLawyers()) {
			i.increaseCases();
		}

	}

	@Override
	public String toString() {
		return "Case [judge=" + judge + ", jury=" + jury + ", accuser=" + accuser + ", witnesses=" + witnesses
				+ ", defendant=" + defendant + "]";
	}

}
