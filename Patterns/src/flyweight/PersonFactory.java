package flyweight;

import java.util.ArrayList;

import flyweight.interfaces.IPerson;

public class PersonFactory {

	private ArrayList<IPerson> pool;
	
	public PersonFactory() {
		pool = new ArrayList<IPerson>();
	}
	
	public IPerson getPerson(String name) {
		for(IPerson p : pool) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		IPerson p = new Person(name);
		pool.add(p);
		return p;
	}
	
}
