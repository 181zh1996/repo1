package day09;

public class User {
    private String name;
    private double money;
    public void show(){
        System.out.println("�ҵ������ǣ�"+name+" �ҵ������"+money);
    }
    public User(){
    }
    public User(String name,int money){
        this.name=name;
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
