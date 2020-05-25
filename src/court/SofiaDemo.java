package court;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


import court.citizens.Accuser;
import court.citizens.Citizen;
import court.citizens.Defendant;
import court.citizens.Witness;
import court.jurists.Judge;
import court.jurists.Jurist;
import court.jurists.Jury;
import court.jurists.Lawyer;
import court.jurists.Procecutor;

public class SofiaDemo {
	
	public static void main(String[] args) {
		
		//Creating sets for  different types of Jurists
		
		HashSet<Jury> jury = new HashSet<>();
		HashSet<Lawyer> lawyer = new HashSet<>();
		ArrayList<Judge> judge = new ArrayList<>();
		
		//Creating sets for the types of Citizens
		
		HashSet<Witness> witness = new HashSet<>();
		ArrayList<Accuser> accusers = new ArrayList<>();
		ArrayList<Defendant> defendants = new ArrayList<>();
		ArrayList<Procecutor> procecutor = new ArrayList<>();
		
		HashSet<Jurist> jurists = new HashSet<>();
		
		
		for (int i = 0; i < 3; i++) {
			judge.add(new Judge("Judge " +(i+1), 15, 30));
		}
		
		for (int i = 0; i < 2; i++) {
			jury.add(new Jury("Jury " +(i+1), 5, 8));
		}
		
		for (int i = 0; i < 2; i++) {
			lawyer.add(new Lawyer("Lawyer " +(i+1), 7, 20));
		}
		
		for (int i = 0; i < 2; i++) {
			procecutor.add(new Procecutor("Procecutor " +(i+1), 25, 320));
		}
		
		jurists.addAll(judge);
		jurists.addAll(jury);
		jurists.addAll(lawyer);
		jurists.addAll(procecutor);
		
		
		HashSet<Citizen> citizens = new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
			accusers.add(new Accuser("Accuser " +(i+1), 25, "Mihalkovo", lawyer));
		}
		
		for (int i = 0; i < 5; i++) {
		    defendants.add(new Defendant("Defendant " +(i+1), 22, "Vladkovo", lawyer));
		}
		
		for (int i = 0; i < 3; i++) {
			witness.add(new Witness("Witness " +(i+1), 30, "Strajarevo"));
		}
		
		citizens.addAll(accusers);
		citizens.addAll(defendants);
		citizens.addAll(witness);
		
		HashSet<Case> cases = new HashSet<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 2; i++) {
			
			cases.add(new CivilCase(judge.get(random.nextInt(judge.size())),
					jury, accusers.get(random.nextInt(accusers.size())), 
					witness, 
					defendants.get(random.nextInt(defendants.size()))));
			
		}
		
		for (int i = 0; i < 2; i++) {
			
			cases.add(new CriminalCase(judge.get(random.nextInt(judge.size())),
					jury,
					procecutor.get(random.nextInt(procecutor.size())),
					witness,
					defendants.get(random.nextInt(defendants.size()))));
		}
		
		for(Case i: cases) {
			
			if(i instanceof CivilCase) {
				System.out.println("\nStarting a new Civil Case ! \n");
			}else {
				System.out.println("\nStarting a new Criminal Case !\n");
			}
			
			i.execute();
		}
		
		System.out.println("\nChecking if the cases have increased after the Criminal cases and Civil cases\n");
		
		for(Jurist j : jurists) {
			System.out.println(j);
		}
		
		Court c = new Court("Sofia","Ekzarh Yosiv street number 3",jurists,cases);
		
		
		
		
		
	}

}
