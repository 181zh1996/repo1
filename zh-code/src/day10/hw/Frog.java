package day10.hw;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("青蛙吃小虫");
    }

    @Override
    public void drink() {
        System.out.println("喝水");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }
}
