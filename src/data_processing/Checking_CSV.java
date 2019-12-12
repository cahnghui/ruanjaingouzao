package data_processing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Checking_CSV {

	private List<String[]> listResult = new ArrayList<String[]>();   //�����洢����ϰ�ļ��ж����Ľ��
	private List<String[]> listCheck = new ArrayList<String[]>();    //�����洢�������ļ��ж���������
	private static int count = 0;       //������������Ե���Ŀ
	
	public void checking()          //���˶Խ��
	{
		try {
			CsvReader reader = new CsvReader("d:/Practice_CSV.csv",',',Charset.forName("gb2312"));
			
			while(reader.readRecord()){
				listResult.add(reader.getValues());//����ϰ�ļ��ж����Ľ��
			}
			
			reader.close();
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < listResult.size(); i++) {        //���ִ𰸽��бȶ�
			if(listResult.get(i)[0].equals(Exercise.getResultBase().get(i)))
			{
				count++;
			}
		}
		
	}
	
	public void writeChecking()    //���ȶԵĽ�����浽�����ļ���
	{	
		checking();
		try{
			CsvWriter csvWriter = new CsvWriter("d:/Checking_CSV.csv",',',Charset.forName("gb2312"));
			
			String [][] csvContent = new String[5][2];      //�洢�����ļ�����Ϣ
			csvContent[0][0] = "�𰸣�";                     
			csvContent[0][1] = "Practice_CSV.csv";
			csvContent[1][0] = "��ʽ������";
			csvContent[1][1] = "50";
			csvContent[2][0] = "��ȷ��";
			csvContent[2][1] = new Integer(count).toString();
			csvContent[3][0] = "����";
			csvContent[3][1] = new Integer(50-count).toString();
			csvContent[4][0] = "�÷֣�";
			csvContent[4][1] = new Integer(count*2).toString();
			
			for(int i=0;i<5;i++){                           //����Ϣд�������ļ�
				csvWriter.writeRecord(csvContent[i]);
			}
			csvWriter.close();
			System.out.println("--------------------�����д�����--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void readChecking()              //�������ļ���ȡ����
	{
		try {
			CsvReader reader = new CsvReader("d:/Checking_CSV.csv",',',Charset.forName("gb2312"));
//			reader.readHeaders();
			while(reader.readRecord()){
				//System.out.println(reader.getRawRecord());
				listCheck.add(reader.getValues());
			}
			
			reader.close();
			for (int i = 0; i < listCheck.size(); i++) {          //����̨���
				System.out.println(listCheck.get(i)[0]+" "+listCheck.get(i)[1]);
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}
