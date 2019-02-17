package cn.demo;

public class test6 {
    public static void main(String[] args) {
        Student stu= new Student();
        stu.name="¹·¶ù×Ó";
        stu.age=67;
        stu.sex="ÄÐ";
        System.out.println(stu.name);
        System.out.println(stu.sex);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
        stu.play();
    }
}
