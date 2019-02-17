package cn.demo;

public class Persion {
    String name;
    private int age;

    public void setAge(int num) {
        if (num > 0 && num < 100) {
            age = num;
        } else {
            System.out.println("数据有误");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("我的名字是" + name + "我的年纪是" + age);
    }
}
