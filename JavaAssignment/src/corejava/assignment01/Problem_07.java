package corejava.assignment01;

/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/
public class Problem_07 {
	public static void main(String[] agrs) {

		int mile = 24 ,hour = 1, min = 40, sec = 35;
		double avg= ( mile / (hour + (min /60 ) + ( sec/ 3600)) * 1.6);

		System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6 = Average speed in kilometers");
		System.out.println("Average speed of Runner=" + avg +"kilometers");
		System.out.println("Average speed of Runner=\t" + Math.round(avg) +"  kilometers");
		System.out.println("Average speed of Runner=\t" + Math.floor(avg) +"  kilometers");
		System.out.println("Average speed of Runner=\t" + Math.ceil(avg) +"  kilometers");

	}
}