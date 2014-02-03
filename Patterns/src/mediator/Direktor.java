package mediator;

// Concrete Mediator
public class Direktor implements IDirektor {

	@SuppressWarnings("unused")
	private Professor prof;
	@SuppressWarnings("unused")
	private Student stud;
	private boolean passed;
	
	@Override
	public void registerProfessor(Professor prof) {
		this.prof = prof;
	}

	@Override
	public void registerStudent(Student stud) {
		this.stud = stud;
	}

	@Override
	public boolean passedExam() {
		return passed;
	}

	@Override
	public void isReadyForExam(boolean passed) {
		this.passed = passed;
	}

}
