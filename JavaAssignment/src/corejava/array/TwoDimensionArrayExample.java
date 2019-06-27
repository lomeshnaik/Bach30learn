package corejava.array;

//import java.util.Scanner;
//import java.lang.String;

public class TwoDimensionArrayExample {
    //static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int fArray[][] = {{52, 35, 364, 78, 356, 65}, {45, 68, 347, 545, 54}};
        int sArray[][] = {{54, 545, 4, 5341, 4, 2, 44}, {45, 252}, {546, 35, 38, 34, 36}};

        TwoDimensionArrayExample td = new TwoDimensionArrayExample();
        System.out.println("This is First Array");
        td.display(fArray);
        System.out.println("This is a Second Array");
        td.display(sArray);

    }

    private void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "   \t"); // second for loop column *** use print**** not println
            }
            System.out.println(); //first for loop for row
        }
    }
}




    /*private static void display(int[][] fArray) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "   \t"); // second for loop column *** use print**** not println
            }
            System.out.println(); //first for loop for row
    }


    private static void display2(String[][] tArray) {
        for (int row = 0; row < tArray.length; row++) {
            for (int column = 0; column < tArray[row].length; column++) {
                System.out.print(tArray[row][column] + "   \t"); // second for loop column *** use print**** not println
            }
            System.out.println(); //first for loop for row
    }

    private static void display (int x[][] farray)
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "   \t"); // second for loop column *** use print**** not println
            }
            System.out.println(); //first for loop for row
        }

       /* public static void display2 (String){***
            for (int row = 0; row < x.length; row++) {   my mistakes
                for (int column = 0; column < x[row].length; column++) {
                    System.out.print(x[row][column] + "   \t"); // second for loop column *** use print**** not println
                }
                System.out.println(); //first for loop for row

        */





