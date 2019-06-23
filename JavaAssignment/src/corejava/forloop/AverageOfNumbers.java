package corejava.forloop;

/**
 * Solve the problem to find the average of the values in the below array.
 * @author jrout
 *
 */
public class AverageOfNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[]{10, 20, 15, 25, 16, 60, 100,1000};
		int avg=0;

		for (int i : numbers) {
			avg = avg + i;
			System.out.println(avg);
		}

			System.out.println("The Average of an array is =" + avg);

		}

	}

