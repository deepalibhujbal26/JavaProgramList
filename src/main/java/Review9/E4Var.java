package Review9;

public class E4Var {

    void print(int ... a){  /// var args
        //int b[]=a;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }



    public static void main(String[] args) {
        E4Var obj=new E4Var();
        obj.print(10,2,345,567,6);
    }
}
