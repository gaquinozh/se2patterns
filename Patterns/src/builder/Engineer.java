package builder;

import builder.interfaces.IHouseBuilder;


public class Engineer {

	private IHouseBuilder houseBuilder;
	
	public Engineer(IHouseBuilder houseBuilder) {
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
