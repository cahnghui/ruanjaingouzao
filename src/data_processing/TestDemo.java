package data_processing;

public class TestDemo {

	public static void main(String[] args) {
		
		Exercise ex = new Exercise();
		ex.getRandomAdditionEqaution(50);         //生成习题，本例是生成加法习题
		
		Exercise_CSV excsv = new Exercise_CSV();  //习题的读写文件操作
		excsv.writeExercise();
		excsv.readExercise();
		
		System.out.println("输入所得结果：");
		Practice_CSV pcsv = new Practice_CSV();   //将所得结果写入文件
		pcsv.writePractice();
		
		Checking_CSV ccsv = new Checking_CSV();   //将批改结果写入文件
		ccsv.writeChecking();
		ccsv.readChecking();
	}
}
