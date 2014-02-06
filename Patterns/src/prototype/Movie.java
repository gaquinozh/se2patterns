package prototype;

import prototype.interfaces.IPrototype;


public class Movie implements IPrototype {
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
