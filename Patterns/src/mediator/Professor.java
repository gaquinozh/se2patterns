package mediator;

import mediator.interfaces.ICommunicate;
import mediator.interfaces.IDirector;

public class Professor implements ICommunicate {

	IDirector direktor;
	
	public Professor(IDirector direktor) {
		this.direktor = direktor;
	}
	
	@Override
	public void talk() {
		if(direktor.passedExam()) {
			System.out.println("Congratulations! But that test was to easy.");
		} else {
			System.out.println("Muahahahaha...");
		}
	}

}
