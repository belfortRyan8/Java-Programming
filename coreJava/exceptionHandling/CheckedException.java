package coreJava.exceptionHandling;

import java.lang.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    ~>  Checked Exception :: The exceptions which are checked by the compiler whether programmer is handling it or not,
        for smooth execution of the program at the runtime are called CheckedException.
        eg: FileNotFoundException,IOException,SQLException..
 */
public class CheckedException {
        public static void fileNotFoundException() {
            try {
                File file = new File("demoFile.txt");
                FileReader fileReader = new FileReader(file); // This may throw FileNotFoundException
                System.out.println("File opened successfully.");
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
                System.out.println("Abnormal termination.");
            }
    }
    public static void sqlException() {
        // JDBC URL for connecting to a SQLite database
        String url = "jdbc:sqlite:test.db";
        try {
            Connection conn = DriverManager.getConnection(url);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("SELECT * FROM NonExistentTable");

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred: " + e.getMessage());
            System.out.println("Abnormal termination.");
        }
    }
    public static void main(String[] args) {
            fileNotFoundException();
            sqlException();
    }
}
