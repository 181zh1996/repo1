package day07;

import java.util.Random;
import java.util.Scanner;

public class Rtest {
    public static void main(String[] args) {
        Random r = new Random();
         int a = r.nextInt(1000)+1;
        Scanner s=new Scanner(System.in);

        while (true){
            System.out.println("输入你猜的数字");
            int x = s.nextInt();

            if (x>a){
                System.out.println("大了");
            }else if (a>x){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }
    }
}