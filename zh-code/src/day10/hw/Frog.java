package day10.hw;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("���ܳ�С��");
    }

    @Override
    public void drink() {
        System.out.println("��ˮ");
    }

    @Override
    public void swim() {
        System.out.println("���ܻ���Ӿ");
    }
}
