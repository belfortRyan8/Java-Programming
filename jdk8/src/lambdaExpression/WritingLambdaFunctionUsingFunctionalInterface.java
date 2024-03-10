package lambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface Calculation{
    public abstract void add(int num1, int num2);
}
public class WritingLambdaFunctionUsingFunctionalInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        Calculation calculation= (a, b) -> System.out.println("The sum of the two number is :"+(a+b));
        calculation.add(num1,num2);
    }
}
