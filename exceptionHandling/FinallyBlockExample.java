package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
    finally : The speciality of finally block is it will always be executed irrespective of whether the exception is raised or not raised and
    whether handled or not handled.
 */
public class FinallyBlockExample {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // Risky code
            br = new BufferedReader(new FileReader("demo.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handling logic
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            // CleanUp code
            // Close the BufferedReader in the finally block to ensure it's always closed, regardless of whether an exception occurred or not.
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
