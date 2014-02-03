package builder;

import builder.concretebuilder.IglooBuilder;
import builder.interfaces.HouseBuilder;

public class Test {

	public static void main(String[] args) {
		HouseBuilder builder = new IglooBuilder();
		Engineer stgallerin = new Engineer(builder);
		stgallerin.constructHouse();
		House house = stgallerin.getHouse();
		System.out.println(house.toString());
	}

}
