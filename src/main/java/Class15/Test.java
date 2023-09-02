package Class15;

public class Test {

    Test(){
        System.out.println("1");
    }
    Test(int age){
        System.out.println("2");
    }
    Test(String name){
        System.out.println("3");
    }
    Test(String name,int age){
        System.out.println("4");
    }
    Test(int age ,String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        Test t1=new Test("deepali",23);// 4 constructor
        Test t2=new Test(23);//2 constructor

    }

}
