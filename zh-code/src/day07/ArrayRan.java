package day07;

import java.util.ArrayList;
import java.util.Random;

public class ArrayRan {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            int a = r.nextInt(6) + 1;
            if (a!=6){
                continue;
            }
            list.add(a);
        }
        for (int j=0;j<list.size();j++){
            int num=list.get(j);
            System.out.print(num+"  ");
        }
    }
}
