package day09;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Double> list){
        int index = new Random().nextInt(list.size());

        Double delta = list.remove(index);

        double money = super.getMoney();

        super.setMoney(money+delta);
    }
}
