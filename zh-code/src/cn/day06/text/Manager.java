package cn.day06.text;

public class Manager {
    String name;
    int gonghao;
    double salary;
    double jiangjin;

    public Manager() {
    }

    public Manager(String name, int gonghao, double gongzi, double jiangjin) {
        this.name = name;
        this.gonghao = gonghao;
        this.salary = gongzi;
        this.jiangjin = jiangjin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGonghao() {
        return gonghao;
    }

    public void setGonghao(int gonghao) {
        this.gonghao = gonghao;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }
    public void work(){
        System.out.println("����Ϊ"+gonghao+"��������Ϊ"+ salary +"����Ϊ"+jiangjin+"����Ŀ����"+name+"����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
    }
}
