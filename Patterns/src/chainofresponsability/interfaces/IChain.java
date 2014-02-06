package chainofresponsability.interfaces;

import chainofresponsability.Number;

public interface IChain {
	public abstract void setNext(IChain chain);
	public abstract void process(Number number);
}
