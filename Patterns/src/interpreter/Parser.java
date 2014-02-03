package interpreter;

import java.util.Stack;

public class Parser {
	public static void main(String... args) {
		String token = "4 2 3 + +";
		Stack<IExpression> stack = new Stack<IExpression>();

		String[] tokenlist = token.split(" ");
		for (String s : tokenlist) {
			if(isOperator(s)) {
				IExpression leftExpression = stack.pop();
				IExpression rightExpression = stack.pop();
				IExpression operator = getOperatorInstance(s, leftExpression, rightExpression);
				int res = operator.interpret();
				stack.push(new NumberExpression(res));
			} else {
				stack.push(new NumberExpression(Integer.parseInt(s)));
			}
		}
		System.out.println("Result: "+stack.pop().interpret());
	}

	public static boolean isOperator(String s) {
		if(s.equals("+") || s.equals("-")) {
			return true;
		}
		return false;
	}

	public static IExpression getOperatorInstance(String s, IExpression left,
			IExpression right) {
		if(s.equals("+")) {
			return new PlusExpression(left, right);
		} else if(s.equals("-")) {
			return new MinusExpression(left, right);
		}
		return null;
	}
}
