package mediator;

import mediator.interfaces.IDirector;

public class Test {

	public static void main(String[] args) {
		IDirector direktor = new Director();
		Student giusi_then = new Student(direktor, false); // Boolean isreadyforexam
		Student giusi_now = new Student(direktor, true);
		Professor rudin = new Professor(direktor);
		
		// Not passed exam
		giusi_then.talk();
		rudin.talk();
		
		// Passed Exam
		giusi_now.talk();
		rudin.talk();
	}

}
