package court;

import java.util.ArrayList;
import java.util.HashSet;

import court.jurists.Jurist;

public class Court {
	
	private String name;
	private String address;
	private HashSet<Jurist> jurists;
	private HashSet<Case> cases;
	
	public Court(String name, String address, HashSet<Jurist> jurists, HashSet<Case> cases) {
		
		if(name != null && (!name.isEmpty())) {
			this.name = name;
		}else
			System.out.println("Invalid name!");
		
		if(address != null && (!address.isEmpty())) {
			this.address = address;
		}else
			System.out.println("Invalid address!");
		
	    if(jurists != null && cases != null) {
			this.jurists = jurists;
			this.cases = cases;
	    }else
	    	System.out.println("Invalid list of Jurists or Cases!");
	    
	}

	@Override
	public String toString() {
		return "Court [name=" + name + ", address=" + address + ", lica=" + jurists + ", dela=" + cases + "]";
	}
	
	
	

}
