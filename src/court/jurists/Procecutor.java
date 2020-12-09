package court.jurists;

import court.IAccuser;

public class Procecutor extends Jurist implements IAccuser {

	public Procecutor(String name, int exp, int cases) throws InvalidProcecutorExperience {
		
		super(name, cases);
		if(exp < 10) {
			throw new InvalidProcecutorExperience();
		}else {
			this.exp = exp;
		}
		this.position = "Procecutor";
		
	}

	@Override
	public void askQuestion() {
		System.out.println("Please be quite , I am entering !");
		
	}

	@Override
	protected void takeNotes() {
		System.out.println("These people are not listening !");
		
	}

}
