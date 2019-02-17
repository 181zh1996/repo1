package cn.day06.zixi;

public class TextP {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setHeight(1.78);
        p.setWeigh(65);
        p.showBMI();

        Person p1 = new Person("小秋",1.72,72);
        Person p2 = new Person("小红",1.58,44);
        Person p3 = new Person("小白",1.80,55);

        Person[] arrPerson = {p1,p2,p3};
        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i].getName().equals("小白")){
                arrPerson[i].setWeigh(65);
            }
        }
            p3.showBMI();
    }
}
