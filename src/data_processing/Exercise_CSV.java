package data_processing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Exercise_CSV {
	
	private List<String[]> showList = new ArrayList<String[]>();   //�洢���ļ�������������
	
	public void writeExercise()             //��ϰ��д���ļ�
	{
		try{
			CsvWriter csvWriter = new CsvWriter("d:/Exercise_CSV.csv",',',Charset.forName("gb2312"));
			for(int i=0;i<Exercise.getEquationBase().size();i++){     //һ����ʽռһ�У�һ����¼
				String []csvContent = new String[2];
				csvContent[0] = Exercise.getEquationBase().get(i);
				csvContent[1] = "";
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------�����д�����--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void readExercise()          //��ϰ����ļ��ж�����
	{
		try {
			CsvReader reader = new CsvReader("d:/Exercise_CSV.csv",',',Charset.forName("gb2312"));
			while(reader.readRecord()){
				showList.add(reader.getValues());
			}
			
			reader.close();
			for (int i = 0; i < showList.size(); i++) {     //���������̨
				System.out.println(showList.get(i)[0]);
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}
