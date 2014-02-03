package visitor;

import visitor.interfaces.Visitable;
import visitor.interfaces.Visitor;

public class Book implements Visitable {

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
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
