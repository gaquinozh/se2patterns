package visitor;

import java.util.ArrayList;

import visitor.interfaces.Visitable;

public class ShoppingCart {

	private ArrayList<Visitable> items = new ArrayList<Visitable>();
	
	public void addItem(Visitable v) {
		items.add(v);
	}
	
	public int calculatePostage() {
		PostageVisitor visitor = new PostageVisitor();
		for(Visitable item : items) {
			item.accept(visitor);
		}

		int total = visitor.getTotalPostage();
		return total;
	}

}
