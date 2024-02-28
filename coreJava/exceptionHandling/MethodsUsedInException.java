package coreJava.exceptionHandling;
/*
    Throwable class defines the following methods to print exception information to the console . these are :
    1 . printStackTrace( )  :   it prints the name , description and stace trace of the exception
    2 . getMessage( )       :   print the description of the exception
    3 . toString( )         :   prints the name , description of the exception . [this methods belongs from Object class , its common for all ]
 */
public class MethodsUsedInException {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block ..");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("name and description of the Exception : "+e.toString());
            System.out.println();
            System.out.println("description of the Exception : "+e.getMessage());
            System.out.println();
            System.out.println("name, description, and stack trace : ");
            e.printStackTrace(); //'System.out.println' is not required
        }
    }
}
