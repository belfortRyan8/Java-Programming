package coreJava;

class Student{
    String name ;
    int age ;
    public Student(String name,int age) { // Parent class Constructor
        this.name = name;
        this.age = age;
    }
}
class CollageStudent extends Student{
    // IS-A relationship : One to One
    String collageName ;
    public CollageStudent(String name, int age, String collageName){
        super(name,age);// Since, We extend the student class,So that it's Necessary to pass the value through the super keyword while using Constructor
        this.collageName = collageName;
    }
    public void showStudentDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Collage name : "+collageName);
    }
}
public class ParentChildRelationship {
    public static void main(String[] args) {
        // creating the reference of the CollageStudent Class
        CollageStudent student = new CollageStudent("ryan",19,"Texas University");
        student.showStudentDetails();
    }
}
