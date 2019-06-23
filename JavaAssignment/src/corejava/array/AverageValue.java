package corejava.array;

/**
 * Find the Average Value of the numbers array
 * Eg : Avg value of 3,4,5,6,7 is equals (3+4+5+6+7)/5
 * @author jrout
 *
 */
public class AverageValue {

	public static void main(String[] args) {
		int[] numbers = new int[]{10,20,30,25,16,70,100};
		// Write a for loop or while loop to find the average
		int  sum = 0 ;
		for ( int i : numbers ){
			 sum += i;
		}
		float avg = sum / numbers.length;
		System.out.println("The Sum, length of array and Average of an array is =\t" + sum + "/"+ numbers.length +"= " + avg);
	}
}
/*
Output of Calculate Average value of Array elements using Java Example would be
Average value of array elements is : 38
*/