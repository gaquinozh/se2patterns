package flyweight;

public class Test {

	public static void main(String...args){
		PersonFactory factory = new PersonFactory();
		PersonInterface person1 = factory.getPerson("Giuseppe Aquino");
		System.out.println(person1);
		PersonInterface person2 = factory.getPerson("Giuseppe Aquino");
		System.out.println(person2);
		person1.tellGender(person1.getName() + " is male");
		person2.tellGender(person2.getName() + " is female");
	}
	
}
