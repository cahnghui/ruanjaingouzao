package edition2;

import java.util.Random;

public abstract class Equation2
{
	private int leftNumber;
	private int rightNumber;
	private char operator;
	private int value;

	public int getValue() {
		return value;
	}

	public int getLeftNumber() {
		return leftNumber;
	}

	public int getRightNumber() {
		return rightNumber;
	}

	public char getOperator() {
		return operator;
	}
	
	protected void generateBinaryOperation(char op)
	{
		Random random = new Random();
		int left = random.nextInt(101);
		int right,result;
		do {
			right = random.nextInt(101);
			result = calculate(left,right);
			
		} while (!checkCalculation(result));
		leftNumber = left;
		rightNumber = right;
		operator = op;
		value = result;
	}

	protected abstract boolean checkCalculation(int result);

	protected abstract int calculate(int left, int right);

	public boolean equals(Equation2 equation)
	{
		boolean one = (leftNumber == equation.getLeftNumber() && rightNumber == equation.getRightNumber()
				&& operator == equation.getOperator());
		boolean two = (leftNumber == equation.getRightNumber() && rightNumber == equation.getLeftNumber()
				&& operator == equation.getOperator());
		return one || two;
	}
	
	public String toString()
	{
		return new Integer(leftNumber).toString() + new Character(operator).toString() + new Integer(rightNumber).toString() + "=";
	}
}
