package visitor;

public class Test {
	public static void main(String ... args) {
		ShoppingCart cart = new ShoppingCart();
		Book a = new Book(20,3);
		Book b = new Book(10,3);
		Book c = new Book(5,3);
		cart.addItem(a);
		cart.addItem(b);
		cart.addItem(c);
		int total = cart.calculatePostage();
		
		System.out.println(total);
	}
}
