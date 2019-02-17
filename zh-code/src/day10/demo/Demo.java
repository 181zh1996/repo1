package day10.demo;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
          if(animal instanceof Dog){
              Dog dog = (Dog) animal;
              dog.eat();
              dog.watchHome();
          }
          if (animal instanceof Cat){
              Cat cat = (Cat) animal;
              cat.eat();
              cat.cathMouse();
          }
    }
}
