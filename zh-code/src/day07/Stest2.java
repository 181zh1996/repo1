package day07;

import java.util.Scanner;

public class Stest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2=sc.nextInt();
        System.out.println("请输入第三个数字");
        int num3=sc.nextInt();

        int temp=num1>num2?num1:num2;
        int max = temp>num3?temp:num3;
        System.out.println("这三个数的最大数是="+max);
    }
}
