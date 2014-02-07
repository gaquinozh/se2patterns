package mediator;

import mediator.interfaces.ICommunicate;
import mediator.interfaces.IDirector;

public class Student implements ICommunicate {

	private IDirector direktor;
	private boolean readyforexam;
	
	public Student(IDirector direktor, boolean readyforexam) {
		this.direktor = direktor;
		this.readyforexam = readyforexam;
	}
	
	@Override
	public void talk() {
		direktor.isReadyForExam(this.readyforexam);
		if(readyforexam == true)
			System.out.println("Yes...that was easy!");
		else
			System.out.println("I should improve my SE skills :(...");
	}

}
