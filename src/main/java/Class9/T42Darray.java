package Class9;

import java.util.Arrays;

public class T42Darray {
    public static void main(String[] args) { ///Using Enhanced For loop to print 2D array

       String[][] cars= {{"Ford", "Cadillac", "Jeep", "Tesla"},
        {"BMW", "Audi", "Mercedes", "Volkwagen"},
        {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
        {"Ferrari", "Lamborghini", "Maserati", "Fiat"}};

        for(String []car :cars){
           for (String variety :car){
               System.out.print(variety+" ");
           }
           System.out.println();
       }

        for(int i=0;i<cars.length;i++){
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(cars)); /// print all 2D array
}
}

