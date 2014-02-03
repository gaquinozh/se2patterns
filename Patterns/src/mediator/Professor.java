package mediator;

public class Professor implements ICommunicate {

	IDirektor direktor;
	
	public Professor(IDirektor direktor) {
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
