package Class11;

public class T1String {
    public static void main(String[] args) {

        String str = "Deepali";


        if (str.length() % 2 != 0 && str.length() > 3) {
            System.out.println("yes it contains more than 3  :" + str);
            int value = str.length() / 2;
            System.out.println(str.charAt(value));
        }
    }
}




