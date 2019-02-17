package day10.hw;

public abstract class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void drink();
}
