package data_processing;

import java.io.IOException;
import java.nio.charset.Charset;

import java.util.Scanner;


import com.csvreader.CsvWriter;

public class Practice_CSV {
	
	
	@SuppressWarnings("resource")
	public void writePractice()
	{	
		Scanner sc = new Scanner(System.in);
		
		try{
			CsvWriter csvWriter = new CsvWriter("d:/Practice_CSV.csv",',',Charset.forName("gb2312"));
			for(int i=0;i<Exercise.getEquationBase().size();i++){   //将结果写入练习文件中
				String []csvContent = new String[2];
				csvContent[0] = sc.next();
				csvContent[1] = null;
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------已完成写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

