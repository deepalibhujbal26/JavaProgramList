package Class22;

public interface MoveAble {

    void move();
    void method1();

    void wash();
}

interface WashAble {
    void wash();
}

class Dog implements MoveAble, WashAble {

    @Override
    public void move() {
        System.out.println("Dogs can jump run and can move");

    }

    @Override
    public void method1() {

    }

    @Override
    public void wash() {
        System.out.println("you can safely wash a dog");
    }
}

class Car implements MoveAble, WashAble {
    @Override
    public void move() {
        System.out.println("Car can move forword backwords and can go in circle");
    }

    @Override
    public void method1() {

    }

    @Override
    public void wash() {
        System.out.println("We can wash car");
    }
}