package edition2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercise {
	
	private Set<Equation2> equationList = new HashSet<Equation2>();
	
	public void generateBinaryExercise(int operationCount)
	{
		
		Equation2 equation;
		while(operationCount>0)
		{
			do {
				
				equation = generateOperation();
				
			} while (repeat(equation));
			equationList.add(equation);
			operationCount--;
		}
	}
	
	private Equation2 generateOperation() {
		Random random = new Random();
		int operatorNumber = random.nextInt(2);
		if(operatorNumber==0)
		{
			return new AdditionOperation();
		}
		else
		{
			return new SubstractOperation();
		}
	}

	public void generateAdditionExercise(int operationCount)
	{
		Equation2 equation;
		while(operationCount>0)
		{
			do {
				
				equation = new AdditionOperation();
				
			} while (repeat(equation));
			
			equationList.add(equation);
			operationCount--;
		}
	}
	
	public void generateSubstractExercise(int operationCount)
	{
		Equation2 equation;
		while(operationCount>0)
		{
			do {
				
				equation = new SubstractOperation();
				
			} while (repeat(equation));
			equationList.add(equation);
			operationCount--;
		}
	}
	
	private boolean repeat(Equation2 equation) {
		List<Equation2> list = new ArrayList<Equation2>(equationList);
		for (int i = 0; i < equationList.size(); i++) {
			if(list.get(i).equals(equation))
			{
				return true;
			}
		}
		return false;
	}
	
	public void formatDisplay(int columnCount)
	{
		List<Equation2> list = new ArrayList<Equation2>(equationList);
		for (int i = 0; i < equationList.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if((i+1)%columnCount==0)
			{
				System.out.println();
			}
		}
		System.out.println("正确答案：");
		
		for (int i = 0; i < equationList.size(); i++) {
			System.out.print(list.get(i).getValue()+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
	}
	
	public void formatDisplay()
	{
		List<Equation2> list = new ArrayList<Equation2>(equationList);
		for (int i = 0; i < equationList.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
		System.out.println("正确答案：");
		
		for (int i = 0; i < equationList.size(); i++) {
			System.out.print(list.get(i).getValue()+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
	}
}
