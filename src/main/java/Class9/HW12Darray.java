package Class9;

public class HW12Darray {
    public static void main(String[] args) {

        String[][] Grocery = {{"Carrot", "Potato", "GreenPeas", "Cucumber"},
                {"Apple", "Banana", "Mango", "Plum"},
                {"Milk", "Yogurt", "Cheese", "Icecream"},
                {"Choclate", "Caramel", "Cake", "Muffins"}
        };
        System.out.println("**** Grocery List ***");
        for (int i = 0; i < Grocery.length; i++) {
            for (int j = 0; j < Grocery[i].length; j++) {
                System.out.print(Grocery[i][j] + " ");
            }
            System.out.println();
        }
    }
}
