package Class7;

public class T3nestedwhile {
    public static void main(String[] args) {
        int i=0;
        while (i<4) {
            for(int j=1;j<7;j++){
                if(j!=3) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            i++;
        }
    }
}
