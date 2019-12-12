package data_processing;

import java.util.ArrayList;
import java.util.List;

public class SubstractEquationBase implements IEquationBase{

	private List<String> substractBase = new ArrayList<String>();   //�洢���еļ�����ʽ
	private List<String> substractBaseResult = new ArrayList<String>();  //�洢���еļ�����ʽ��
	
	public List<String> getSubstractBase() {           //getter����
		return substractBase;
	}
	public List<String> getSubstractBaseResult() {
		return substractBaseResult;
	}

	public SubstractEquationBase() {     //�޲ι��췽��
		super();
		getEquationBase();
	}
	@Override
	public void getEquationBase() {      //���ɼ�����ʽ������
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
