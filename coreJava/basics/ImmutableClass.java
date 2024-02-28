package coreJava.basics;
/*
    * Can we create our own class[UserDefined]as Immutable just like String ,StringBuffern, StringBuilder class ? [interview question ]
    -> yes ,it is possible to make userdefined class a Immutable class.
 */
final class ImmutableClassDemo{ // we make this class as final so that other's can't extend it .
    // we
    private int i ;
    public ImmutableClassDemo(int i){
        this.i = i ;
    }
    public ImmutableClassDemo modifyValue(int i){
        //if same value in existing object, dont' create new object
        if(this.i == i){
            // return the same reference
            return this;
        }else {
            // otherwise , create new one
            return new ImmutableClassDemo(i);
        }
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        ImmutableClassDemo c1 = new ImmutableClassDemo(10);

        ImmutableClassDemo c2 = c1.modifyValue(10);
        ImmutableClassDemo c3 = c1.modifyValue(20);
        System.out.println(c1==c2);//true
        System.out.println(c1==c3);//false
        System.out.println(c2==c3);//false
        ImmutableClassDemo c4 = c1.modifyValue(10);
        System.out.println(c2==c4);//true
    }
}
