package edition2;

public class ExerciseSheet {

	public static void main(String[] args) {
		
		Exercise exercise = new Exercise();
		exercise.generateAdditionExercise(60);
		System.out.println("display:");
		exercise.formatDisplay();
		
	}
}