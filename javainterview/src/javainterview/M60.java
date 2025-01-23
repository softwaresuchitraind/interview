package javainterview;

import java.util.Stack;

/*
 * "10 + 45/9 - 2", Evaluate the string expression using java program
 * */
public class M60
{
	public static void main(String[] args)
	{
		String expression = "10 + 45/9 - 2";
		double result = evaluateExpression(expression);
		System.out.println(result);
	}

	private static double evaluateExpression(String expression)
	{
		//Remove Spaces from the expression
		expression = expression.replaceAll("//s", "");
		
		//stack for numbers and operators
		Stack<Double> numbers = new Stack<>();
		Stack<Character> operators = new Stack<>();
		
		//parse the expression
		for(int i=0;i<expression.length();i++)
		{
			char c = expression.charAt(i);
		}
		return 0;
	}
}
