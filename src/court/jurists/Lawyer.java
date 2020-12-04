package court.jurists;

public class Lawyer extends Jurist {

	public Lawyer(String name, int exp, int cases) throws InvalidLawyerCases {
		
		super(name, exp);
		if(cases < 10) {
			throw new InvalidLawyerCases();
		}
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
