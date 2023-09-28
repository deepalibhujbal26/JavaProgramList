package Class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {


        int a=10;
        Integer number=new Integer(a);/// converting from primitive to class Boxing
        int d=number.intValue();   //converting from a class to primitive Unboxing
        System.out.println(d);

        //Shorter way

        Integer c=10;    //Auto  Boxing

        int f=c;     //AUTO  unboxing
        System.out.println(f);

    }


}
