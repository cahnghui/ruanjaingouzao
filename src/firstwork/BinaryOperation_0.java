package firstwork;

import java.util.Random;

public class BinaryOperation_0
{
	
	public static boolean repeat(int [][] Equation,int [] thisEquation)            //判读是否有重复的题目
	{
		for(int i=0;i<Equation.length-1;i++)
		{
			if(thisEquation[2]==Equation[i][2])
			{
				if(thisEquation[0]==Equation[i][0]||thisEquation[0]==Equation[i][1])
				{
					if(thisEquation[1]==Equation[i][0]||thisEquation[1]==Equation[i][1])
						return false;
				}
			}
		}
		return true;
	}
	
	public static int result(int [] Equation)                                     //对于数组中的0和1分别对应减法和加法操作
	{
		int value = 0;
		if(Equation[2]==1)
		{
			value = Equation[0]+Equation[1];
		}
		else
		{
			value = Equation[0]-Equation[1];
		}
		return value;
	}
	
	public static void getEquation(int [][] Equation)                             //生成算式的模块
	{
		Random random = new Random();
		for(int i=0;i<Equation.length;i++)
		{
			do
			{
				Equation[i][0] = (int)random.nextInt(101);
				Equation[i][1] = (int)random.nextInt(101);
				Equation[i][2] = (int)random.nextInt(2);
				Equation[i][3] = result(Equation[i]);
			}
			while(Equation[i][3]>100||Equation[i][3]<0||repeat(Equation,Equation[i]));//如果加法和减法操作使结果大于100或者小于0或者有重复的，重新生成
			
			if(Equation[i][2]==1)
			{
				System.out.print(" "+(i+1)+":"+Equation[i][0]+"+"+Equation[i][1]+"="+"\t");
			}
			else
			{
				System.out.print(" "+(i+1)+":"+Equation[i][0]+"-"+Equation[i][1]+"="+"\t");
			}
	
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
	}
	
	public static void print(int [][] Equation)                              //输出答案的模块
	{
		for(int i=0;i<Equation.length;i++)                          //输出答案
		{
			System.out.print(""+(i+1)+":"+Equation[i][3]+"\t");
			
			if((i+1)%5==0)
			{
				System.out.print("\n");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int [][] Equation = new int [50][4];                //定义一个数组，保存操作数，运算符（0或1），运算结果
		getEquation(Equation);
		System.out.println("===========================");
		System.out.println("正确答案：");
		print(Equation);
	}

}
