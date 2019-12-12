package data_processing;

import java.util.ArrayList;
import java.util.List;

public class SubstractEquationBase implements IEquationBase{

	private List<String> substractBase = new ArrayList<String>();   //存储所有的减法算式
	private List<String> substractBaseResult = new ArrayList<String>();  //存储所有的减法算式答案
	
	public List<String> getSubstractBase() {           //getter方法
		return substractBase;
	}
	public List<String> getSubstractBaseResult() {
		return substractBaseResult;
	}

	public SubstractEquationBase() {     //无参构造方法
		super();
		getEquationBase();
	}
	@Override
	public void getEquationBase() {      //生成减法算式基方法
		substractBase.clear();
		substractBaseResult.clear();
		for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=i;j++)
			{
				substractBase.add(i+"-"+j+"=");
				substractBaseResult.add(new Integer(i-j).toString());
			}
		}
	}
	
}
