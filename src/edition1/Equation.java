package edition1;

import java.util.Random;

public class Equation {

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

	public void construct(int left, int right, char op) {
		this.leftNumber = left;
		this.rightNumber = right;
		this.operator = op;
		if (op == '+') {
			value = left + right;
		} else {
			value = left - right;
		}
	}

	public Equation AdditionOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(101);
		do {

			right = random.nextInt(101);
			result = left + right;

		} while (result > 100);

		Equation equation = new Equation();
		equation.construct(left, right, '+');
		return equation;

	}

	public Equation SubstractOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(101);
		do {

			right = random.nextInt(101);
			result = left - right;

		} while (result < 0);

		Equation equation = new Equation();
		equation.construct(left, right, '-');
		return equation;

	}

	public Equation BinaryOperation() {
		Random random = new Random();
		int left, right, result, operatorNumber;
		char operator = '+';
		left = random.nextInt(101);

		do {
			right = random.nextInt(101);
			operatorNumber = random.nextInt(2);
			if (operatorNumber == 0) {
				operator = '-';
				result = left - right;
			} else {
				operator = '+';
				result = left + right;
			}

		} while (result < 0 || result > 100);

		Equation equation = new Equation();
		equation.construct(left, right, operator);
		return equation;
	}

	public boolean equal(Equation equation) {
		boolean one = (leftNumber == equation.getLeftNumber() && rightNumber == equation.getRightNumber()
				&& operator == equation.getOperator());
		boolean two = (leftNumber == equation.getRightNumber() && rightNumber == equation.getLeftNumber()
				&& operator == equation.getOperator());
		return one || two;
	}

	public String toString() {
		return new Integer(leftNumber).toString() + new Character(operator).toString() + new Integer(rightNumber).toString() + "=";
	}
}
