package edition1;

public class Exercise {
	
	private static final int MAXNUMBER = 50;
	private static Equation [] equation = new Equation[MAXNUMBER];

	
	public static void getAdditionExercise()
	{
		Equation equation1 = new Equation();
		
		for (int i = 0; i < MAXNUMBER; i++) {
			Equation equation2 = equation1.AdditionOperation();
			while(repeat(equation2,i-1))
			{
				equation2 = equation1.AdditionOperation();
			}
			equation[i] = equation2;
		}
		System.out.println("生成50道加法算式：");
		formatDisplay();
	}
	
	public static void getSubstractExercise()
	{
		Equation equation1 = new Equation();
		
		for (int i = 0; i < MAXNUMBER; i++) {
			Equation equation2 = equation1.SubstractOperation();
			while(repeat(equation2,i-1))
			{
				equation2 = equation1.SubstractOperation();
			}
			equation[i] = equation2;
		}
		System.out.println("生成50道减法算式：");
		formatDisplay();
	}
	
	public static void getBinaryExercise()
	{
		Equation equation1 = new Equation();
		
		for (int i = 0; i < MAXNUMBER; i++) {
			Equation equation2 = equation1.BinaryOperation();
			while(repeat(equation2,i-1))
			{
				equation2 = equation1.BinaryOperation();
			}
			equation[i] = equation2;
		}
		System.out.println("生成50道混合算式：");
		formatDisplay();
	}
	
	private static boolean repeat(Equation equation2, int length) {
		for(int i=0;i<=length;i++)
		{
			if(equation2.equal(equation[i]))
			{
				return true;
			}
		}
		return false;
	}
	
	private static void formatDisplay()
	{
		for (int i = 0; i < equation.length; i++) {
			System.out.print(equation[i]+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
		System.out.println("正确答案：");
		for (int i = 0; i < equation.length; i++) {
			System.out.print(equation[i].getValue()+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
	}
	
}
