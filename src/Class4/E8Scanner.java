package Class4;
import java.util.Scanner;
public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Please enter your name");
        if(name.equals("Jamel"))
        {
            System.out.println("Senior SDET in 2 years");
        }
        else if(name.equals("habibi"))
        {
            System.out.println("Jailed my wife");
        }
        else if(name.equals("Deepali")){
            System.out.println("i love java");
        }
        else if (name.equals("laura"))
        {
            System.out.println("Stop dad Jokes");
        }

    }
}
