package Review9;

public class E2MethodOverloading {

    private  static void print(){
        System.out.println("hello");
    }
    private  static void print(int a){
        System.out.println("hello int");
    }

    public static void main(String[] args) {
        E2MethodOverloading obj=new E2MethodOverloading();
        print();
        print(0);
    }
}
