package interpreter;

import interpreter.interfaces.IExpression;

public class NumberExpression implements IExpression{

	private int value;
	
	public NumberExpression(int value) {
		this.value = value;
	}
	
	@Override
	public int interpret() {
		return value;
	}

}
