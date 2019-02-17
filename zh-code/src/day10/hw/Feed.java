package day10.hw;

public class Feed {
    public void zhaogu(Animal animal){
        animal.drink();
        animal.eat();
        if (animal instanceof Dog){
            Dog dog = new Dog();
            dog.swim();
        }else if(animal instanceof Frog){
            Frog frog = new Frog();
            frog.swim();
        }else if (animal instanceof Sheep){
            Sheep sheep = new Sheep();
            sheep.swim();
        }
    }
}
