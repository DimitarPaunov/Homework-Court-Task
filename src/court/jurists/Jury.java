package court.jurists;

public class Jury extends Jurist {

	public Jury(String name, int exp, int cases) {
		
		super(name, exp, cases);
		this.position = "Jury";
		
	}

	@Override
	public void askQuestion() {
		System.out.println("What was the purpose of doing that ?");
		
	}

	@Override
	protected void takeNotes() {
		System.out.println("He doesn't know what he is talking !");
		
	}

}
