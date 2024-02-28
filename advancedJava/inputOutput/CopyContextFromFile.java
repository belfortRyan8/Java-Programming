package advancedJava.inputOutputOperation;

import java.io.*;

/**
 * Requirement => file1.txt ,file2.txt copy all the contents to output.txt
 */
public class CopyContextFromFile {
    public static void main(String[] args) throws IOException {
        /*

        PrintWriter pw1 = new PrintWriter(new FileWriter("file1.txt"));
        PrintWriter pw2 = new PrintWriter(new FileWriter("'file2.txt"));
        pw1.println("Inside file1 ");
        pw2.println("Inside file2 ");

        pw1.flush();
        pw2.flush();

        pw1.close();
        pw2.close();
        */

        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"));
        // copy context from the file1
        String line = bufferedReader.readLine();
        while (line != null) {
            out.println(line);
            line = bufferedReader.readLine();
        }
        // copy context from the file2
        bufferedReader = new BufferedReader(new FileReader("file2.txt"));
        line = bufferedReader.readLine();
        while (line != null) {
            out.println(line);
            line = bufferedReader.readLine();
        }

        out.flush();
        out.close();
        bufferedReader.close();
    }
}
