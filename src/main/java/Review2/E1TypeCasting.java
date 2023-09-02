package Review2;

public class E1TypeCasting {

    public static void main(String[] args) {
        int a=13;
        double b=a; ///auto// Implicit type casting its automatcially will get change
        System.out.println(b);

        double number=123.45;
        int number1=(int)number; //Explicit type Casting ..its Manual ..Coder needs to change the typr
        float number2= number1;
        System.out.println(number2);

      //  boolean number3=(booloean)12;   Cant do for boolean value

        char c=(char)12; // its int to char.. large to small Explicit Type Casting ##ASCII TABLE##
        System.out.println(c);
     //   String nanne=(String)c;
        // ****TYPE CASTING DONE WITH PRIMITIVE TYPES ONLY ..NOT WITH STRING


    }
}
