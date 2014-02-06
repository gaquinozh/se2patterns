package interpreter;

import interpreter.interfaces.IExpression;

public class PlusExpression implements IExpression {

	private IExpression left;
	private IExpression right;
	
	public PlusExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpret() {
		return this.left.interpret() + this.right.interpret();
	}
	
}
