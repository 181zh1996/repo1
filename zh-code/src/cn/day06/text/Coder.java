package cn.day06.text;

public class Coder {
    String name;
    int id;
    double salary;

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���......");
    }
}
