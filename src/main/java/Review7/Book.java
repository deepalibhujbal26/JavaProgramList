package Review7;

public class Book {

    String name;  //datatype varaible name
    String author;

    static String type;
    int year;
    double price;
    void read(){ //method no paramebter no return type
        System.out.println("the book "+name+" "+author);
    }
    void changePrice(int newPrice){ //no return type but one parameter
        System.out.println("book price is changes from "+price+"to this "+newPrice);
    }
    double totalTax(double tax){ //return type with one parameter
        double total=price+(price*tax);
        return total;
    }

}
