package Class16;

public class Book {

    private String name;
    private String authorName;
    private int noOfPage;
    private double price;

   public  Book(String name,String authorName) {
        this.name=name;
        this.authorName=authorName;
    }

   public Book(String name,String authorName,int  noOfPage,double price){

       this(name,authorName);
        this.noOfPage=noOfPage;
        this.price=price;
    }

    void printInfo(){
        System.out.println("Book Details........");
        System.out.println("Book name :"+name);
        System.out.println("Author name : "+authorName);
        System.out.println("Total no of pages : "+noOfPage);
        System.out.println("Price of the book : "+ price);
    }

    public static void main(String[] args) {
       Book b1=new Book("Becoming","M.Obama");
        b1.printInfo();
        System.out.println();
        Book b2=new Book("Introduction to java ","Balaguruswamy",150,40);
        b2.printInfo();


    }


}
