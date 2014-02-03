package builder;

import builder.interfaces.HouseBuilder;

public class Engineer {

	private HouseBuilder houseBuilder;
	
	public Engineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
	
	public void constructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildInterior();
	}
	
}
