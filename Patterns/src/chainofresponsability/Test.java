package chainofresponsability;

public class Test {
	public static void main(String...args) {
		Chain c1 = new PositiveProcessor();
		Chain c2 = new ZeroProcessor();
		Chain c3 = new NegativeProcessor();
		c1.setNext(c2);
		c2.setNext(c3);
		
		c1.process(new Number(99));
		c1.process(new Number(-30));
		c1.process(new Number(0));
		c1.process(new Number(100));
	}
}
