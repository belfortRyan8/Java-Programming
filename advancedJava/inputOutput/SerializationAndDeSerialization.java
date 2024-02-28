package advancedJava.inputOutputOperation;
import java.io.Serializable;
import java.io.*;
/**
 * Serialization and DeSerialization Basics
 * Serialization is the process of Converting an object from java supported form to file or network supported form .
 * De-Serialization is the process of Converting an Object form file or network supported form to java supported form .
 * Serialization : ObjectOutputStream and FileOutputStream
 * De-Serialization : ObjectInputStream and FileInputStream
 */

class Phone implements Serializable {
    static transient String p1 = "Apple";
    transient final String p2 = "Samsung";
}
class Laptop implements Serializable{
    String l1 = "Mac";
    String l2 = "Lenovo";
}
public class SerializationAndDeSerialization {
        public static void main(String[] args) throws Exception {
            // Serialization and De-Serialization ..
            Phone phone = new Phone();
            Laptop laptop = new Laptop();
            System.out.println("Serialization Started ..");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.ser"));
            System.out.println("Phone Names are : " + phone.p1 + " " + phone.p2);
            System.out.printf("Laptop Names are : " + laptop.l1 + " " + laptop.l2);
            objectOutputStream.writeObject(phone);
            objectOutputStream.writeObject(laptop);

            System.out.println("Serialization Completed ..");

            System.out.println("Deserialization Started .. ");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data.ser"));

            Phone phone1 = (Phone) objectInputStream.readObject();
            Laptop laptop1 = (Laptop) objectInputStream.readObject();

            System.out.println("Laptop Names with Another Reference : " + laptop1.l1 + " " + laptop1.l2);
            System.out.println("Phone Names With Another Reference : " + phone1.p1 + " " + phone1.p2);
            System.out.println("DeSerialization Completed .. ");

            System.out.println(phone1 == phone); // check reference is same or not
        }
}
