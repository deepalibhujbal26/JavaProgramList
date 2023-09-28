package Review9;

public class E3MethodOverloading {




    int print(int a){
        return a;

    }
    public String print(String name){
        return name;
    }

    public static void main(String[] args) {
        E3MethodOverloading obj =new E3MethodOverloading();
      //  System.out.println(obj.print(1));
        System.out.println(obj.print("name"));

    }
}
