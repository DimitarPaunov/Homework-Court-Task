package court.jurists;

public class Lawyer extends Jurist {

	public Lawyer(String name, int exp, int cases) {
		
		super(name, exp, cases > 10 ? cases: 10);
		this.position = "Lawyer";
		
	}

	@Override
	public void askQuestion() {
		System.out.println("Why he was at the store at 3:00 am ?");
		
	}

	@Override
	protected void takeNotes() {
		System.out.println("His questions are useless");
		
	}

}
