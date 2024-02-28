package advancedJava.inputOutputOperation;
import java.io.*;

/**
 * FileReader --> By using FileReader object we can read character data from the file.
 * int read : method is used to read the value , it returns int
 * It attempts to read next character from the file and return its Unicode value. If the next character is not available then we will get -1.
 */
public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File file = new File("exam.txt");
        FileReader fileReader = new FileReader(file);

        System.out.println("First Approach ..");
        System.out.println("Total number of Characters present in the file is : "+file.length());
        int i = fileReader.read();
        while(i != -1){
            System.out.print((char)i);
            i = fileReader.read();
        }

        /**
         *
        System.out.println();
        System.out.println("Second Approach ..");
        char[] charArr = new char[(int) file.length()];
        int numberOfCharacters = fileReader.read(charArr);
        System.out.println("Total number of Characters present in the file is : "+numberOfCharacters);
        for (char data : charArr){
            System.out.print(data);
        }

         */

        fileReader.close();
    }
}
