package flyweight;

import java.util.ArrayList;

public class PersonFactory {

	private ArrayList<PersonInterface> pool;
	
	public PersonFactory() {
		pool = new ArrayList<PersonInterface>();
	}
	
	public PersonInterface getPerson(String name) {
		for(PersonInterface p : pool) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		PersonInterface p = new Person(name);
		pool.add(p);
		return p;
	}
	
}
