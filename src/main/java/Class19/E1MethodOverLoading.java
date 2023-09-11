package Class19;

public class E1MethodOverLoading {

    public static void main(String[] args) {
        add(2,3);
        add(2,3,4);

    }

    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b;
    }

}
