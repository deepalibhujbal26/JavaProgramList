package Class26;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name,
                  String lastName,
                  int age,
                  double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }
    void print() {
        System.out.println(name + " " + lastName + " " + age + " " +
                salary);
        //  return false;
    }

}
