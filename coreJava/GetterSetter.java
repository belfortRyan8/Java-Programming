package coreJava;
import java.lang.*;
/*
*   If a variable is declared with the 'private' keyword in Java, it can only be accessed
*   or modified through getter and setter methods.
*/
class GetterSetterExample{
    private int num1 ;
    private int num2 ;

    // setter Method for set the variable value
    public void setNum1(int num1){  this.num1 = num2 ;  }
    public void setNum2(int num2){  this.num2 = num2;   }

    // getter method for get the variable value
    public int getNum1(){   return num1;    }
    public int getNum2(){   return num2;    }

    public int sum(int num1, int num2){
        int ans = num1+num2;
        return ans;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        GetterSetterExample obj = new GetterSetterExample();
        obj.setNum1(10);
        obj.setNum2(15);

        int result = obj.sum(obj.getNum1(),obj.getNum2());

        System.out.println("The sum is:"+ result);
    }
}
