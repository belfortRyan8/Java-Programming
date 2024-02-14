package coreJava;
class Polymorphism{
    public int sum(int num1, int num2){
        return (num1+num2);
    }
    public int sum(int num1, int num2, int num3){
        return (num1+num2+num3);
    }
    public double sum(double num1, double num2){
        return (num1+num2);
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();

        int intSumResult = polymorphism.sum(10,30);
        System.out.println(intSumResult);

        double doubleSumResult = polymorphism.sum(33.2,4.3);
        System.out.println(doubleSumResult);
    }
}
