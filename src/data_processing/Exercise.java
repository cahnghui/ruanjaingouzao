package data_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise {

	private Random random = new Random();
	private static List<String> equationBase = new ArrayList<String>();     //用来存储生成的习题
	private static List<String> resultBase = new ArrayList<String>();       //用来存储对应习题的答案
	private AdditionEquationBase aeb = new AdditionEquationBase();       //创建一个加法算式基的对象
	private SubstractEquationBase seb = new SubstractEquationBase();      //创建一个减法算式基的对象
	
	
	public static List<String> getResultBase() {            //getter方法
		return resultBase;
	}
	
	
	public static List<String> getEquationBase() {     //getter方法
		return equationBase;
	}


	public  void getRandomAdditionEqaution(int count)        //随机生成加法习题
	{
		
		int i = random.nextInt(aeb.getAdditionBase().size());
		do {
			
			if(repeat(aeb.getAdditionBase().get(i),equationBase))   //判断是否重复
			{
				equationBase.add(aeb.getAdditionBase().get(i));
				resultBase.add(aeb.getAdditionBaseResult().get(i));
				count--;
			}
			
			i = random.nextInt(aeb.getAdditionBase().size());
			
		} while (count>0);
	}
	

	public  void getRandomSubstractEqaution(int count)     //随机生成一定数量的减法习题
	{
		int i = random.nextInt(seb.getSubstractBase().size());
		do {
			
			if(repeat(seb.getSubstractBase().get(i),equationBase))   //判断随机数有无重复
			{
				equationBase.add(seb.getSubstractBase().get(i));
				resultBase.add(seb.getSubstractBaseResult().get(i));
				count--;
			}
			i = random.nextInt(seb.getSubstractBase().size());
			
		} while (count>0);
	}
	
	public void getRandomBinaryEquation(int count)      //随机生成混合运算习题
	{
		while(count>0)
		{
			int flag = random.nextInt(2);
			if(flag==0)
			{
				getRandomAdditionEqaution(1);
				count--;
			}
			else
			{
				getRandomSubstractEqaution(1);
				count--;
			}
		}	
	}
	
	private boolean repeat(String str,List<String> additionBase)  //判断是否有重复
	{
		if(additionBase.contains(str))
		{
			return false;
		}
		else return true;
	}
	
	public void formatDisplay(int columnCount)      //有参输出格式
	{
		for (int i = 0; i < equationBase.size(); i++) {
			System.out.print(equationBase.get(i)+"\t");
			if((i+1) % columnCount==0)
			{
				System.out.println();
			}
		}
	}
	
	public void formatDisplay()                //默认输出格式
	{
		for (int i = 0; i < equationBase.size(); i++) {
			System.out.print(equationBase.get(i)+"\t");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
	}
}
