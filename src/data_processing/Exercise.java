package data_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise {

	private Random random = new Random();
	private static List<String> equationBase = new ArrayList<String>();     //�����洢���ɵ�ϰ��
	private static List<String> resultBase = new ArrayList<String>();       //�����洢��Ӧϰ��Ĵ�
	private AdditionEquationBase aeb = new AdditionEquationBase();       //����һ���ӷ���ʽ���Ķ���
	private SubstractEquationBase seb = new SubstractEquationBase();      //����һ��������ʽ���Ķ���
	
	
	public static List<String> getResultBase() {            //getter����
		return resultBase;
	}
	
	
	public static List<String> getEquationBase() {     //getter����
		return equationBase;
	}


	public  void getRandomAdditionEqaution(int count)        //������ɼӷ�ϰ��
	{
		
		int i = random.nextInt(aeb.getAdditionBase().size());
		do {
			
			if(repeat(aeb.getAdditionBase().get(i),equationBase))   //�ж��Ƿ��ظ�
			{
				equationBase.add(aeb.getAdditionBase().get(i));
				resultBase.add(aeb.getAdditionBaseResult().get(i));
				count--;
			}
			
			i = random.nextInt(aeb.getAdditionBase().size());
			
		} while (count>0);
	}
	

	public  void getRandomSubstractEqaution(int count)     //�������һ�������ļ���ϰ��
	{
		int i = random.nextInt(seb.getSubstractBase().size());
		do {
			
			if(repeat(seb.getSubstractBase().get(i),equationBase))   //�ж�����������ظ�
			{
				equationBase.add(seb.getSubstractBase().get(i));
				resultBase.add(seb.getSubstractBaseResult().get(i));
				count--;
			}
			i = random.nextInt(seb.getSubstractBase().size());
			
		} while (count>0);
	}
	
	public void getRandomBinaryEquation(int count)      //������ɻ������ϰ��
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
	
	private boolean repeat(String str,List<String> additionBase)  //�ж��Ƿ����ظ�
	{
		if(additionBase.contains(str))
		{
			return false;
		}
		else return true;
	}
	
	public void formatDisplay(int columnCount)      //�в������ʽ
	{
		for (int i = 0; i < equationBase.size(); i++) {
			System.out.print(equationBase.get(i)+"\t");
			if((i+1) % columnCount==0)
			{
				System.out.println();
			}
		}
	}
	
	public void formatDisplay()                //Ĭ�������ʽ
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
