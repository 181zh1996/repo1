package cn.day06.zixi;

public class Person {
   private String name;
   private double height;
   private int weigh;

    public Person() {
    }

    public Person(String name, double height, int weigh) {
        this.name = name;
        this.height = height;
        this.weigh = weigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
    public void showBMI(){
        System.out.println(name+"的身高是"+height+"，体重是"+weigh+"，体脂指数是"+weigh / (height * height)+"。");
    }
}
