package data_processing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Exercise_CSV {
	
	private List<String[]> showList = new ArrayList<String[]>();   //存储从文件读出来的数据
	
	public void writeExercise()             //将习题写入文件
	{
		try{
			CsvWriter csvWriter = new CsvWriter("d:/Exercise_CSV.csv",',',Charset.forName("gb2312"));
			for(int i=0;i<Exercise.getEquationBase().size();i++){     //一个算式占一行，一条记录
				String []csvContent = new String[2];
				csvContent[0] = Exercise.getEquationBase().get(i);
				csvContent[1] = "";
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------已完成写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void readExercise()          //将习题从文件中读出来
	{
		try {
			CsvReader reader = new CsvReader("d:/Exercise_CSV.csv",',',Charset.forName("gb2312"));
			while(reader.readRecord()){
				showList.add(reader.getValues());
			}
			
			reader.close();
			for (int i = 0; i < showList.size(); i++) {     //输出到控制台
				System.out.println(showList.get(i)[0]);
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}
