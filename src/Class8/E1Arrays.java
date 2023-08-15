package Class8;

public class E1Arrays {
    public static void main(String[] args) {
        char[]names={'A','b','c','F','E','#','@'};
        for (int i = 6; i>=0 ; i--) {
            System.out.println(names[i]);
        }
        System.out.println();
        for (int j=names.length-1;j>=0;j--){  //we have to substract -1 from length of array
            System.out.println(names[j]);
        }
    }
}
