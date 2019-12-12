package data_processing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Checking_CSV {

	private List<String[]> listResult = new ArrayList<String[]>();   //用来存储从练习文件中读出的结果
	private List<String[]> listCheck = new ArrayList<String[]>();    //用来存储从批改文件中独处的数据
	private static int count = 0;       //用来计数，答对的数目
	
	public void checking()          //检查核对结果
	{
		try {
			CsvReader reader = new CsvReader("d:/Practice_CSV.csv",',',Charset.forName("gb2312"));
			
			while(reader.readRecord()){
				listResult.add(reader.getValues());//从练习文件中读出的结果
			}
			
			reader.close();
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < listResult.size(); i++) {        //两种答案进行比对
			if(listResult.get(i)[0].equals(Exercise.getResultBase().get(i)))
			{
				count++;
			}
		}
		
	}
	
	public void writeChecking()    //将比对的结果，存到批改文件中
	{	
		checking();
		try{
			CsvWriter csvWriter = new CsvWriter("d:/Checking_CSV.csv",',',Charset.forName("gb2312"));
			
			String [][] csvContent = new String[5][2];      //存储批改文件的信息
			csvContent[0][0] = "答案：";                     
			csvContent[0][1] = "Practice_CSV.csv";
			csvContent[1][0] = "算式总数：";
			csvContent[1][1] = "50";
			csvContent[2][0] = "正确：";
			csvContent[2][1] = new Integer(count).toString();
			csvContent[3][0] = "错误：";
			csvContent[3][1] = new Integer(50-count).toString();
			csvContent[4][0] = "得分：";
			csvContent[4][1] = new Integer(count*2).toString();
			
			for(int i=0;i<5;i++){                           //将信息写入批改文件
				csvWriter.writeRecord(csvContent[i]);
			}
			csvWriter.close();
			System.out.println("--------------------已完成写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void readChecking()              //将批改文件读取出来
	{
		try {
			CsvReader reader = new CsvReader("d:/Checking_CSV.csv",',',Charset.forName("gb2312"));
//			reader.readHeaders();
			while(reader.readRecord()){
				//System.out.println(reader.getRawRecord());
				listCheck.add(reader.getValues());
			}
			
			reader.close();
			for (int i = 0; i < listCheck.size(); i++) {          //控制台输出
				System.out.println(listCheck.get(i)[0]+" "+listCheck.get(i)[1]);
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}
