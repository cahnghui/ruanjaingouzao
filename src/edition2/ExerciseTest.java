package edition2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	Exercise exercise = new Exercise();
	@Test
	void testGenerateBinaryExercise() {
//		fail("Not yet implemented");
		exercise.generateBinaryExercise(40);
		System.out.println("������ʮ�����ϰ��");
		exercise.formatDisplay();
	}

	@Test
	void testGenerateAdditionExercise() {
//		fail("Not yet implemented");
		exercise.generateAdditionExercise(30);
		System.out.println("������ʮ���ӷ�ϰ��");
		exercise.formatDisplay(6);
	}

	@Test
	void testGenerateSubstractExercise() {
//		fail("Not yet implemented");
		exercise.generateSubstractExercise(55);
		System.out.println("������ʮ�������ϰ��");
		exercise.formatDisplay(11);
	}

}
