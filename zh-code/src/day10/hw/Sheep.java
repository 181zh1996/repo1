package day10.hw;

public class Sheep extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("��в�");
    }

    @Override
    public void drink() {
        System.out.println("��ˮ");
    }

    @Override
    public void swim() {

    }
}
