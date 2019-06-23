package corejava.array;

/**
 * A series of numbers in which each number ( Fibonacci number ) 
 * is the sum of the two preceding numbers. The simplest is the 
 * series 1, 1, 2, 3, 5, 8, etc.
 * @author jrout
 *
 */
public class FibonacciSeriesExample {

	public static void main(String[] args) {
		//number of elements to generate in a series
        int limit = 20;
       
        long[] series = new long[limit];
        //create first 2 series elements
        series[0] = 0;
        series[1] = 1;
       
        //create the Fibonacci series and store it in an array
        for(int i=2; i <= limit; i++){
        	// Write your code here to fill the series array with fibonaaci values.
               series[i] = series[0] + series[1];
                System.out.println("\t"+series[i]);
               series[0] = series[1];
               series[1] = series[i];
               }

        //print the Fibonacci series numbers
       
        System.out.println("Fibonacci Series upto " + limit);
        for(int i=0; i< limit; i++){
                System.out.print(series[i] + " ");
        }

	}

}

/*
Output of the Fibonacci Series Java Example would be
Fibonacci Series upto 20
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
*/
