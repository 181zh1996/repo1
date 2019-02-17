package day10;

public class YangDongWu {
    public static void main(String[] args) {
        Famer famer=new Famer();
        Dog dog = new Dog();
        famer.feed(dog);

        Cat cat = new Cat();
        famer.feed(cat);
    }
}
