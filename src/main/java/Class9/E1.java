package Class9;

import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {
        String[][]names=
                {       {"Hind","Mikhail","Ismael","Ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Joke","Laugh","ritvi","Deepali"},
                        {"Pushpa","Pallavi","Uma","USha"}
                };

       // System.out.println(names[2][2]); //ritvi
       // System.out.println(names[1][3]);  //tamim

         String[]firstRow=names[2];  //it will return complete first row

       // System.out.println(firstRow[1]);    // first row second col  Mikhail

        System.out.println(Arrays.toString(firstRow));
        for(String name : firstRow){
            System.out.println(name);   //it will return 3rd Row
        }

        }
    }

