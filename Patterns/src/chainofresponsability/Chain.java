package chainofresponsability;

public interface Chain {
	public abstract void setNext(Chain chain);
	public abstract void process(Number number);
}
