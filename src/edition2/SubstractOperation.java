package edition2;

public class SubstractOperation extends Equation2 {

	public SubstractOperation()
	{
		generateBinaryOperation('-');
	}
	@Override
	protected boolean checkCalculation(int result) {
		// TODO Auto-generated method stub
		return result>=0;
	}

	@Override
	protected int calculate(int left, int right) {
		// TODO Auto-generated method stub
		return left-right;
	}

}
