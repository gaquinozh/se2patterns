package mediator;

// MediatorInterface
public interface IDirektor {

	public void registerProfessor(Professor prof);

	public void registerStudent(Student stud);

	public boolean passedExam();

	public void isReadyForExam(boolean status);

}
