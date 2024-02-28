package advancedJava.inputOutputOperation;

import java.io.*;
//Requirement => file1.txt ,file2.txt copy one line from file1 and one line from file2 and put it to output.txt
public class CopyContextFromFile2 {
    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));
        // copy context from the file1
        String line1 = bufferedReader1.readLine();
        String line2 = bufferedReader2.readLine();

        while(line1 != null || line2 != null){
            if(line1 != null){
                out.println(line1);
                line1 = bufferedReader1.readLine();
            }
            if(line2 != null){
                out.println(line2);
                line2 = bufferedReader2.readLine();
            }
        }
        out.flush();
        out.close();
        bufferedReader1.close();
        bufferedReader2.close();
    }
}
