package cn.demo;

public class testPersion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.name="´óÀÏ¶þ";
        persion.setAge(19);

        int a=persion.getAge();
        System.out.println(a);

        persion.show();
    }
}
