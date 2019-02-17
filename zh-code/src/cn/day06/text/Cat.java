package cn.day06.text;

public class Cat {
    String color;
    String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color+"色的"+breed+"正在吃老鼠");
    }
    public void catchMouse(){
        System.out.println(color+"色的"+breed+"正在逮鱼");
    }
}
