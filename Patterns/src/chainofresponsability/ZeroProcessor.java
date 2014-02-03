package chainofresponsability;

public class ZeroProcessor implements Chain {

	private Chain nextProcessor;

	@Override
	public void setNext(Chain chain) {
		this.nextProcessor = chain;
		
	}

	@Override
	public void process(Number number) {
		if(number.getValue() == 0) {
			System.out.println("Number is zero: "+number.getValue());
		} else {
			this.nextProcessor.process(number);	
		}
	}

}
