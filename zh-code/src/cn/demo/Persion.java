package cn.demo;

public class Persion {
    String name;
    private int age;

    public void setAge(int num) {
        if (num > 0 && num < 100) {
            age = num;
        } else {
            System.out.println("��������");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("�ҵ�������" + name + "�ҵ������" + age);
    }
}
