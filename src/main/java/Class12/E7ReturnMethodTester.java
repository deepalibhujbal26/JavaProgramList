package Class12;

public class E7ReturnMethodTester {
    public static void main(String[] args) {
        E7ReturnMethod obj=new E7ReturnMethod();

        int answer=obj.islarger(23,45);
        System.out.println("Larger value is "+answer);

        //or directly print the value
        System.out.println(obj.islarger(34,56));
    }
}
