package day07;

import java.util.Random;
import java.util.Scanner;

public class Rtest {
    public static void main(String[] args) {
        Random r = new Random();
         int a = r.nextInt(1000)+1;
        Scanner s=new Scanner(System.in);

        while (true){
            System.out.println("������µ�����");
            int x = s.nextInt();

            if (x>a){
                System.out.println("����");
            }else if (a>x){
                System.out.println("С��");
            }else{
                System.out.println("������");
                break;
            }
        }
    }
}