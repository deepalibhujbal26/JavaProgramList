package Class17;

public class X {
   int a;
   void print() {
       System.out.println(a);
   }
}
class Y extends X{
    int b;
    void print1(){
        System.out.println(b);
    }
}
class Z extends Y{

    int c;
    void addition(){
        System.out.println(c=a+b);
    }
}



