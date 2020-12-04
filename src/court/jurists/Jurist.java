package court.jurists;

public abstract class Jurist {

	private String name;
	protected String position;
	private int exp;
	private int cases;
	
	public Jurist(String name, int exp, int cases) throws InvalidJuryExperience {
		
		this(name, cases);
		if(exp < 1) {
			throw new InvalidJuryExperience();
		}
		
	}
	public Jurist(String name, int cases) {
		
		if(name != null && (!name.isEmpty())) {
			this.name = name;
		}else
			System.out.println("Invalid name!");
		if(cases > 0) {
			this.cases = cases;
		}else
			System.out.println("Invalid experince or cases!");
		
	}
	
	protected abstract void askQuestion();
	
	protected abstract void takeNotes();
	
	public void increaseCases() {
		this.cases++;
	}
	
	@Override
	public String toString() {
		return "Jurist [name=" + name + ", position=" + position + ", exp=" + exp + ", cases=" + cases + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cases;
		result = prime * result + exp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jurist other = (Jurist) obj;
		if (cases != other.cases)
			return false;
		if (exp != other.exp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
	
	public int getCases() {
		return cases;
	}
	
	
}
