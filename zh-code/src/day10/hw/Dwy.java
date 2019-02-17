package day10.hw;

import day10.Famer;

public class Dwy {
    public static void main(String[] args) {
        Feed feed = new Feed();
        Dog dog = new Dog();
        feed.zhaogu(dog);
        System.out.println();

        Frog frog = new Frog();
        feed.zhaogu(frog);
        System.out.println();

        Sheep sheep = new Sheep();
        feed.zhaogu(sheep);
    }
}
