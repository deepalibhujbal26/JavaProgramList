package Class6;

import java.util.Scanner;

public class E11Dowhileloo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
        do{
            System.out.println("please enter no and -1 to terminate");
            input=scanner.nextInt();
            System.out.println("you have enetred"+input);

        }
        while(input!=-1);
    }
}
