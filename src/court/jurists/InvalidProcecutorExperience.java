package court.jurists;

public class InvalidProcecutorExperience extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidProcecutorExperience() {
		super("The experience of the Procecutor should be at least 10 years!");
	}

}
