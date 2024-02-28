package advancedJava.inputOutputOperation;
import  java.io.*;

/**
 * Program to show all the files and directory present inside a specific 'location' or 'directory'
 * Also count the number of files and Directory .
 */
public class ShowFileAndDirectory {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\ryan belfort\\IdeaProjects\\Java-Programming\\coreJava.exceptionHandling");

        String[] fileInfo = file.list();

        int countNumberOfFiles = 0 ;
        int countNumberOfDirectory = 0 ;

        for(String info : fileInfo){
            //Creating a File Object for "C:\\Users\\ryan belfort\\IdeaProjects\\Java-Programming\\coreJava.exceptionHandling"
            File file2 = new File(file,info);
            // if it is File
            if(file2.isFile()){
                countNumberOfFiles++;
                System.out.println(info);
            }
            // if it is Directory
            if(file2.isDirectory()){
                countNumberOfDirectory++;
                System.out.println(info);
            }
        }

        System.out.println("number of files :"+countNumberOfFiles);
        System.out.printf("number of directory :"+countNumberOfDirectory);
    }
}
