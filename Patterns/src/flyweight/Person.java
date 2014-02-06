package flyweight;

import flyweight.interfaces.IPerson;

public class Person implements IPerson {
	
	private String name;
	@SuppressWarnings("unused")
	private String gender;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void tellGender(String gender) {
		System.out.println(gender);
	}
	
}
