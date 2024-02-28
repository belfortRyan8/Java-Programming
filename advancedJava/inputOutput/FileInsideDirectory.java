package advancedJava.inputOutputOperation;
import java.io.*;
/**
 *  Write code to create a directory named with BankDetails in current working directory and create a file named with employee.txt in that directory.
 *  BankDetails (folder) --> (inside) --> Employee.txt(file)
 */
public class FileInsideDirectory {
    public static void main(String[] args) throws IOException{
        File fileDir = new File("BankDetails");
        fileDir.mkdir(); // it will crate folder

        File file = new File(fileDir,"Employee.txt");
        file.createNewFile();

        System.out.println("BankDetails folder exist or not : "+fileDir.exists());
        System.out.println("Employee.txt file exist of not : "+file.exists());
    }
}
