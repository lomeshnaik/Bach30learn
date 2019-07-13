package corejava.Exceptions;
//open file Exception

import java.io.FileInputStream;

public class ExceptionExample6 {

    public static void main(String[] args) {
        openFile("C:\\Users\\user\\Desktop\\Assignment\\Assignment\\JavaAssignment\\src\\corejava\\PasswordAndLink");
    }
    public static void openFile(String name)
    {
     try {
         FileInputStream f = new FileInputStream(name);
         System.out.println("file has found   " + f );
         //display -- file has found   java.io.FileInputStream@5b6f7412
     } catch (Exception e){
         e.fillInStackTrace();
         System.err.println("file not found.");
         System.out.println("file not found.");
         System.out.println(e.toString());
         System.err.println(e.toString());
         System.out.println(e.getMessage());
         System.err.println(e.getMessage());
     }
    }
    }











