package advancedJava.inputOutputOperation;

import java.io.*;

public class RemoveDuplicateNumbersFromFile {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("originalList.txt"));

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ryan belfort \\IdeaProjects\\Java-Programming\\phoneNumberList.txt"));
        String target = br.readLine();

        while(target!=null){
            boolean isAvailable = false ;
            // we will compare the target with each context of originalFile
            BufferedReader br2 = new BufferedReader(new FileReader("originalList.txt"));
            String originalNum = br2.readLine();

            while(originalNum != null ){
                // if context match
                if(target.equals(originalNum)){
                    isAvailable = true;
                    break;
                }
                originalNum = br2.readLine();
            }
            // when context is not available in the original file at that time write the new context to original file .
            if(isAvailable == false){
                out.println(target);
                out.flush();
            }
            target = br.readLine();
        }
        out.close();
        br.close();
    }
}
