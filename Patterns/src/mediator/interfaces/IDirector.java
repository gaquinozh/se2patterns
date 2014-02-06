package mediator.interfaces;

import mediator.Professor;
import mediator.Student;

// MediatorInterface
public interface IDirector {

	public void registerProfessor(Professor prof);

	public void registerStudent(Student stud);

	public boolean passedExam();

	public void isReadyForExam(boolean status);

}
