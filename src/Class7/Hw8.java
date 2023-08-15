package Class7;

import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {

     /*   char[] value = {'i', 'l', 'a', 'p', 'e', 'e', 'D'};
        for (int i = 6; i >=0 ; i--) {      //Reverse the char     Static
            System.out.print(value[i]+" ");
        } */

        char[] alphabet= new char[7];      //Reverse the char using scanner dynamic
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character 7");
        for(int i=0;i<alphabet.length;i++){
            alphabet[i]=scanner.next().charAt(0);
        }
        System.out.println(alphabet);

        for(int j=alphabet.length-1;j>=0;j--){
            System.out.print(alphabet[j]+" ");
        }
    }
}
