package Class17;

public class E {
    static void printF(){
        System.out.println("its static method");
    }
}

class F extends E{
    public static void main(String[] args) {
        printF();
    }

}

