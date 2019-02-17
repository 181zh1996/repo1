package cn.day06.text;

public class TestC_D {
    public static void main(String[] args) {
        Cat cat = new Cat("乳白","汤姆猫");
        cat.eat();
        cat.catchMouse();
        Dog dog = new Dog("土豪金","大金毛");
        dog.eat();
        dog.lookHome();
    }
}
