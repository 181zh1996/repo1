package cn.day06.zixi;

public class TextP {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("����");
        p.setHeight(1.78);
        p.setWeigh(65);
        p.showBMI();

        Person p1 = new Person("С��",1.72,72);
        Person p2 = new Person("С��",1.58,44);
        Person p3 = new Person("С��",1.80,55);

        Person[] arrPerson = {p1,p2,p3};
        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i].getName().equals("С��")){
                arrPerson[i].setWeigh(65);
            }
        }
            p3.showBMI();
    }
}
