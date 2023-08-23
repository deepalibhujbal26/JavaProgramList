package Class10;

public class E9StringDemo {
    public static void main(String[] args) {
        String str="Today is a java Class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.startsWith("Today"));  //all methods will return answer in true or false

        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));

    }
}
