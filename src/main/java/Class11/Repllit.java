package Class11;

import java.util.Scanner;

public class Repllit {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        String str="";

        for (int i = givenString.length()-1; i>=0 ; i--) {

            str=str+givenString.charAt(i);
        }
        System.out.println(str);


      }

    }




