package edition2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	Exercise exercise = new Exercise();
	@Test
	void testGenerateBinaryExercise() {
//		fail("Not yet implemented");
		exercise.generateBinaryExercise(40);
		System.out.println("生成四十道混合习题");
		exercise.formatDisplay();
	}

	@Test
	void testGenerateAdditionExercise() {
//		fail("Not yet implemented");
		exercise.generateAdditionExercise(30);
		System.out.println("生成三十道加法习题");
		exercise.formatDisplay(6);
	}

	@Test
	void testGenerateSubstractExercise() {
//		fail("Not yet implemented");
		exercise.generateSubstractExercise(55);
		System.out.println("生成五十五道减法习题");
		exercise.formatDisplay(11);
	}

}
