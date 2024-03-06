package collectionAPI.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // Reading properties from a file
        Properties properties = new Properties();
        try(FileInputStream fileInputStream = new FileInputStream("application.properties")){
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value1 = properties.getProperty("key1");
        String value2 = properties.getProperty("key2");

        System.out.println("key1 :"+value1);
        System.out.println("key2 :"+value2);

        // writing properties to a file
        properties.setProperty("key3","value3");
        properties.setProperty("key4","value4");

        try(FileOutputStream fileOutputStream = new FileOutputStream("application.properties")) {
            properties.store(fileOutputStream,"i have added a sample property");
        }catch (IOException e){
            e.printStackTrace();
        }

        // Accessing default values ..
        String accessingDefaultProperty = properties.getProperty("key","value");
        System.out.println("Default Property :"+accessingDefaultProperty);
    }
}
