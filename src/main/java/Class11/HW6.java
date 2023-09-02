package Class11;

public class HW6 {
    /*
    How would you swap  2 strings without a temporary variable?
     */
    public static void main(String[] args) {
        String name= "Deepali";
        String name2="Bhujbal";
        System.out.println("Before swapping");
        System.out.println("Name 1 : "+ name);
        System.out.println("Name 2 : "+ name2);

//        name=name+name2;
//        name2=name.substring(0,name.length()-name2.length());
//        name=name.substring(name2.length(),name.length());

        name = name + "," + name2;
        name2 = name.split(",")[0];
        name = name.split(",")[1];



        System.out.println("After swapping");
        System.out.println("Name 1 : "+ name);
        System.out.println("Name 2 : "+ name2);


    }
}
