package chainofresponsability;

import chainofresponsability.interfaces.IChain;

public class NegativeProcessor implements IChain {

	private IChain nextProcessor;
	
	@Override
	public void setNext(IChain chain) {
		this.nextProcessor = chain;
	}

	@Override
	public void process(Number number) {
		if(number.getValue() < 0) {
			System.out.println("Number is negative: "+number.getValue());
		} else {
			this.nextProcessor.process(number);
		}
	}

}
