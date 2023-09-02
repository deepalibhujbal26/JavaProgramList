package class3;

public class E7IfElseStatement {
    public static void main(String[] args) {
        double accountBalance=1800;
        double price=1000;

        if(accountBalance>=price) // 800 >=1000 condition false so it will run else part
        {
            System.out.println("U can buy this item");
        }
        else
        {
            System.out.println("u need to save more");
        }
    }
}
