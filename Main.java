import java.lang.*;
import java.io.*;

class Account implements Serializable{
    String name ;
    transient String password;
    public Account(String name,String password){
        this.name = name;
        this.password = password;
    }
    public void disp(){ System.out.println("name : "+name+"\n"+"password "+password);   }
    private void writeObject(ObjectOutputStream objectOutputStream) throws Exception{
        objectOutputStream.defaultWriteObject();
        String encpPass = password +"****";
        objectOutputStream.writeObject(encpPass);
    }
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException,IOException{
        objectInputStream.defaultReadObject();
        String encpPass = (String) objectInputStream.readObject();

        password = encpPass.substring(3);
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        Account account= new Account("ripan","123");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("acc.ser"));
        objectOutputStream.writeObject(account);
        account.disp();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("acc.ser"));
        Account accountDemo = (Account) objectInputStream.readObject();
        accountDemo.disp();
    }
}

