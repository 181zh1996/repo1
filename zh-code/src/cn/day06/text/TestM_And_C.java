package cn.day06.text;

public class TestM_And_C {
    public static void main(String[] args) {
        Manager man = new Manager("�ź�",123,15000.0,6000.0);
        man.work();
        Coder cod = new Coder("С����",135,10000.0);
        cod.work();
       /* Manager man = new Manager();
        man.setName("�ź�");
        man.setGonghao(123);
        man.setSalary(15000.0);
        man.setJiangjin(6000.0);
        man.work();*/
    }
}
