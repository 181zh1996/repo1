package day10.hw;

public class Dog extends Animal implements Swim {

    @Override
    public void swim() {
        System.out.println("���ṷ����Ӿ");
    }

    @Override
    public void eat() {
        System.out.println("���й�ͷ");
    }

    @Override
    public void drink() {
        System.out.println("��ˮ");
    }
}
