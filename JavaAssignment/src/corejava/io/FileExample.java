package corejava.io;
import java.io.*;

public class FileExample {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\user\\Desktop\\Assignment\\Assignment\\JavaAssignment\\src\\corejava\\PasswordAndLink.txt");
        System.out.println(file.exists());

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("file is created   "+file.exists());
            }else {
                System.out.println("file is already exists");
                System.out.println(file.canExecute());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.getAbsolutePath());
            }
        }
             catch (IOException e)
            {
                e.printStackTrace();

        }

        File directory = new File("C:\\Users\\user\\Desktop\\Assignment\\Assignment\\JavaAssignment\\src\\corejava");
        System.out.println(directory.isDirectory());
        System.out.println(directory.isFile());
        System.out.println(directory.isHidden());

       /* System.out.println("write some thing to file ");
        FileWriter writer =null;
        try {
            writer = new FileWriter("PasswordAndLink1.txt");
            writer.write("\n*******************Hello Lomesh**********************\n");
            writer.write("\n*******************Hello Lomesh**********************"+ new java.util.Date()+"\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }finally{
            try {if(writer !=null)
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/
        System.out.println("................Read from the file................");
        FileReader fileReader = null;
        try {
            char[] inBag = new char[500];
            fileReader = new FileReader("C:\\Users\\user\\Desktop\\Assignment\\PasswordAndLink1.txt");
            int read = fileReader.read(inBag);
            System.out.println("byte read from " + read);
            for (char c: inBag) {
               System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {if(fileReader !=null)
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

