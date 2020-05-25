package court.jurists;

import court.IAccuser;

public class Procecutor extends Jurist implements IAccuser {

	public Procecutor(String name, int exp, int cases) {
		
		super(name, exp > 10 ? exp: 10, cases);
		this.position = "Procecutor";
		
	}

	@Override
	protected void askQuestion() {
		System.out.println("Please be quite , I am entering !");
		
	}

	@Override
	protected void takeNotes() {
		System.out.println("These people are not listening !");
		
	}

	@Override
	public void askQuestions() {
		System.out.println("Is that true sir ?");
		
	}

	

}
