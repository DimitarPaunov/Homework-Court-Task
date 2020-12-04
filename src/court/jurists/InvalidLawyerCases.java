package court.jurists;

public class InvalidLawyerCases extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidLawyerCases() {
		
		super("The cases of the Lawyers should be at least 10 !");
		
	}

}
