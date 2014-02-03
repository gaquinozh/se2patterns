package mediator;

public class Student implements ICommunicate {

	private IDirektor direktor;
	private boolean readyforexam;
	
	public Student(IDirektor direktor, boolean readyforexam) {
		this.direktor = direktor;
		this.readyforexam = readyforexam;
	}
	
	@Override
	public void talk() {
		direktor.isReadyForExam(this.readyforexam);
		if(readyforexam == true)
			System.out.println("I will pass the exam!");
		else
			System.out.println("I should improve my SE skills :(...");
	}

}
