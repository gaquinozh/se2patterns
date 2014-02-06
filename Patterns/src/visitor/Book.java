package visitor;

import visitor.interfaces.IVisitable;
import visitor.interfaces.IVisitor;


public class Book implements IVisitable {

	private int price;
	private int weight;
	
	public Book(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}
	
	public int getWeight() {
		return weight;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
}
