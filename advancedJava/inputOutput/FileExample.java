package advancedJava.inputOutputOperation;
import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException{
        File file = new File("demo.txt");

        System.out.println(file.exists());
        // it will check whether this 'demo.txt' file exist in the current directory or not , it returns boolean value .

        file.createNewFile();   // file will be created

        System.out.println(file.exists());  // true
    }
}
