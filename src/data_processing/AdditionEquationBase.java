package data_processing;

import java.util.ArrayList;
import java.util.List;

public class AdditionEquationBase implements IEquationBase{

	private static List<String> additionBase = new ArrayList<String>();  //�洢���еļӷ���ʽ
	private List<String> additionBaseResult = new ArrayList<String>();   //�洢���еļӷ���ʽ�Ĵ�
	
	public List<String> getAdditionBaseResult() {   //getter����
		return additionBaseResult;
	}
	public List<String> getAdditionBase() {   //getter����
		return additionBase;
	}
	public AdditionEquationBase() {         //�޲ι��췽��
		super();
		getEquationBase();
	}
	@Override
	public void getEquationBase() {       //���ɼӷ���ʽ���ķ���
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
