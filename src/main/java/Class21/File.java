package Class21;
/*
Create a class File that will have the following behaviors: open(), edit(),
close() and fields like name and size. Edit and close are implemented method
while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that
will provide specific implementation of open behaviour: Example: to open .java file
we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a
 tester class and call all of the methods from these classes.
 */

public abstract class File {
   private String name;
  private   String size;

    abstract void open();

    public File(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void Edit() {
        System.out.println("Edit the " + name + " " + " file Size is " + size + " ");
    }

    public void close() {
        System.out.println("Close the " + name);
    }
}

class JavaFile extends File {

    @Override
    void open() {
        System.out.println("Open the notepad file");

    }

    public JavaFile(String name, String size) {
        super(name, size);
    }
}

class WordFile extends File {

    public WordFile(String name, String size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("Open word file we need Microsoft");
    }



}

class PdfFile extends File {

    public PdfFile(String name, String size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("Open Pdf file we need Adobe Reader");
    }

}
