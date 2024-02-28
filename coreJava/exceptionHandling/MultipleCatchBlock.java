package coreJava.exceptionHandling;
/*
    To handle the exception we can use multiple catch block .
    If we try to work with multiple catch blocks, then order of catch blocks is very important, it should be from child to parent, by mistake
    if we are taking from parent to child then we will get "CompileTimeError" saying
    ~~> "exception xyx has already been caught".
 */
public class MultipleCatchBlock{
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4, 5};
        String str = null;
        try{
            System.out.println("inside try block ..");
            // besed on condition, corresponding catch block will be caught ..
            System.out.println(10/0);
            // System.out.println(arr[-1]); // <-- catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){   ...     }
            // System.out.println(str.length());  // <-- catch (NullPointerException nullPointerException){     ...     }
            // if any catch block doesn't match then "Exception" block will be execute .. catch (Exception e){    ...     }

        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
