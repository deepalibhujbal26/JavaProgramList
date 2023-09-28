package Class25;

import java.util.LinkedList;

public class Cat {
    private String catName;
    private String carBreed;
    private int age;

    public Cat(String catName, String carBreed, int age) {
        this.catName = catName;
        this.carBreed = carBreed;
        this.age = age;
    }

    public String getName(){

        return catName;

    }

    public void printInfo() {
        System.out.println("Cat Name  : " + catName + " " + "Cat Bread : " + carBreed + " " + " Age : " + age);
    }
}

class CatTester {
    public static void main(String[] args) {

        LinkedList<Cat> cat = new LinkedList<>();
        cat.add(new Cat("SWEETY", "Grey", 5));
        cat.add(new Cat("Chinu", "Black", 2));
        cat.add(new Cat("Manny", "White", 4));
        for (Cat a : cat) {
            a.printInfo();
        }
        //OR to print

        cat.forEach(x-> System.out.println(x.getName()));
      //  cat.forEach(x -> x.printInfo());


    }
}


