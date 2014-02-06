package proxy;

import proxy.interfaces.IAnimal;

public class Lion implements IAnimal {

	@Override
	public void getSound() {
		System.out.println("Rooooar!");
	}

}
