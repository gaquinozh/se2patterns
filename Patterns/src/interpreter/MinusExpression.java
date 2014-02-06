package interpreter;

import interpreter.interfaces.IExpression;

public class MinusExpression implements IExpression {

	private IExpression left;
	private IExpression right;
	
	public MinusExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpret() {
		return this.left.interpret() - this.right.interpret();
	}

}
