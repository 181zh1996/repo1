package day07;

import java.util.Scanner;

public class Stest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("�������һ������");
        int num1=sc.nextInt();
        System.out.println("������ڶ�������");
        int num2=sc.nextInt();
        System.out.println("���������������");
        int num3=sc.nextInt();

        int temp=num1>num2?num1:num2;
        int max = temp>num3?temp:num3;
        System.out.println("�����������������="+max);
    }
}
