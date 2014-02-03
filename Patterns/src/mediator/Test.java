package mediator;

public class Test {

	public static void main(String[] args) {
		IDirektor direktor = new Direktor();
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
