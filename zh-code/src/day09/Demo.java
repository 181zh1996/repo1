package day09;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random r = new Random();

        double i = r.nextInt(5);
        double i1 = r.nextInt(5);
        double i2= r.nextInt(5);
        double i3= r.nextInt(5);
        while (true) {
            if (i + i1 + i2 + i3 == 5) {
                break;
            }
        }
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


    }
}
