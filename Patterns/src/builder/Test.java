package builder;

import builder.interfaces.IHouseBuilder;


public class Test {

	public static void main(String[] args) {
		IHouseBuilder builder = new IglooBuilder();
		Engineer stgallerin = new Engineer(builder);
		stgallerin.constructHouse();
		House house = stgallerin.getHouse();
		System.out.println(house.toString());
	}

}
