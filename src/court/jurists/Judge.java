package court.jurists;

public class Judge extends Jurist {

	public Judge(String name, int exp, int cases) throws InvalidJudgeExperience {
		
		super(name, cases);
			if(exp < 5) {
				throw new InvalidJudgeExperience();
			}else {
				this.exp = exp;
			}
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
