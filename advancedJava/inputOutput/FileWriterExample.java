package advancedJava.inputOutputOperation;
import java.io.*;

/**
 * FileWriter --> By using FileWriter object we can write character data to the file.
 * To Write wr use write() , which accept character Array, character, string .
 * We have to separate the line explicitly. [ \n ] it is hectic task for a programmer .
 */
public class FileWriterExample {
    public static void main(String[] args) throws IOException{
        FileWriter fileWriter = new FileWriter("exam.txt");

        char[] ar = {'P','h','y','s','i','c','s'};
        fileWriter.write(ar);
        fileWriter.write("\n");

        fileWriter.write("Mathematics");
        fileWriter.write("\n");
        fileWriter.write(65);   // corresponding character will be added

        fileWriter.flush();//Guarantee that data is written to a file
        fileWriter.close(); // close the stream .
    }
}
