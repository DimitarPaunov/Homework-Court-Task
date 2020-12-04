package court.citizens;

import java.util.HashSet;

import court.jurists.Lawyer;

public abstract class Citizen {
	
	private String names;
	private int age;
	private String address;

	public Citizen(String names, int age, String address) {
		
		if(names != null && (!names.isEmpty())){
			this.names = names;
		}else
			System.out.println("Invalid names!");
		
		if(age > 15) {
			this.age = age;
		}else
			System.out.println("Invalid age!");
		
		if(address != null && (!address.isEmpty())) {
			this.address = address;
		}else
			System.out.println("Invalid address!");	
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((names == null) ? 0 : names.hashCode());
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
		Citizen other = (Citizen) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (names == null) {
			if (other.names != null)
				return false;
		} else if (!names.equals(other.names))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Citizens [names=" + names + ", age=" + age + ", address=" + address + ", lawyers=" + "]";
	}
}
