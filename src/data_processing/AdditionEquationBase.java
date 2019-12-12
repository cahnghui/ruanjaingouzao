package data_processing;

import java.util.ArrayList;
import java.util.List;

public class AdditionEquationBase implements IEquationBase{

	private static List<String> additionBase = new ArrayList<String>();  //存储所有的加法算式
	private List<String> additionBaseResult = new ArrayList<String>();   //存储所有的加法算式的答案
	
	public List<String> getAdditionBaseResult() {   //getter方法
		return additionBaseResult;
	}
	public List<String> getAdditionBase() {   //getter方法
		return additionBase;
	}
	public AdditionEquationBase() {         //无参构造方法
		super();
		getEquationBase();
	}
	@Override
	public void getEquationBase() {       //生成加法算式基的方法
		additionBase.clear();
		additionBaseResult.clear();
		for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=100-i;j++)
			{
				additionBase.add(i+"+"+j+"=");
				additionBaseResult.add(new Integer(i+j).toString());
			}
		}
	}
}
