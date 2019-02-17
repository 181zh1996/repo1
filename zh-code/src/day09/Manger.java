package day09;

import java.util.ArrayList;
import java.util.Random;

public class Manger extends User {
    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

   public ArrayList<Double> send (double totaMoney,int count){
        ArrayList<Double> list = new ArrayList<>();

       double leftMoney=super.getMoney();
        if (totaMoney>leftMoney){
            System.out.println("Óà¶î²»×ã");
            return list;
        }
        super.setMoney(leftMoney-totaMoney);
       /*Random r = new Random();
        double x =r.(totaMoney);*/
               double avg = totaMoney / count;


       for (int i = 0; i < count; i++) {
           list.add(avg);
       }

       return list;
   }
}
