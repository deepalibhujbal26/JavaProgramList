package Class21;

public class FIleTester {
    public static void main(String[] args) {
        File [] arr={new JavaFile("abstract.java","10kb"),
                new WordFile("Java.doc","20 kb"),
        new PdfFile("adobe.pdf","20 kb")};
        for (File a: arr ) {
            a.open();
            a.Edit();
            a.close();

        }
    }
}
