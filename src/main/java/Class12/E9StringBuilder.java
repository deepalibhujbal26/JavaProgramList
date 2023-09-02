package Class12;

public class E9StringBuilder {

    /*
    String builder class is mutable.string method is mutable.
    String builder doesn't care about memory.and its fast
    string class is Imutable take a less memory and slow process compare to string builder.

    Stringbuffer class and String Builder both are exact same.

     */
    public static void main(String[] args) {

        String name="Baber";
         name.toLowerCase();
        System.out.println(name);

        StringBuilder sb= new StringBuilder("Sunday");
        sb.reverse();
        System.out.println(sb);

        StringBuffer sf=new StringBuffer("Sunda");
       // sb.reverse();
        sf.reverse();
        System.out.println(sb);

    }
}
