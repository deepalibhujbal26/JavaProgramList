package Class9;

public class E82Darray {
    public static void main(String[] args) { ///Using Enhanced For loop to print 2D array
        int [][] numbers={{10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}
        };

        for(int[]row :numbers)
        {
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}

