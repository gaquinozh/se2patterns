package prototype;

import prototype.concreteprototypes.Movie;

public class Tester {

	public static void main(String...args) {
		Movie a = new Movie();
		a.setName("Test");
		Movie b = null;
		try {
			b = a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("A is "+ a);
		b.setName("LOL");
		System.out.println("B clone of A "+b);
		
	}
	
}
