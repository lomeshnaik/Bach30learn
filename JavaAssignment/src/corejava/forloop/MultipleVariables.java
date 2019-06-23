package corejava.forloop;

public class MultipleVariables {

	public static void main(String[] args) {
		for (int i = 0, j = 1, k = 2; i < 5; i++) {
			System.out.println("I : " + i + ",j : " + j++ + ", k : " + k++);
		}

			System.out.println("For loop multiple variable combing logical operator ");

		for (int i = 0, j = 1, k = 2; i < 5 && j <= 10 && k <= 20; i++, j += 1, k += 3) {
			System.out.println("I : " + i + ",j : " + j++ + ", k : " + k++);
		}
	}
}