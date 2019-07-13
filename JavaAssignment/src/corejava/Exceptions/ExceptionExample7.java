package corejava.Exceptions;
//open file Exception // Throwing the FileNotFoundException

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample7 {

    public static void main(String[] args) {

        try {
            openFile("C:\\Users\\user\\Desktop\\Assignment\\Assignment\\JavaAssignment\\src\\corejava\\PasswordAndLink");
            System.out.println("file has found");

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
    public static void openFile(String name) throws FileNotFoundException , IOException
    {
        FileInputStream f = new FileInputStream(name);
    }
    }











