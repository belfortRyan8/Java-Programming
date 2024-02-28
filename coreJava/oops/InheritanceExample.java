package coreJava.oops;

class A{
    String name ;
    int age ;
    public A(String name, int age){
        this.name = name ;
        this.age = age;
    }
}
class B extends A{
    String address ;
    public B(String name, int age, String address){
        super(name, age);
        this.address = address;
    }
    public void showDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Address :"+address);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        B objB = new B("ryan",19,"kolkata");
        objB.showDetails();
    }
}
