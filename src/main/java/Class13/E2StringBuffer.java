package Class13;

public class E2StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb.toString().toUpperCase());
    }
}
