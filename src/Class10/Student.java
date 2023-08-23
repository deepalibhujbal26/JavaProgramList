package Class10;
public class Student {
    String name;
    int age;
    String id;
    void study(){
        System.out.println("Studying 16 hours a day");
    }
    public static void main(String[] args) {
        Student ehabobj= new Student();
        ehabobj.name="Ehab";
        ehabobj.age=23;
        ehabobj.id="123abc";
        ehabobj.study();

        Student habibojb= new Student();
        habibojb.name="Habib";
        habibojb.id="123abc";
        habibojb.age=34;
        habibojb.study();
    }
}

