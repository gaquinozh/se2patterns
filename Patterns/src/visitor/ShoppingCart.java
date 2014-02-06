package visitor;

import java.util.ArrayList;

import visitor.interfaces.IVisitable;

public class ShoppingCart {

	private ArrayList<IVisitable> items = new ArrayList<IVisitable>();
	
	public void addItem(IVisitable v) {
		items.add(v);
	}
	
	public int calculatePostage() {
		PostageVisitor visitor = new PostageVisitor();
		for(IVisitable item : items) {
			item.accept(visitor);
		}

		int total = visitor.getTotalPostage();
		return total;
	}

}
