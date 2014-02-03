package memento;

public class Test {
	public static void main(String ... args) {
		Originator origin = new Originator();
		origin.setState("Lion");
		Memento m = origin.createMemento();
		CareTaker careTaker = new CareTaker();
		careTaker.addMemento(m);
		
		origin.setState("Piss Vogel");
		origin.setState("Orangutang");
		m = origin.createMemento();
		careTaker.addMemento(m);
		origin.setState("Elephant");
		System.out.println("Current state is "+ origin.getState());
		origin.setMemento(careTaker.getMemento(1)); // Restoring to last Memento shot!
		System.out.println("Current state is "+ origin.getState());
	}
}
