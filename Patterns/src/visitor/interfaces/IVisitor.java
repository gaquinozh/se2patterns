package visitor.interfaces;

import visitor.Book;
import visitor.CD;
import visitor.DVD;


public interface IVisitor {

	public void visit(Book book);
	public void visit(CD cd);
	public void visit(DVD dvd);
	
}
