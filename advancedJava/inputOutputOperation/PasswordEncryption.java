package advancedJava.inputOutputOperation;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Account implements Serializable {
    String userName ;
    transient String password;
    transient String pin ;
    public Account(String userName, String password, String pin){
        this.userName = userName;
        this.password = password;
        this.pin = pin;
    }
    public void showInfo(){
        System.out.println("Name is :"+userName);
        System.out.println("Password is :"+password);
        System.out.println("Pin number is :"+pin);
    }
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject(); // perform default serialization
                    String encryptedPass = password+ "*****";
                        String encryptedPin = pin + "****";
                            objectOutputStream.writeObject(encryptedPass);
                objectOutputStream.writeObject(encryptedPin);
                }
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException{
                objectInputStream.defaultReadObject();
                    String encryptedPass = (String) objectInputStream.readObject();
                        String encryptedPin = (String) objectInputStream.readObject(); // performing decryption
                    password = encryptedPass.substring(5); // writing extra data to the object
                pin = encryptedPin.substring(4);
        }
}
public class PasswordEncryption {
    public static void main(String[] args) throws Exception{
        // serialization
        Account account = new Account("ryan","ryan8","1234");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("acc.ser")); // serialization
        objectOutputStream.writeObject(account);
        account.showInfo();

        // de-serialization ...
        System.out.println();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("acc.ser")); // deserialization
        Account accountDemo = (Account) objectInputStream.readObject();
        accountDemo.showInfo();
    }
}
