package flyweight;

import flyweight.interfaces.IPerson;

public class Test {

	public static void main(String...args){
		PersonFactory factory = new PersonFactory();
		IPerson person1 = factory.getPerson("Giuseppe Aquino");
		System.out.println(person1);
		IPerson person2 = factory.getPerson("Giuseppe Aquino");
		System.out.println(person2);
		person1.tellGender(person1.getName() + " is male");
		person2.tellGender(person2.getName() + " is female");
	}
	
}
