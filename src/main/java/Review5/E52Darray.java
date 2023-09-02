package Review5;

import java.util.Arrays;

public class E52Darray {
    // int [][] array=new int[2][4];
    public static void main(String[] args) {



    String[][] countries = {
            {"Canada", "USA"},
            {"Ecuador", "Brazil", "CHile", "Argentia"},
            {"Romania", "France", "Italy"}

    };

    for(String[] country :countries){
        for(String colcountry :country){
            System.out.println(colcountry);
            System.out.println(Arrays.deepToString(countries));
        }
    }


    }

}

