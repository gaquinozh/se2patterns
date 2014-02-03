package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> stateList = new ArrayList<Memento>();
	
	public void addMemento(Memento mem) {
		stateList.add(mem);
	}

	public Memento getMemento(int i) {
		return stateList.get(i);
	}
}
