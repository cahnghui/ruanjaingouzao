package data_processing;

public class TestDemo {

	public static void main(String[] args) {
		
		Exercise ex = new Exercise();
		ex.getRandomAdditionEqaution(50);         //����ϰ�⣬���������ɼӷ�ϰ��
		
		Exercise_CSV excsv = new Exercise_CSV();  //ϰ��Ķ�д�ļ�����
		excsv.writeExercise();
		excsv.readExercise();
		
		System.out.println("�������ý����");
		Practice_CSV pcsv = new Practice_CSV();   //�����ý��д���ļ�
		pcsv.writePractice();
		
		Checking_CSV ccsv = new Checking_CSV();   //�����Ľ��д���ļ�
		ccsv.writeChecking();
		ccsv.readChecking();
	}
}
