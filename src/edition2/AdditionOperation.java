package edition2;

public class AdditionOperation extends Equation2{

	public AdditionOperation()
	{
		generateBinaryOperation('+');
	}
	@Override
	protected int calculate(int left, int right) {
		return left+right;
	}@Override
	protected boolean checkCalculation(int result) {
		return result<=100;
	}
}
