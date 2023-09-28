package Review8;

public class E3staticvariable {
    public static String country="USA";

    void printName(){ //instance method
        System.out.println(country); //we can accesss static var inside
    }
    static void printCountry(){
        System.out.println(country);
    }

}
class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3staticvariable.country);
    }
}