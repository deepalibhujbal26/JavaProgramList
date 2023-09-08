package Review7;

public class BookTester {
    public static void main(String[] args) {

        Book.type="Audio book";

        Book obj=new Book();   // caling cons new is object obj is variable name of book data type
        obj.name="becoming";   //calling name instance variable using an object .
        obj.author="M.Obma";
        obj.price=40;
        obj.year=2018;
        obj.read();
      //  obj.type="hard copy"; you are changing static value .it going to change all

        obj.changePrice(45);
       double total= obj.totalTax(4);
        System.out.println(total);
        System.out.println(Book.type);
    }
}
