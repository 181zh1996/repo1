package day07;

import java.util.ArrayList;
import java.util.Random;

public class Arrayfaf {
    public static void main(String[] args) {
        ArrayList<Integer> big = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            big.add(num);
        }
        ArrayList<Integer> samll=getNum(big);
        for (int i =0;i<samll.size();i++){
            int a=samll.get(i);
            System.out.println(a);
        }
        System.out.println("Å¼ÊýÓÐ"+samll.size()+"¸ö");
    }

    public static ArrayList<Integer> getNum(ArrayList<Integer> big) {
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < big.size(); i++) {
            int num = big.get(i);
            if (num%2==0) {
                small.add(num);

            }
        }
        return small;
    }
}