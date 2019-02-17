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
        System.out.println("工号为"+gonghao+"基本工资为"+ salary +"奖金为"+jiangjin+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
