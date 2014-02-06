package chainofresponsability;

import chainofresponsability.interfaces.IChain;

public class Test {
	public static void main(String...args) {
		IChain c1 = new PositiveProcessor();
		IChain c2 = new ZeroProcessor();
		IChain c3 = new NegativeProcessor();
		c1.setNext(c2);
		c2.setNext(c3);
		
		c1.process(new Number(99));
		c1.process(new Number(-30));
		c1.process(new Number(0));
		c1.process(new Number(100));
	}
}
