package Class11;

public class E5MethoChanging {
    public static void main(String[] args) {
        String str="Batch 17 IS GREAT       ";

        System.out.println(str.toLowerCase().trim().replace("GREAT","Good"));
        //we cant used isEmpty in nesting method of string .bcoz it will return boolean value.not as string
    }
}
