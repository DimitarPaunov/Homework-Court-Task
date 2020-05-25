package court.jurists;

public class Judge extends Jurist {

	public Judge(String name, int exp, int cases) {
		
		super(name, exp > 5 ? exp: 5, cases);
		this.position = "Judge";
		
	}

	public void askQuestion() {
		System.out.println("What happened on that day ?");
		
	}

	@Override
	protected void takeNotes() {
		System.out.println("He is lying !");
		
	} 

}
