package court;

import java.util.ArrayList;
import java.util.Random;

public interface IAccuser {
	
	ArrayList<String> questions = new ArrayList<>();
	
	static String getRandomQuestions() {
		
		return questions.get(new Random().nextInt(questions.size()));
	}
	
	void askQuestions();

}
