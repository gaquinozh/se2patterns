package prototype.concreteprototypes;

import prototype.interfaces.Prototype;

public class Movie implements Prototype {
	private String name = null;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie");;
		return (Movie) super.clone();
	}
	
	@Override 
	public String toString() {
		return "Title " +this.name;
	}
	

}
