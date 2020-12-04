package court.jurists;

public class InvalidJudgeExperience extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidJudgeExperience() {
		super("The experience of the Judge should be at least 5 years!");
	}

}
