package visitor;

import visitor.interfaces.IVisitor;


public class PostageVisitor implements IVisitor {

	private int totalPostageForCart;
	
	@Override
	public void visit(Book book) {
		if(book.getPrice() < 10) {
			totalPostageForCart += book.getWeight()*2;
		}
	}

	@Override
	public void visit(CD cd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DVD dvd) {
		// TODO Auto-generated method stub

	}
	
	public int getTotalPostage() {
		return totalPostageForCart;
	}

}
