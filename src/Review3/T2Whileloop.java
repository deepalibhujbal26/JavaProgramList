package Review3;

public class T2Whileloop {   ///skip 64 and 65 print 62 63 66 67 68 69 70
    public static void main(String[] args) {
        int x=62;
        while(x<=70) {
            if (x!= 64 && x!=65) {
                System.out.print(x + " ");
            }
            x++;
        }
    }
}
